/**
 * Sencha GXT 3.1.0 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package com.sencha.gxt.explorer.client.window;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.util.Format;
import com.sencha.gxt.core.client.util.Params;
import com.sencha.gxt.explorer.client.model.Example.Detail;
import com.sencha.gxt.widget.core.client.Dialog.PredefinedButton;
import com.sencha.gxt.widget.core.client.box.AlertMessageBox;
import com.sencha.gxt.widget.core.client.box.AutoProgressMessageBox;
import com.sencha.gxt.widget.core.client.box.ConfirmMessageBox;
import com.sencha.gxt.widget.core.client.box.MessageBox;
import com.sencha.gxt.widget.core.client.box.MultiLinePromptMessageBox;
import com.sencha.gxt.widget.core.client.box.ProgressMessageBox;
import com.sencha.gxt.widget.core.client.box.PromptMessageBox;
import com.sencha.gxt.widget.core.client.button.ButtonBar;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.event.DialogHideEvent;
import com.sencha.gxt.widget.core.client.event.DialogHideEvent.DialogHideHandler;
import com.sencha.gxt.widget.core.client.event.HideEvent;
import com.sencha.gxt.widget.core.client.event.HideEvent.HideHandler;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;
import com.sencha.gxt.widget.core.client.info.Info;

@Detail(name = "MessageBox", icon = "messagebox", category = "Windows")
public class MessageBoxExample implements IsWidget, EntryPoint {

  private ButtonBar buttonBar;

  public Widget asWidget() {
    if (buttonBar == null) {
      final DialogHideHandler hideHandler = new DialogHideHandler() {
        @Override
        public void onDialogHide(DialogHideEvent event) {
          String msg = Format.substitute("The '{0}' button was pressed", event.getHideButton());
          Info.display("MessageBox", msg);
        }
      };

      buttonBar = new ButtonBar();
      buttonBar.setMinButtonWidth(75);
      buttonBar.getElement().setMargins(10);

      TextButton b = new TextButton("Confirm");
      b.addSelectHandler(new SelectHandler() {
        @Override
        public void onSelect(SelectEvent event) {
          ConfirmMessageBox box = new ConfirmMessageBox("Confirm", "Are you sure you want to do that?");
          box.addDialogHideHandler(hideHandler);
          box.show();
        }
      });
      buttonBar.add(b);

      b = new TextButton("Prompt");
      b.addSelectHandler(new SelectHandler() {

        @Override
        public void onSelect(SelectEvent event) {
          final PromptMessageBox box = new PromptMessageBox("Name", "Please enter your name:");
          box.addHideHandler(new HideHandler() {
            @Override
            public void onHide(HideEvent event) {
              Info.display("MessageBox", "You entered " + box.getValue());
            }
          });
          box.show();
        }
      });
      buttonBar.add(b);

      b = new TextButton("Multiline Prompt");
      b.addSelectHandler(new SelectHandler() {
        @Override
        public void onSelect(SelectEvent event) {
          final MultiLinePromptMessageBox box = new MultiLinePromptMessageBox("Address", "Please enter your address:");
          box.addHideHandler(new HideHandler() {
            @Override
            public void onHide(HideEvent event) {
              String v = Format.ellipse(box.getValue(), 80);
              String msg = Format.substitute("You entered '{0}'", new Params(v));
              Info.display("MessageBox", msg);
            }
          });
          box.show();
        }
      });
      buttonBar.add(b);

      b = new TextButton("Yes/No/Cancel");
      b.addSelectHandler(new SelectHandler() {
        @Override
        public void onSelect(SelectEvent event) {
          MessageBox box = new MessageBox("Save Changes?", "");
          box.setPredefinedButtons(PredefinedButton.YES, PredefinedButton.NO, PredefinedButton.CANCEL);
          box.setIcon(MessageBox.ICONS.question());
          box.setMessage("You are closing a tab that has unsaved changes. Would you like to save your changes?");
          box.addDialogHideHandler(new DialogHideHandler() {
            @Override
            public void onDialogHide(DialogHideEvent event) {
              String msg = Format.substitute("The '{0}' button was pressed", event.getHideButton());
              Info.display("MessageBox", msg);
            }
          });
          box.show();
        }
      });
      buttonBar.add(b);

      b = new TextButton("Progress");
      b.addSelectHandler(new SelectHandler() {
        @Override
        public void onSelect(SelectEvent event) {
          final ProgressMessageBox box = new ProgressMessageBox("Please wait", "Loading items...");
          box.setProgressText("Initializing...");
          box.show();

          final Timer t = new Timer() {
            float i;

            @Override
            public void run() {
              box.updateProgress(i / 100, "{0}% Complete");
              i += 5;
              if (i > 100) {
                cancel();
                Info.display("Message", "Items were loaded");
              }
            }
          };
          t.scheduleRepeating(500);
          box.addDialogHideHandler(new DialogHideHandler() {
            @Override
            public void onDialogHide(DialogHideEvent event) {
              t.cancel();
              hideHandler.onDialogHide(event);
            }
          });
        }
      });
      buttonBar.add(b);

      b = new TextButton("Wait");
      b.addSelectHandler(new SelectHandler() {
        @Override
        public void onSelect(SelectEvent event) {
          final AutoProgressMessageBox box = new AutoProgressMessageBox("Progress", "Saving your data, please wait...");
          box.setProgressText("Saving...");
          box.auto();
          box.show();

          Timer t = new Timer() {
            @Override
            public void run() {
              Info.display("Message", "Your fake data was saved");
              box.hide();
            }
          };
          t.schedule(5000);
        }
      });
      buttonBar.add(b);

      b = new TextButton("Alert");
      b.addSelectHandler(new SelectHandler() {
        @Override
        public void onSelect(SelectEvent event) {
          AlertMessageBox d = new AlertMessageBox("Alert", "Access Denied");
          d.addDialogHideHandler(hideHandler);
          d.show();
        }
      });
      buttonBar.add(b);
    }

    return buttonBar;
  }

  public void onModuleLoad() {
    RootPanel.get().add(asWidget());
  }

}
