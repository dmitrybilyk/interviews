package toknow.nikita.duplicate;

import com.extjs.gxt.ui.client.Style;
import com.extjs.gxt.ui.client.event.*;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.button.ToggleButton;
import com.extjs.gxt.ui.client.widget.toolbar.ToolBar;
import com.google.gwt.core.client.GWT;
import toknow.nikita.duplicate.i18n.ScorecardConstants;
import toknow.nikita.duplicate.i18n.ScorecardMessages;


/**
 * Main toolbar on top of the application. Contains the Toolstips and curretn user buttons.
 * <p/>
 * User: jelen
 * Date: 15.6.2009
 * Time: 14:48:38
 */
public class ToolPanel extends ToolBar {


  /** ToolPanel I18n */
  private static final ScorecardConstants i18nConstants = GWT.create(ScorecardConstants.class);
  private static final ScorecardMessages i18nMessages = GWT.create(ScorecardMessages.class);

  private ToggleButton toggleTooltipsButton;
  private Button userButton;
  private Button logoutButton;
  private Button messagesButton;

  private final GuiFactory guiFactory;


  public ToolPanel(GuiFactory guiFactory) {
    super();
    this.guiFactory = guiFactory;
    init();
  }


  /** Create and initialize visual components */
  private void init() {
    this.setId(ObjectIds.TOOLPANEL_ID);
    setAlignment(Style.HorizontalAlignment.RIGHT);
//    final AbstractTabManager messageManagerTM = new AbstractTabManager(guiFactory.getMainPanel(), true, true) {
//      @Override
//      protected AbstractPanel createTab(BaseBean baseBean) {
//        return new MessagesPanel(baseBean, guiFactory, i18nConstants.toolBar_messagesButton_value());
//      }
//    };
//    final AbstractTabManager userProfilePanelTM = new AbstractTabManager(guiFactory.getMainPanel(), true, true) {
//      @Override
//      protected AbstractPanel createTab(BaseBean baseBean) {
//        return new UserProfilePanel(baseBean, guiFactory, i18nConstants.toolbar_loginUser_tabTitle());
//      }
//    };

    toggleTooltipsButton = new ToggleButton();
    toggleTooltipsButton.setIconStyle("icon-tooltips");
    toggleTooltipsButton.setId(ObjectIds.TOOLPANEL_TOGGLE_TOOLTIPS_BUTTON_ID);
    toggleTooltipsButton.addSelectionListener(new TooltipsSelectionListener());
//    toggleTooltipsButton.toggle(UserUtils.getInstance().getPropertyBooleanValue(KEY.SHOW_TOOLTIP, true));
//    setToggleTooltipsButton();
//
//    final UserBO loggedUser = UserUtils.getInstance().getLoggedUser();
//    String userDisplayName = i18nMessages.toolBar_userButton_displayMask(loggedUser.getSurname(), loggedUser.getName(), loggedUser.getLogin());
//    userButton = new Button(userDisplayName);
//    userButton.setIconStyle("icon-group");
//    userButton.setId(ObjectIds.TOOLPANEL_USER_PROFILE_BUTTON_ID);
//    userButton.addSelectionListener(new SelectionListener<ButtonEvent>() {
//      @Override
//      public void componentSelected(ButtonEvent ce) {
//        userProfilePanelTM.displayTab(UserUtils.getInstance().getLoggedUser());
//      }
//    });

    logoutButton = new Button(i18nConstants.toolBar_logoutButton_value());
    logoutButton.setIconStyle("icon-logout");
    logoutButton.setId(ObjectIds.TOOLPANEL_LOGOUT_BUTTON_ID);
//    logoutButton.addSelectionListener(new SelectionListener<ButtonEvent>() {
//      @Override
//      public void componentSelected(ButtonEvent ce) {
//        new LogoutDialog().show();
//      }
//    });

    messagesButton = new Button(i18nConstants.toolBar_messagesButton_value());
    messagesButton.setIconStyle("icon-mail");
    messagesButton.setId(ObjectIds.TOOLPANEL_MESSAGES_BUTTON_ID);
//    messagesButton.addListener(Events.OnClick, new Listener<BaseEvent>() {
//      @Override
//      public void handleEvent(BaseEvent be) {
//        messageManagerTM.displayTab(UserUtils.getInstance().getLoggedUser());
//      }
//    });

    add(toggleTooltipsButton);
    add(userButton);
    add(logoutButton);
    add(messagesButton);
  }

  private class TooltipsSelectionListener extends SelectionListener<ButtonEvent> {
    @Override
    public void componentSelected(ButtonEvent ce) {
      setToggleTooltipsButton();
    }
  }

  private void setToggleTooltipsButton() {
    if (toggleTooltipsButton.isPressed()) {
      toggleTooltipsButton.setText(i18nConstants.toolBar_tooltipsOnButton_value());
    }
    else {
      toggleTooltipsButton.setText(i18nConstants.toolBar_tooltipsOffButton_value());
    }
//    UserUtils.getInstance().setPropertyBooleanValue(KEY.SHOW_TOOLTIP, toggleTooltipsButton.isPressed());
//    SCToolTip.setToolTip(toggleTooltipsButton.isPressed());
  }

}