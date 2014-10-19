package toknow.nikita;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.SplitLayoutPanel;

/**
 * Created by dik81 on 10/19/14.
 */
public class SplitLayoutExample {
  public SplitLayoutPanel createSplitLayoutPanel(){
    SplitLayoutPanel splitPanel = new SplitLayoutPanel(5);
    splitPanel.ensureDebugId("cwSplitLayoutPanel");
    splitPanel.getElement().getStyle()
            .setProperty("border", "3px solid #e7e7e7");

    // Add text all around.
    com.extjs.gxt.ui.client.widget.Label label = new com.extjs.gxt.ui.client.widget.Label("Сайт Билыка Никиты");
    label.addStyleName("header-label");

    splitPanel.addNorth(label, 50);
    splitPanel.addSouth(new Label("bottom"), 50);
    splitPanel.addEast(new Label("right"), 100);
    splitPanel.addWest(new Label("left"), 100);
    splitPanel.addNorth(new Label("center"), 50);
    splitPanel.addSouth(new Label("bottom"), 50);

    // Add scrollable text to the center.
    String centerText = "centerText";
    for (int i = 0; i < 3; i++) {
      centerText += " " + centerText;
    }
    Label centerLabel = new Label(centerText);
    ScrollPanel centerScrollable = new ScrollPanel(centerLabel);
    splitPanel.add(centerScrollable);

    // Return the content
    return splitPanel;
  }

}
