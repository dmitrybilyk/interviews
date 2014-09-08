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
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.ScheduledCommand;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.i18n.client.DateTimeFormat.PredefinedFormat;
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
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.FramedPanel;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData;
import com.sencha.gxt.widget.core.client.event.RefreshEvent;
import com.sencha.gxt.widget.core.client.form.CheckBox;
import com.sencha.gxt.widget.core.client.grid.CheckBoxSelectionModel;
import com.sencha.gxt.widget.core.client.grid.ColumnConfig;
import com.sencha.gxt.widget.core.client.grid.ColumnModel;
import com.sencha.gxt.widget.core.client.grid.Grid;
import com.sencha.gxt.widget.core.client.toolbar.PagingToolBar;

@Detail(name = "Paging Grid", icon = "paginggrid", category = "Grid", classes = {Post.class, PostProperties.class, ExampleService.class, ExampleServiceAsync.class})
public class PagingGridExample implements IsWidget, EntryPoint {

  private ContentPanel panel;

  @Override
  public void onModuleLoad() {
    RootPanel.get().add(this);
  }

  @Override
  public Widget asWidget() {
    if (panel == null) {
      final ExampleServiceAsync service = GWT.create(ExampleService.class);

      RpcProxy<PagingLoadConfig, PagingLoadResult<Post>> proxy = new RpcProxy<PagingLoadConfig, PagingLoadResult<Post>>() {
        @Override
        public void load(PagingLoadConfig loadConfig, AsyncCallback<PagingLoadResult<Post>> callback) {
          service.getPosts(loadConfig, callback);
        }
      };

      PostProperties props = GWT.create(PostProperties.class);

      ListStore<Post> store = new ListStore<Post>(new ModelKeyProvider<Post>() {
        @Override
        public String getKey(Post item) {
          return "" + item.getId();
        }
      });

      final PagingLoader<PagingLoadConfig, PagingLoadResult<Post>> loader = new PagingLoader<PagingLoadConfig, PagingLoadResult<Post>>(
          proxy);
      loader.setRemoteSort(true);
      loader.addLoadHandler(new LoadResultListStoreBinding<PagingLoadConfig, Post, PagingLoadResult<Post>>(store));

      final PagingToolBar toolBar = new PagingToolBar(50);
      toolBar.getElement().getStyle().setProperty("borderBottom", "none");
      toolBar.bind(loader);

      IdentityValueProvider<Post> identity = new IdentityValueProvider<Post>();
      final CheckBoxSelectionModel<Post> sm = new CheckBoxSelectionModel<Post>(identity) {
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

      ColumnModel<Post> cm = new ColumnModel<Post>(l);

      Grid<Post> grid = new Grid<Post>(store, cm) {
        @Override
        protected void onAfterFirstAttach() {
          super.onAfterFirstAttach();
          Scheduler.get().scheduleDeferred(new ScheduledCommand() {
            @Override
            public void execute() {
              loader.load();
            }
          });
        }
      };
      grid.setSelectionModel(sm);
      grid.getView().setForceFit(true);
      grid.setLoadMask(true);
      grid.setLoader(loader);
      grid.setColumnReordering(true);

      panel = new FramedPanel();
      panel.setCollapsible(true);
      panel.setHeadingText("Paging Grid Example");
      panel.setPixelSize(500, 400);
      panel.addStyleName("margin-10");

      VerticalLayoutContainer con = new VerticalLayoutContainer();
      con.setBorders(true);
      con.add(grid, new VerticalLayoutData(1, 1));
      con.add(toolBar, new VerticalLayoutData(1, -1));
      final CheckBox warnLoad = new CheckBox();
      warnLoad.setBoxLabel("Warn before loading new data");
      warnLoad.setValue(false);
      con.add(warnLoad, new VerticalLayoutData(-1,-1));

      // If the warn checkbox is active, then present a warning and stop any load
      // after the first if the user clicks cancel
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

      panel.setWidget(con);

    }

    return panel;
  }

}
