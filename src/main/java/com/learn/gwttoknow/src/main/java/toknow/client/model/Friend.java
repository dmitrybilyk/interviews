package toknow.client.model;

import com.extjs.gxt.ui.client.data.BeanModel;

/**
 * Created by dik81 on 11/9/14.
 */
public class Friend extends BeanModel{
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
