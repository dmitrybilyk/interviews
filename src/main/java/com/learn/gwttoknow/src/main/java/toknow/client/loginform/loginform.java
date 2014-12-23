package toknow.client.loginform;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.MouseEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.*;

/**
 * Created by dik81 on 11/9/14.
 */
public class loginform extends Widget{
  interface loginformUiBinder extends UiBinder<VerticalPanel, loginform> {
  }

  private static loginformUiBinder ourUiBinder = GWT.create(loginformUiBinder.class);

  @UiField
  TextBox login;

  @UiField
  PasswordTextBox password;

  @UiField
  Button loginButton;

  public loginform() {
    VerticalPanel rootElement = ourUiBinder.createAndBindUi(this);

  }

  @UiHandler("loginButton")
  public void login(ClickEvent mouseEvent){
    Window.alert("check button");
  }


}