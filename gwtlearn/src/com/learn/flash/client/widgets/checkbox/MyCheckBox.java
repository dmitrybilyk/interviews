package com.learn.flash.client.widgets.checkbox;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.learn.flash.i18n.client.CwConstants;

/**
 * Created by dik81 on 9/4/14.
 */
public class MyCheckBox{
    /**
     * The constants used in this Content Widget.
     */


    /**
     * An instance of the constants.
     */
    private CwConstants constants;

    /**
     * Initialize this example.
     */
//    @Override
    public Widget onInitialize() {

        CwConstants constants = GWT.create(CwConstants.class);
        // Create a vertical panel to align the check boxes
        VerticalPanel vPanel = new VerticalPanel();
        HTML label = new HTML("check all");
        label.ensureDebugId("cwCheckBox-label");
        vPanel.add(label);

        // Add a checkbox for each day of the week
        String[] daysOfWeek = constants.cwCheckBoxDays();
//        String[] daysOfWeek = new String[7];
//        daysOfWeek[0] = "Monday";
//        daysOfWeek[1] = "Tuesday";
//        daysOfWeek[2] = "Wednesday";
//        daysOfWeek[3] = "Thursday";
//        daysOfWeek[4] = "Friday";
//        daysOfWeek[5] = "Saturday";
//        daysOfWeek[6] = "Sunday";
        for (int i = 0; i < daysOfWeek.length; i++) {
            String day = daysOfWeek[i];
            CheckBox checkBox = new CheckBox(day);
            checkBox.ensureDebugId("cwCheckBox-" + day);

            // Disable the weekends
            if (i >= 5) {
                checkBox.setEnabled(false);
            }

            vPanel.add(checkBox);
        }

        // Return the panel of checkboxes
        return vPanel;
    }
}
