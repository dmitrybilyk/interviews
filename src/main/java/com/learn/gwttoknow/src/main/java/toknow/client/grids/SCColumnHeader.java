package toknow.client.grids;

import com.extjs.gxt.ui.client.widget.BoxComponent;
import com.extjs.gxt.ui.client.widget.grid.ColumnConfig;
import com.extjs.gxt.ui.client.widget.grid.ColumnHeader;
import com.extjs.gxt.ui.client.widget.grid.ColumnModel;
import com.extjs.gxt.ui.client.widget.tips.ToolTip;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: juan
 * Date: 1/24/11
 * Time: 3:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class SCColumnHeader extends ColumnHeader {

  private Map<ColumnConfig, ToolTip> tooltips = new HashMap<ColumnConfig, ToolTip>();

  public SCColumnHeader(BoxComponent container, ColumnModel cm) {
    super(container, cm);
  }

  // create instance of the head and attach the tooltip
  protected Head createNewHead(ColumnConfig config) {
    Head head = new Head(config);

    // use tooltips (SCToolTip) instead
    ToolTip tooltip = tooltips.get(config);
    if (tooltip != null) {
      tooltip.initTarget(head);
    }

    return head;
  }

  public void setTooltips(Map<ColumnConfig, ToolTip> tooltips) {
    this.tooltips = tooltips;
  }

  public Map<ColumnConfig, ToolTip> getTooltips() {
    return tooltips;
  }
}
