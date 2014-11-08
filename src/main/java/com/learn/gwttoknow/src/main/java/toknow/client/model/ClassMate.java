package toknow.client.model;

import com.extjs.gxt.ui.client.data.BaseTreeModel;
import com.extjs.gxt.ui.client.data.BeanModel;
import com.google.common.base.Objects;

import java.io.Serializable;

/**
 * Created by dik81 on 11/8/14.
 */
public class ClassMate extends BaseTreeModel implements Serializable{

  private String name;

  public ClassMate(String name) {
    this.name = name;
  }

  public ClassMate() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
