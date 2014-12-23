package toknow.client.testdata;

import com.extjs.gxt.ui.client.data.BaseModelData;

public class Task extends BaseModelData {

  public Task(int id, String project, int taskId, String desc, double estimate, double rate,
      String due) {
    set("id", id);
    set("project", project);
    set("taskId", taskId);
    set("description", desc);
    set("estimate", estimate);
    set("rate", rate);
    set("due", due);
  }

  public Task() {
  }

  public Double getEstimate() {
    return (Double) get("estimate");
  }

  public double getRate() {
    return (Double) get("rate");
  }

}