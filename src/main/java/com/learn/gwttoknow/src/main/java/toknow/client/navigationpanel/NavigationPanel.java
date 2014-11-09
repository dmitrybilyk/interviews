package toknow.client.navigationpanel;

import com.extjs.gxt.ui.client.data.BeanModel;
import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.store.TreeStore;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.treepanel.TreePanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import toknow.client.BorderLayoutExample;

/**
 * Created by dik81 on 11/9/14.
 */
public class NavigationPanel extends ContentPanel{

  public NavigationPanel(){
    VerticalPanel verticalPanel = new VerticalPanel();
    TreeStore<BeanModel> store = new TreeStore<BeanModel>();
    TreePanel<BeanModel> treePanel = new TreePanel<BeanModel>(store);
    verticalPanel.add(treePanel);
    verticalPanel.add(new BorderLayoutExample());
  }
}
