package toknow.client;

import com.extjs.gxt.ui.client.Style;
import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.widget.Viewport;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.layout.BorderLayout;
import com.extjs.gxt.ui.client.widget.layout.BorderLayoutData;
import com.extjs.gxt.ui.client.widget.tips.ToolTip;
import com.extjs.gxt.ui.client.widget.tips.ToolTipConfig;
import com.google.common.base.Joiner;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.*;
import toknow.anotherclient.AnotherLabel;
import toknow.client.buttons.ButtonsExample;
import toknow.client.loginform.loginform;
import toknow.client.navigationpanel.NavigationPanel;
import toknow.client.radiobuttons.RadioButtons;
import toknow.client.tooltips.ToolTipsExample;
import toknow.gwtinaction.BasicProject;

import java.util.ArrayList;

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

    Viewport viewport = new Viewport();

    Button button = new Button("firstButton");



    BorderLayout borderLayout = new BorderLayout();
    BorderLayoutData borderLayoutData = new BorderLayoutData(Style.LayoutRegion.EAST);
//    RootPanel.get().add(borderLayoutData);

    BorderLayoutExample borderLayoutExample = new BorderLayoutExample();


//    loginform loginform = new loginform();

//    RootPanel.get().add(loginform);
    RootPanel.get().add(borderLayoutExample);
//    RootPanel.get().add(new NavigationPanel());
//    testGuava();

    GreetingServiceAsync greetingService = GWT.create(GreetingService.class);
    greetingService.greetServer("Hi test", new AsyncCallback<String>() {
      public void onFailure(Throwable caught) {
        GWT.log("fuck");
      }

      public void onSuccess(String result) {
        GWT.log("It's ok!!!");
      }
    });



//    Duplicate duplicate = new Duplicate();
//    duplicate.createViewport();

//    SplitLayoutExample splitLayoutExample = new SplitLayoutExample();
//    RootPanel.get().add(splitLayoutExample.createSplitLayoutPanel());

//    runTheBasicProject();
//    runMyBasicProject();

//    runRadioButtons();

//
//    AnotherLabel anotherLabel = new AnotherLabel();
//    anotherLabel.setText("Another label");
//    addWidget(anotherLabel);
//
//    tooltips();
//    buttons();
  }

  private void testGuava() {
    ArrayList<Integer> parts = new ArrayList<Integer>();
    parts.add(1);
    parts.add(1);
    parts.add(1);
    parts.add(1);
    String s  = Joiner.on(',').join(parts);
    GWT.log(s);
  }

  private void runRadioButtons() {
    RadioButtons radioButtons = new RadioButtons();
    RootPanel.get().add(radioButtons.onInitialize());
  }

  private void runMyBasicProject() {
    final VerticalPanel verticalPanel = new VerticalPanel();
    verticalPanel.getElement().setId("verticalPanel");

    Button button = new Button("My button", new SelectionListener<ButtonEvent>() {
      @Override
      public void componentSelected(ButtonEvent ce) {
        Window.alert(DOM.getElementById("verticalPanel").getInnerHTML());
      }
    });

    Label theGreeting = new Label("Hello World!");
    theGreeting.addStyleName("label-style");
    RootPanel.get().add(theGreeting);

    verticalPanel.add(button);
    verticalPanel.add(theGreeting);

    insertLogo();

    RootPanel.get().add(verticalPanel);
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


  void insertLogo(){
    Image image = new Image(GWT.getModuleBaseURL() + "../" + "images/gwtia.png");
    RootPanel logoSlot = RootPanel.get("logo");
    if (logoSlot!=null)logoSlot.add(image);

  }



}