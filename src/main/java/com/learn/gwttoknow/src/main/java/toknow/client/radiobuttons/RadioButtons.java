package toknow.client.radiobuttons;


import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class RadioButtons {

  private String[] colors = {"red", "white", "black", "green"};
  private String[] sports = {"football", "hockey", "tennis"};

  public Widget onInitialize() {
    // Create a vertical panel to align the radio buttons
    VerticalPanel vPanel = new VerticalPanel();
    vPanel.add(new HTML("Radio buttons"));

    // Add some radio buttons to a group called 'color'
    for (int i = 0; i < colors.length; i++) {
      String color = colors[i];
      RadioButton radioButton = new RadioButton("color", color);
      radioButton.ensureDebugId("cwRadioButton-color-" + color);
      if (i == 2) {
        radioButton.setEnabled(false);
      }
      vPanel.add(radioButton);
    }

    // Add a new header to select your favorite sport
    vPanel.add(new HTML("<br>" + "Select sport"));

    for (int i = 0; i < sports.length; i++) {
      String sport = sports[i];
      RadioButton radioButton = new RadioButton("sport", sport);
      radioButton.ensureDebugId(
          "cwRadioButton-sport-" + sport.replaceAll(" ", ""));
      if (i == 2) {
        radioButton.setValue(true);
      }
      vPanel.add(radioButton);
    }

    return vPanel;
  }
 }
