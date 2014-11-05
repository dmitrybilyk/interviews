package toknow.nikita.duplicate;

import com.extjs.gxt.ui.client.Style;
import com.extjs.gxt.ui.client.data.BaseTreeLoader;
import com.extjs.gxt.ui.client.data.BaseTreeModel;
import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.data.ModelIconProvider;
import com.extjs.gxt.ui.client.data.ModelKeyProvider;
import com.extjs.gxt.ui.client.data.TreeLoader;
import com.extjs.gxt.ui.client.data.TreeModel;
import com.extjs.gxt.ui.client.data.TreeModelReader;
import com.extjs.gxt.ui.client.event.BaseEvent;
import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.event.SelectionChangedEvent;
import com.extjs.gxt.ui.client.event.SelectionChangedListener;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.event.TreePanelEvent;
import com.extjs.gxt.ui.client.store.Store;
import com.extjs.gxt.ui.client.store.TreeStore;
import com.extjs.gxt.ui.client.util.IconHelper;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.WidgetComponent;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.form.StoreFilterField;
import com.extjs.gxt.ui.client.widget.layout.FitLayout;
import com.extjs.gxt.ui.client.widget.toolbar.ToolBar;
import com.extjs.gxt.ui.client.widget.treepanel.TreePanel;
import com.google.gwt.user.client.ui.AbstractImagePrototype;
import com.google.gwt.user.client.ui.Image;

import java.util.Collections;

/** @author Stanislav Valenta, 26.5.2009 */
public class NavigationPanel extends ContentPanel {


  public NavigationPanel(TreeModel model) {
    this.setId(ObjectIds.NAVIGATIONPANEL_ID);
    this.head.setId(ObjectIds.NAVIGATIONPANEL_HEAD_ID);

    TreePanel<ModelData> navigationTree = createTree(model);
    addNavigationTreeListeners(navigationTree);

    StoreFilterField<ModelData> navigationFilter = createStoreFilter(navigationTree);
    navigationFilter.setId(ObjectIds.NAVIGATIONPANEL_NAVIGATION_FILTER_ID);
    ToolBar navigationToolBar = new ToolBar();
    navigationToolBar.setId(ObjectIds.NAVIGATIONPANEL_NAVIGATION_TOOL_BAR_ID);
    navigationToolBar.add(new WidgetComponent(new Image("resources/images/fam/magnifier.png")));
    navigationToolBar.add(navigationFilter);

    Button expandButton = new Button();
    expandButton.setIconStyle("icon-expand-all");
    // use //table[@id='NavigationPanel_ExpandAllButton']/descendant::button to access to it in selenium
    expandButton.setId(ObjectIds.NAVIGATIONPANEL_EXPAND_ALL_BUTTON_ID);

    Button collapseButton = new Button();
    collapseButton.setIconStyle("icon-collapse-all");
    collapseButton.setId(ObjectIds.NAVIGATIONPANEL_COLLAPSE_ALL_BUTTON_ID);

    addButtonListeners(expandButton, collapseButton, navigationTree);

    navigationToolBar.add(expandButton);
    navigationToolBar.add(collapseButton);
    setTopComponent(navigationToolBar);
    setScrollMode(Style.Scroll.AUTO);
    setLayout(new FitLayout());
    add(navigationTree);
  }


  private StoreFilterField<ModelData> createStoreFilter(TreePanel<ModelData> navigationTree) {
    final StoreFilterField<ModelData> filter = new StoreFilterField<ModelData>() {
      @Override
      protected boolean doSelect(Store store, ModelData parent, ModelData record, String property, String filter) {
        String name = record.get(NavigationTreeNode.NAME);
        name = name.toLowerCase();
        boolean isLeaf = true;
        if (record instanceof BaseTreeModel) {
          isLeaf = ((BaseTreeModel) record).getChildCount() <= 0;
        }
        return isLeaf && name.contains(filter.toLowerCase());
      }

    };
    filter.bind(navigationTree.getStore());
    filter.setHideTrigger(true);
    filter.setStyleName("navigation-filter");
    return filter;
  }


  private TreePanel<ModelData> createTree(TreeModel model) {
    TreeLoader<ModelData> treeLoader = new BaseTreeLoader<ModelData>(new TreeModelReader());
    treeLoader.addLoadListener(new ScorecardLoadListener());
    TreeStore<ModelData> store = new TreeStore<ModelData>(treeLoader);
    store.setKeyProvider(new ModelKeyProvider<ModelData>() {
//      @Override
      public String getKey(ModelData model) {
        return model.get(NavigationTreeNode.ID);
      }
    });

    final TreePanel<ModelData> navigationTree = new TreePanel<ModelData>(store);
    navigationTree.setId(ObjectIds.NAVIGATIONPANEL_NAVIGATION_TREE_ID);
    navigationTree.setDisplayProperty(NavigationTreeNode.NAME);
    store.setMonitorChanges(true);
    treeLoader.load(model);
    return navigationTree;
  }

  private void addButtonListeners(final Button expandButton, final Button collapseButton, final TreePanel<ModelData> treePanel) {
    expandButton.addSelectionListener(new SelectionListener<ButtonEvent>() {
      @Override
      public void componentSelected(ButtonEvent ce) {
        treePanel.expandAll();
      }
    });
    collapseButton.addSelectionListener(new SelectionListener<ButtonEvent>() {
      @Override
      public void componentSelected(ButtonEvent ce) {
        treePanel.collapseAll();
      }
    });
  }

  private void addNavigationTreeListeners(final TreePanel<ModelData> treePanel) {
    treePanel.setIconProvider(new ModelIconProvider<ModelData>() {
//      @Override
      public AbstractImagePrototype getIcon(ModelData model) {
        if (model.get(NavigationTreeNode.ICON) != null) {
          return IconHelper.create(model.<String>get(NavigationTreeNode.ICON));
        }

        // return null for everything that has no specific icon
        // when null is returned, gxt will use the default icon for each case
        return null;
      }
    });

//    treePanel.addListener(Events.OnClick, new Listener<TreePanelEvent<ModelData>>() {
//      @Override
//      public void handleEvent(TreePanelEvent<ModelData> event) {
//        ModelData selectedItem = event.getItem();
//        if (selectedItem != null) {
//          CcGroupBO group = selectedItem.get(GuiFactoryImpl.GroupsData.GROUP);
//          UsersByGroupPanel panel = selectedItem.get(GuiFactoryImpl.GroupsData.PANEL);
//          if (group != null && panel != null) {
//            panel.setGroup(group);
//          }
//          TabManager tabManager = (TabManager) selectedItem.get(NavigationTreeNode.VALUE);
//          tabManager.displayTab();
//        }
//      }
//    });

    treePanel.getSelectionModel().addListener(Events.OnClick, new Listener<BaseEvent>() {
//      @Override
      public void handleEvent(BaseEvent event) {
        event.getSource();
      }
    });
    treePanel.getSelectionModel().addSelectionChangedListener(new SelectionChangedListener<ModelData>() {
      @Override
      public void selectionChanged(SelectionChangedEvent<ModelData> event) {
        treePanel.getSelectionModel().setFiresEvents(false);
        ModelData selectedItem = event.getSelectedItem();
        if (selectedItem != null) {
          if (!treePanel.isLeaf(selectedItem)) {
            // invert expand status
            treePanel.setExpanded(selectedItem, !treePanel.isExpanded(selectedItem));
          }
          // always unselect at the end, even for leaves
          treePanel.getSelectionModel().setSelection(Collections.<ModelData>emptyList());
        }
        treePanel.getSelectionModel().setFiresEvents(true);
      }
    });

  }
}