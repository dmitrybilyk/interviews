/**
 * Sencha GXT 3.1.0 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package com.sencha.gxt.explorer.client.grid;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gwt.cell.client.DateCell;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.i18n.client.DateTimeFormat.PredefinedFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.IdentityValueProvider;
import com.sencha.gxt.data.client.loader.RpcProxy;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.loader.BeforeLoadEvent;
import com.sencha.gxt.data.shared.loader.BeforeLoadEvent.BeforeLoadHandler;
import com.sencha.gxt.data.shared.loader.LoadResultListStoreBinding;
import com.sencha.gxt.data.shared.loader.PagingLoadConfig;
import com.sencha.gxt.data.shared.loader.PagingLoadResult;
import com.sencha.gxt.data.shared.loader.PagingLoader;
import com.sencha.gxt.examples.resources.client.ExampleService;
import com.sencha.gxt.examples.resources.client.ExampleServiceAsync;
import com.sencha.gxt.examples.resources.client.model.Post;
import com.sencha.gxt.examples.resources.client.model.PostProperties;
import com.sencha.gxt.explorer.client.model.Example.Detail;
import com.sencha.gxt.widget.core.client.event.RefreshEvent;
import com.sencha.gxt.widget.core.client.form.CheckBox;
import com.sencha.gxt.widget.core.client.grid.CheckBoxSelectionModel;
import com.sencha.gxt.widget.core.client.grid.ColumnConfig;
import com.sencha.gxt.widget.core.client.grid.ColumnModel;
import com.sencha.gxt.widget.core.client.grid.Grid;
import com.sencha.gxt.widget.core.client.grid.GridView;
import com.sencha.gxt.widget.core.client.toolbar.PagingToolBar;

@Detail(name = "Paging Grid (UiBinder)", icon = "paginguibinder", category = "Grid", classes = {Post.class, PostProperties.class, ExampleService.class, ExampleServiceAsync.class}, files = "PagingGridUiBinderExample.ui.xml")
public class PagingGridUiBinderExample implements IsWidget, EntryPoint {
  interface MyUiBinder extends UiBinder<Widget, PagingGridUiBinderExample> {
  }

  private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

  @UiField(provided = true)
  ColumnModel<Post> cm;

  @UiField(provided = true)
  CheckBoxSelectionModel<Post> sm;

  @UiField(provided = true)
  ListStore<Post> store;

  @UiField(provided = true)
  PagingLoader<PagingLoadConfig, PagingLoadResult<Post>> loader;

  @UiField
  Grid<Post> grid;

  @UiField
  GridView<Post> view;

  @UiField
  PagingToolBar toolBar;

  @UiField
  CheckBox warnLoad;

  private Widget component;

  @Override
  public void onModuleLoad() {
    RootPanel.get().add(this);
  }

  @Override
  public Widget asWidget() {
    if (component == null) {
      final ExampleServiceAsync service = GWT.create(ExampleService.class);

      RpcProxy<PagingLoadConfig, PagingLoadResult<Post>> proxy = new RpcProxy<PagingLoadConfig, PagingLoadResult<Post>>() {
        @Override
        public void load(PagingLoadConfig loadConfig, AsyncCallback<PagingLoadResult<Post>> callback) {
          service.getPosts(loadConfig, callback);
        }
      };

      PostProperties props = GWT.create(PostProperties.class);

      store = new ListStore<Post>(new ModelKeyProvider<Post>() {
        @Override
        public String getKey(Post item) {
          return "" + item.getId();
        }
      });

      loader = new PagingLoader<PagingLoadConfig, PagingLoadResult<Post>>(proxy);
      loader.setRemoteSort(true);
      loader.addLoadHandler(new LoadResultListStoreBinding<PagingLoadConfig, Post, PagingLoadResult<Post>>(store));
      loader.addBeforeLoadHandler(new BeforeLoadHandler<PagingLoadConfig>() {
        boolean initialLoad = true;
        @Override
        public void onBeforeLoad(BeforeLoadEvent<PagingLoadConfig> event) {
          if (!initialLoad && warnLoad.getValue()) {
            event.setCancelled(!Window.confirm("Are you sure you want to do that?"));
          }
          initialLoad = false;
        }
      });

      IdentityValueProvider<Post> identity = new IdentityValueProvider<Post>();
      sm = new CheckBoxSelectionModel<Post>(identity) {
        @Override
        protected void onRefresh(RefreshEvent event) {
          // this code selects all rows when paging if the header checkbox is selected
          if (isSelectAllChecked()) {
            selectAll();
          }
          super.onRefresh(event);
        }
      };
      ColumnConfig<Post, String> forumColumn = new ColumnConfig<Post, String>(props.forum(), 150, "Forum");
      ColumnConfig<Post, String> usernameColumn = new ColumnConfig<Post, String>(props.username(), 150, "Username");
      ColumnConfig<Post, String> subjectColumn = new ColumnConfig<Post, String>(props.subject(), 150, "Subject");
      ColumnConfig<Post, Date> dateColumn = new ColumnConfig<Post, Date>(props.date(), 150, "Date");
      dateColumn.setCell(new DateCell(DateTimeFormat.getFormat(PredefinedFormat.DATE_SHORT)));

      List<ColumnConfig<Post, ?>> l = new ArrayList<ColumnConfig<Post, ?>>();
      l.add(sm.getColumn());
      l.add(forumColumn);
      l.add(usernameColumn);
      l.add(subjectColumn);
      l.add(dateColumn);

      cm = new ColumnModel<Post>(l);

      component = uiBinder.createAndBindUi(this);


      Timer t = new Timer() {

        @Override
        public void run() {
          loader.load();
        }
      };
      t.schedule(100);

      toolBar.getElement().getStyle().setProperty("borderBottom", "none");
      toolBar.bind(loader);
    }

    return component;
  }
}
