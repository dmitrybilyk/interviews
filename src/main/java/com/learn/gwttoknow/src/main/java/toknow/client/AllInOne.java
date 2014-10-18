package toknow.client;

import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.tips.ToolTip;
import com.extjs.gxt.ui.client.widget.tips.ToolTipConfig;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import toknow.anotherclient.AnotherLabel;
import toknow.client.buttons.ButtonsExample;
import toknow.client.tooltips.ToolTipsExample;
import toknow.gwtinaction.BasicProject;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class AllInOne implements EntryPoint {
  /**
   * The message displayed to the user when the server cannot be reached or
   * returns an error.
   */
  private static final String SERVER_ERROR = "An error occurred while "
          + "attempting to contact the server. Please check your network "
          + "connection and try again.";

  /**
   * Create a remote service proxy to talk to the server-side Greeting service.
   */
//  private final GreetingServiceAsync greetingService = GWT.create(GreetingService.class);

//  private final Messages messages = GWT.create(Messages.class);

  /**
   * This is the entry point method.
   */
  public void onModuleLoad() {

    runTheBasicProject();


//    Label theGreeting = new Label("Hello World!");
//    theGreeting.addStyleName("label-style");
//    RootPanel.get().add(theGreeting);
//
//    AnotherLabel anotherLabel = new AnotherLabel();
//    anotherLabel.setText("Another label");
//    addWidget(anotherLabel);
//
//    tooltips();
//    buttons();
  }

  private void runTheBasicProject() {
    BasicProject basicProject = new BasicProject();
    // Create the user interface
    basicProject.setUpGui();
    // Set up history management
    basicProject.setUpHistoryManagement();
    // Set up all the event handling required for the application.
    basicProject.setUpEventHandling();
  }

  private void addWidget(AnotherLabel anotherLabel) {
    RootPanel.get().add(anotherLabel);
  }

  private void tooltips() {
    Button runToolTipButton = new Button("Tooltips"){
      @Override
      protected void onClick(ComponentEvent ce) {
        ToolTipsExample toolTipsExample = new ToolTipsExample();
        RootPanel.get().add(toolTipsExample);
      }
    };
    RootPanel.get().add(runToolTipButton);
  }

  private void buttons() {
    Button runButtonsButton = new Button("Buttons"){
      @Override
      protected void onClick(ComponentEvent ce) {
        ButtonsExample buttonsExample = new ButtonsExample();
        RootPanel.get().add(buttonsExample);
      }
    };
    RootPanel.get().add(runButtonsButton);
  }

}