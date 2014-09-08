/**
 * Sencha GXT 3.1.0 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package com.sencha.gxt.explorer.client.tree;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.ToStringValueProvider;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.TreeStore;
import com.sencha.gxt.examples.resources.client.TestData;
import com.sencha.gxt.examples.resources.client.images.ExampleImages;
import com.sencha.gxt.examples.resources.client.model.BaseDto;
import com.sencha.gxt.examples.resources.client.model.FolderDto;
import com.sencha.gxt.explorer.client.model.Example;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.button.ButtonBar;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.MarginData;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;
import com.sencha.gxt.widget.core.client.tree.Tree;

@Example.Detail(name = "Customized Tree", category = "Tree", icon = "customizedtree")
public class CustomTreeExample implements IsWidget, EntryPoint {

  interface TreeBundle extends ClientBundle {
    ImageResource plus();

    ImageResource minus();

    ImageResource folder();

    ImageResource folderOpen();
  }

  class KeyProvider implements ModelKeyProvider<BaseDto> {
    @Override
    public String getKey(BaseDto item) {
      return (item instanceof FolderDto ? "f-" : "m-") + item.getId().toString();
    }
  }

  private ContentPanel panel;

  @Override
  public Widget asWidget() {
    if (panel == null) {
      panel = new ContentPanel();
      panel.setHeadingText("Customized Tree");
      panel.setPixelSize(330, 400);
      panel.addStyleName("margin-10");
      
      TreeBundle bundle = GWT.create(TreeBundle.class);

      TreeStore<BaseDto> store = new TreeStore<BaseDto>(new KeyProvider());

      FolderDto root = TestData.getMusicRootFolder();
      for (BaseDto base : root.getChildren()) {
        store.add(base);
        if (base instanceof FolderDto) {
          processFolder(store, (FolderDto) base);
        }
      }

      final Tree<BaseDto, String> tree = new Tree<BaseDto, String>(store, new ToStringValueProvider<BaseDto>("name"));
      tree.setWidth(300);
      tree.getStyle().setJointCloseIcon(bundle.plus());
      tree.getStyle().setJointOpenIcon(bundle.minus());
      tree.getStyle().setNodeCloseIcon(bundle.folder());
      tree.getStyle().setNodeOpenIcon(bundle.folderOpen());

      tree.getStyle().setLeafIcon(ExampleImages.INSTANCE.music());

      ButtonBar buttonBar = new ButtonBar();
      buttonBar.add(new TextButton("Expand All", new SelectHandler() {

        @Override
        public void onSelect(SelectEvent event) {
          tree.expandAll();
        }
      }));
      buttonBar.add(new TextButton("Collapse All", new SelectHandler() {
        @Override
        public void onSelect(SelectEvent event) {
          tree.collapseAll();
        }

      }));

      buttonBar.setLayoutData(new MarginData(4));

      VerticalLayoutContainer con = new VerticalLayoutContainer();
      con.add(buttonBar, new VerticalLayoutData(1, -1));
      con.add(tree, new VerticalLayoutData(1, 1));
      panel.add(con);
    }

    return panel;
  }

  public void onModuleLoad() {
    RootPanel.get().add(asWidget());
  }

  private void processFolder(TreeStore<BaseDto> store, FolderDto folder) {
    for (BaseDto child : folder.getChildren()) {
      store.add(folder, child);
      if (child instanceof FolderDto) {
        processFolder(store, (FolderDto) child);
      }
    }
  }
}
