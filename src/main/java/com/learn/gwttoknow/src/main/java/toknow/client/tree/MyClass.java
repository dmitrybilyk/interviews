package toknow.client.tree;

import com.extjs.gxt.ui.client.data.BaseTreeModel;

import java.io.Serializable;

/**
 * Created by dik81 on 11/8/14.
 */
public class MyClass extends BaseTreeModel implements Serializable {
  private static int ID = 0;

  public MyClass() {
    set("id", ID++);
  }

  public MyClass(String name) {
    set("id", ID++);
    set("name", name);
  }

  public MyClass(String name, BaseTreeModel[] children) {
    this(name);
    for (int i = 0; i < children.length; i++) {
      add(children[i]);
    }
  }

  public Integer getId() {
    return (Integer) get("id");
  }

  public String getName() {
    return (String) get("name");
  }

  public String toString() {
    return getName();
  }
}
