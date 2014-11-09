package toknow.client.model;

import com.extjs.gxt.ui.client.data.BaseTreeModel;
import com.extjs.gxt.ui.client.data.BeanModel;
import com.google.common.base.Objects;

import java.io.Serializable;

/**
 * Created by dik81 on 11/8/14.
 */
public class ClassMate extends BaseTreeModel implements Serializable{
  public ClassMate() {

  }

  public ClassMate(String name) {
    set("name", name);
  }

  public ClassMate(String name, String author, String genre) {
    set("name", name);
    set("author", author);
    set("genre", genre);
  }

  public String getName() {
    return (String) get("name");
  }

  public String getAuthor() {
    return (String) get("author");
  }

  public String getGenre() {
    return (String) get("genre");
  }

  public String toString() {
    return getName();
  }
}
