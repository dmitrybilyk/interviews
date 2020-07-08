package com.learn.web.gwt.client.sap;

import java.util.List;

import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.ScheduledCommand;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Node;
import com.google.gwt.dom.client.NodeList;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.DefaultCellTableBuilder;
import com.google.gwt.view.client.SelectionModel;

/**
 * Uses {@link SortableColumn#getHeaderStyle()} to optionally add a custom CSS style to the &lt;th&gt; table
 * header cell for the respective column.<p>
 * 
 * The implementation works by overriding {@link #renderRowValues(SafeHtmlBuilder, List, int, SelectionModel)} which
 * first calls the super implementation which is expected to render the header cells already into the implementation
 * {@link Element}, then uses {@link #updateColumnHeaderStyles()} to traverse the DOM tree to the &lt;th&gt; elements
 * and {@link Element#addClassName(String) adding} the class name as specified by the column, if not <code>null</code>.
 * 
 * @author Axel Uhl (D043530)
 */
public class SortedCellTableWithStylableHeaders<T> extends SortedCellTable<T> {
    public SortedCellTableWithStylableHeaders(int pageSize, CellTable.Resources resources) {
        super(pageSize, resources);
        setTableBuilder(new DefaultCellTableBuilder<T>(this) {
            @Override
            public void buildRowImpl(T arg0, int arg1) {
                super.buildRowImpl(arg0, arg1);
                Scheduler.get().scheduleFinally(new ScheduledCommand() {
                    @Override
                    public void execute() {
                        updateColumnHeaderStyles();
                    }
                });
            }
        });
    }
    public SortedCellTableWithStylableHeaders(int pageSize) {
        super(pageSize);
        setTableBuilder(new DefaultCellTableBuilder<T>(this) {
            @Override
            public void buildRowImpl(T arg0, int arg1) {
                super.buildRowImpl(arg0, arg1);
//                Scheduler.get().scheduleFinally(new ScheduledCommand() {
//                    @Override
//                    public void execute() {
//                        updateColumnHeaderStyles();
//                    }
//                });
            }
        });
    }
    
    private void updateColumnHeaderStyles() {
        Element tableElement = getElement();
        Element thead = tableElement.getElementsByTagName("thead").getItem(0);
        Node header = thead.getChild(0); // single tr header row
        NodeList<Node> headerColumns = header.getChildNodes();
        for (int i=0; i<headerColumns.getLength(); i++) {
            Element headerCell = Element.as(headerColumns.getItem(i));
            String headerStyle = ((SortableColumn<T, ?>) getColumn(i)).getHeaderStyle();
            if (headerStyle != null) {
                headerCell.addClassName(headerStyle);
            }
        }
    }

    @Override
    public void redrawFooters() {
        super.redrawFooters();
        updateColumnHeaderStyles();
    }

    @Override
    public void redrawHeaders() {
        super.redrawHeaders();
        updateColumnHeaderStyles();
    }
    
}
