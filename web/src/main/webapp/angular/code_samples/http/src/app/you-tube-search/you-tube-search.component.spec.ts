import {
  async,
  fakeAsync,
  inject,
  ComponentFixture,
  TestBed,
  tick
} from '@angular/core/testing';
import { MockBackend } from '@angular/http/testing';
import {
  Http,
  ConnectionBackend,
  BaseRequestOptions,
  Response
} from '@angular/http';

import { YouTubeSearchComponent } from './you-tube-search.component';
import { SearchResultComponent } from './search-result.component';
import { SearchBoxComponent } from './search-box.component';
import {
  YOUTUBE_API_KEY,
  YOUTUBE_API_URL,
  YouTubeSearchService
} from './you-tube-search.service';

const defaultResponse = {
  'items': [
    {
      'id': { 'videoId': 'VIDEO_ID' },
      'snippet': {
        'title': 'TITLE',
        'description': 'DESCRIPTION',
        'thumbnails': {
          'high': { 'url': 'THUMBNAIL_URL' }
        }
      }
    }
  ]
};

describe('YouTubeSearchComponent', () => {
  let component: YouTubeSearchComponent;
  let fixture: ComponentFixture<YouTubeSearchComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [
        YouTubeSearchComponent,
        SearchResultComponent,
        SearchBoxComponent
      ],
      providers: [
        YouTubeSearchService,
        BaseRequestOptions,
        MockBackend,
        { provide: YOUTUBE_API_KEY, useValue: 'YOUTUBE_API_KEY' },
        { provide: YOUTUBE_API_URL, useValue: 'YOUTUBE_API_URL' },
        { provide: Http,
          useFactory: (backend: ConnectionBackend,
                       defaultOptions: BaseRequestOptions) => {
                         return new Http(backend, defaultOptions);
                       }, deps: [MockBackend, BaseRequestOptions] }
      ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(YouTubeSearchComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  describe('search', () => {
    function search(term: string, response: any, callback) {
      return inject([YouTubeSearchService, MockBackend],
        fakeAsync((service, backend) => {
          let req;
          let res;

          backend.connections.subscribe(c => {
            req = c.request;
            c.mockRespond(new Response(<any>{body: response}));
          });

          service.search(term).subscribe(_res => {
            res = _res;
          });
          tick();

          callback(req, res);
        })
      );
    }

    it('parses YouTube video id',
      search('hey', defaultResponse, (req, res) => {
        const video = res[0];
        expect(video.id).toEqual('VIDEO_ID');
    }));

    it('parses YouTube video title',
      search('hey', defaultResponse, (req, res) => {
        const video = res[0];
        expect(video.title).toEqual('TITLE');
    }));

    it('parses YouTube video description',
      search('hey', defaultResponse, (req, res) => {
        const video = res[0];
        expect(video.description).toEqual('DESCRIPTION');
    }));

    it('parses YouTube video thumbnail',
      search('hey', defaultResponse, (req, res) => {
        const video = res[0];
        expect(video.description).toEqual('DESCRIPTION');
    }));

    it('sends the query',
      search('term', defaultResponse, (req, res) => {
        expect(req.url).toContain('q=term');
    }));

    it('sends the API key',
      search('term', defaultResponse, (req, res) => {
        expect(req.url).toContain('key=YOUTUBE_API_KEY');
    }));

    it('uses the provided YouTube URL',
      search('term', defaultResponse, (req, res) => {
        expect(req.url).toMatch(/^YOUTUBE_API_URL\?/);
    }));
  });

});
