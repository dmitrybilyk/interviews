package toknow.client.grids;

import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.event.GridEvent;
import com.extjs.gxt.ui.client.widget.grid.ColumnConfig;
import com.extjs.gxt.ui.client.widget.grid.ColumnHeader;
import com.extjs.gxt.ui.client.widget.grid.GridView;
import com.extjs.gxt.ui.client.widget.menu.Menu;
import com.extjs.gxt.ui.client.widget.tips.ToolTip;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: juan
 * Date: 1/24/11
 * Time: 4:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class SCGridView extends GridView {

  private Map<ColumnConfig, ToolTip> tooltips = new HashMap<ColumnConfig, ToolTip>();

  protected ColumnHeader newColumnHeader() {

    /* use a instance of SCColumnHeader instead.
       code from the parent class has to be repeated.
     */
    header = new SCColumnHeader(grid, cm) {
      @Override
      protected ComponentEvent createColumnEvent(ColumnHeader header, int column, Menu menu) {
        GridEvent<ModelData> event = new GridEvent<ModelData>(grid);
        event.setColIndex(column);
        event.setMenu(menu);
        return event;
      }

      @Override
      protected Menu getContextMenu(int column) {
        return createContextMenu(column);
      }

      @Override
      protected void onColumnSplitterMoved(int colIndex, int width) {
        super.onColumnSplitterMoved(colIndex, width);
        SCGridView.this.onColumnSplitterMoved(colIndex, width);
      }

      @Override
      protected void onHeaderClick(ComponentEvent ce, int column) {
        super.onHeaderClick(ce, column);
        SCGridView.this.onHeaderClick(grid, column);
      }

    };
    header.setSplitterWidth(splitterWidth);
    header.setMinColumnWidth(grid.getMinColumnWidth());
    ((SCColumnHeader)header).setTooltips(tooltips);

    return header;
  }

  public void setTooltips(Map<ColumnConfig, ToolTip> tooltips) {
    this.tooltips = tooltips;
  }

  public void addTooltip(ColumnConfig column, ToolTip tooltip) {
    this.tooltips.put(column, tooltip);
  }

  public Map<ColumnConfig, ToolTip> getTooltips() {
    return tooltips;
  }
}
