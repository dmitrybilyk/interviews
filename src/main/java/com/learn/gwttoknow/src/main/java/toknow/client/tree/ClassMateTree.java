package toknow.client.tree;

import com.extjs.gxt.ui.client.GXT;
//import com.extjs.gxt.ui.client.Registry;
import com.extjs.gxt.ui.client.core.El;
import com.extjs.gxt.ui.client.data.*;
import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.event.TreePanelEvent;
import com.extjs.gxt.ui.client.store.TreeStore;
import com.extjs.gxt.ui.client.store.TreeStoreEvent;
import com.extjs.gxt.ui.client.widget.Info;
import com.extjs.gxt.ui.client.widget.MessageBox;
import com.extjs.gxt.ui.client.widget.treepanel.TreePanel;
import com.extjs.gxt.ui.client.widget.treepanel.TreePanelView;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.AbstractImagePrototype;
import com.google.gwt.user.client.ui.Image;
import toknow.client.model.ClassMate;

import java.util.*;

/**
 * A component displaying the groups tree.
 * The tree can be dynamically manipulated, items can be enabled or disabled.
 * To get new instances use the factory methods create*instance.
 * <p/>
 * Created by IntelliJ IDEA.
 * User: jelen
 * Date: 25.6.2009
 * Time: 11:39:02
 */
public class ClassMateTree extends TreePanel<BeanModel> {

  private Set<BeanModel> disabledNodes = new HashSet<BeanModel>();
  private boolean autoDisable = false;

//  private static final ScorecardMessages i18nMessages = GWT.create(ScorecardMessages.class);
  private static BeanModelFactory beanFactory = BeanModelLookup.get().getFactory(ClassMate.class);

  protected ClassMateTree(TreeStore<BeanModel> store) {
    super(store);
    setView(new GroupTreeView());
  }

  /**
   * Creates a new empty instance.
   *
   * @return a new <code>GroupTree</code> instance.
   */
  public static ClassMateTree createEmptyInstance() {
    TreeStore<BeanModel> groupStore = new TreeStore<BeanModel>();
    return new ClassMateTree(groupStore);
  }

  /**
   * Create a new <code>GroupTree</code> instance and populates it with all groups from the backend.
   *
   * @param autoDisable automatically disable all groups on load
   * @return a populated <code>GroupTree</code>.
   */
  public static ClassMateTree createFullInstance(final boolean autoDisable) {
    final TreeStore<BeanModel> groupStore = new TreeStore<BeanModel>();
    final ClassMateTree tree = new ClassMateTree(groupStore);

    groupStore.setKeyProvider(new ModelKeyProvider<BeanModel>() {
      public String getKey(BeanModel model) {
        return ((ClassMate) model.getBean()).getName();
      }
    });

    tree.autoDisable = autoDisable;
    tree.setDisplayProperty("name");
    tree.mask(GXT.MESSAGES.loadMask_msg());
    tree.setStateful(true);
    tree.clearState();

//    final GroupServiceAsync groupService = Registry.get(GroupService.REGISTRY_GROUP_SERVICE);
//    groupService.getRootGroup(true, new ScorecardAsyncCallback<CcGroupBO>() {
//      @Override
//      public void handleFailure(Throwable throwable) {
//        showErrorAlert(throwable);
//      }
//
//      @Override
//      public void restoreState() {
//        tree.unmask();
//      }
//
//      @Override
//      public void handleSuccess(CcGroupBO ccGroupBO) {
        tree.loadAllTree();
//      }
//    });

    tree.addListener(Events.BeforeExpand, new Listener<TreePanelEvent<BeanModel>>() {
      public void handleEvent(final TreePanelEvent<BeanModel> be) {
        ClassMate ccGroupBO = (ClassMate) be.getItem().getBean();

        // if it was already expanded, or the group has no children, then do nothing
//        if ((be.getNode().getItemCount() != 0) || (!ccGroupBO.hasChildrenGroups())) {
//          return;
//        }

//        Collection children;
//        if (ccGroupBO.getChildrenGroups().size() == 1) {
//          // don't bother with sorting if there's only 1 item
//          children = ccGroupBO.getChildrenGroups();
//        } else {
          List<ClassMate> sortedChildren = new ArrayList<ClassMate>();
//          Collections.sort(sortedChildren, new Comparator<CcGroupBO>() {
//            @Override
//            public int compare(CcGroupBO ccGroupBO, CcGroupBO ccGroupBO1) {
//              return GuiTools.compareLocaleSensitive(ccGroupBO.getCcgroupname(), ccGroupBO1.getCcgroupname());
//            }
//          });
//
//          children = sortedChildren;
//        }

        // wrap in bean model and insert into the store
        List<BeanModel> groupModelList = beanFactory.createModel(sortedChildren);
        tree.getStore().insert(be.getItem(), groupModelList, 0, false);
      }
    });

    return tree;
  }

  public void loadAllTree() {
    ClassMateTree.this.expandAll();
  }

//  public List<Integer> findPathToNodes(Collection<Integer> idsCollection) {
//    List<Integer> nodesToExpand = new ArrayList<Integer>();
//    CcGroupBO root = this.getStore().getChild(0).getBean();
//
//    for (Integer id : idsCollection) {
//      nodesToExpand.addAll(root.findGroupTreePath(id));
//    }
//
//    return nodesToExpand;
//  }

//  public void reloadTree() {
//    mask(GXT.MESSAGES.loadMask_msg());
//
//    final GroupServiceAsync groupService = Registry.get(GroupService.REGISTRY_GROUP_SERVICE);
//    groupService.getRootGroup(true, new ScorecardAsyncCallback<CcGroupBO>() {
//
//      @Override
//      public void handleFailure(Throwable throwable) {
//        showErrorAlert(throwable);
//      }
//
//      @Override
//      public void restoreState() {
//        GroupTree.this.unmask();
//      }
//
//      @Override
//      public void handleSuccess(CcGroupBO ccGroupBO) {
//        // re-do the tree again
//        GroupTree.this.getStore().removeAll();
//
//        BeanModel root = beanFactory.createModel(ccGroupBO);
//        GroupTree.this.getStore().add(root, false);
//
//        // call the ondatachangedlistener
//        GroupTree.this.refreshDataView();
//      }
//    });
//  }

//  private static void showErrorAlert(Throwable throwable) {
//    if (throwable instanceof NoSuchEntityException) {
//      MessageBox.alert(i18nMessages.administration_groupManager_groupTree_messageBox_getRootGroup_noSuchEntityException_title(), i18nMessages.administration_groupManager_groupTree_messageBox_getRootGroup_noSuchEntityException_text(), null);
//    } else {
//      MessageBox.alert(i18nMessages.administration_groupManager_groupTree_messageBox_getRootGroup_otherException_title(), i18nMessages.general_message_rpcfailed("GT147"), null);
//    }
//  }


//  @Override
//  protected boolean hasChildren(BeanModel model) {
//    return ((CcGroupBO) model.getBean()).hasChildrenGroups();
//  }

  /**
   * Set the enabled style to the node.
   *
   * @param model the node's model
   */
//  public void enableItem(CcGroupBO model) {
//    BeanModel storeBean = getStore().findModel("id", model.getId());
//    disabledNodes.remove(storeBean);
//
//  }

  /**
   * Set the enabled style to the nodes.
   *
   * @param models a list of node models
   */
//  public void enableItems(Collection<CcGroupBO> models) {
//    for (CcGroupBO model : models) {
//      enableItem(model);
//    }
//  }
//
//  public Collection<CcGroupBO> getEnabledItems() {
//    Set<CcGroupBO> enabledItems = new HashSet<CcGroupBO>();
//    for (BeanModel groupBean : getStore().getModels()) {
//      enabledItems.add((CcGroupBO)groupBean.getBean());
//
//    }
//    enabledItems.removeAll(disabledNodes);
//    return enabledItems;
//  }


  /**
   * Set the disabled style to the node.
   *
   * @param model the node's model
   */
//  public void disableItem(CcGroupBO model) {
//    BeanModel storeBean = getStore().findModel("id", model.getId());
//    disabledNodes.add(storeBean);
//  }
//
//  /**
//   * Set the disabled style to the nodes.
//   *
//   * @param models a list of node models
//   */
//  public void disableItems(Collection<CcGroupBO> models) {
//    for (CcGroupBO model : models) {
//      disableItem(model);
//    }
//  }


  /**
   * Refreshes the frontend without reloading the data, expand all nodes.
   */
  public void refreshDataView() {
    onDataChanged(new TreeStoreEvent<BeanModel>(getStore()));
  }

//  public List<CcGroupBO> getDisabledGroups() {
//    return GuiTools.getBeansFromCollection(disabledNodes);
//  }

  /**
   * Create a new group node and persist it in the backend.
   *
   * @param addGroup the new node's parent
   * @param callBack the new node's display name
   */
//  public void createGroupNode(final CcGroupBO addGroup, final AsyncCallback<Void> callBack) {
//    addGroup.setCompanyBO(UserUtils.getInstance().getLoggedUser().getCompanyBO());
//    final GroupServiceAsync groupService = Registry.get(GroupService.REGISTRY_GROUP_SERVICE);
//    groupService.createGroup(addGroup, new ScorecardAsyncCallback<CcGroupBO>() {
//      @Override
//      public void handleFailure(Throwable caught) {
//        addGroup.removeChild(addGroup);
//        if (caught instanceof AuthorizationRequiredException) {
//          MessageBox.alert(i18nMessages.administration_groupManager_groupTree_messageBox_updateGroup_authorizationException_title(), i18nMessages.general_message_authorizationException(), null);
//        }
//        if (caught instanceof NotAllowedException) {
//          MessageBox.alert(i18nMessages.administration_groupManager_groupTree_messageBox_updateGroup_notAllowedException_title(), i18nMessages.administration_groupManager_groupTree_messageBox_updateGroup_notAllowedException_text(), null);
//        } else {
//          MessageBox.alert(i18nMessages.administration_groupManager_groupTree_messageBox_updateGroup_otherException_title(), i18nMessages.general_message_rpcfailed("GT257"), null);
//        }
//        callBack.onFailure(caught);
//      }
//
//      @Override
//      public void handleSuccess(CcGroupBO result) {
//        UserService.App.getInstance().getUserComplete(UserUtils.getInstance().getLoggedUser(), new ScorecardAsyncCallback<UserBO>() {
//          @Override
//          public void handleSuccess(UserBO result) {
//            UserUtils.getInstance().updateUser(result);
//            reloadTree();
//            GuiFactoryImpl.getInstance().reloadNavigationPanel();
//            Info.display(i18nMessages.administration_groupManager_addButton_addWindow_infoMessage_groupCretedSuccesful_title(), i18nMessages.administration_groupManager_addButton_addWindow_infoMessage_groupCretedSuccesful_text(addGroup.getCcgroupname()));
//            callBack.onSuccess(null);
//          }
//        });
//      }
//    });
//  }


  /**
   * Rename group node and persist it in the backend.
   *
//   * @param group    the group to rename
//   * @param callBack
   */
//  public void updateGroupNode(final CcGroupBO group, final AsyncCallback<Void> callBack) {
//    if (!group.hasAnythingChanged()) {
//      callBack.onSuccess(null);
//    } else {
//      final GroupServiceAsync groupService = Registry.get(GroupService.REGISTRY_GROUP_SERVICE);
//      groupService.updateGroup(group, new ScorecardAsyncCallback<Void>() {
//        @Override
//        public void handleFailure(Throwable throwable) {
//          if (throwable instanceof NoSuchEntityException) {
//            MessageBox.alert(i18nMessages.administration_groupManager_groupTree_messageBox_updateGroup_onFailure_noSuchEntityException_title(), i18nMessages.administration_groupManager_groupTree_messageBox_updateGroup_onFailure_noSuchEntityException_text(group.getCcgroupname()), null);
//          } else if (throwable instanceof NotAllowedException) {
//            MessageBox.alert(i18nMessages.administration_groupManager_groupTree_messageBox_updateGroup_onFailure_notAllowedException_title(), i18nMessages.general_message_notAllowedException(), null);
//          } else {
//            MessageBox.alert(i18nMessages.administration_groupManager_groupTree_messageBox_updateGroup_onFailure_otherException_title(), i18nMessages.general_message_rpcfailed("GT299"), null);
//          }
//          callBack.onFailure(throwable);
//        }
//
//        @Override
//        public void handleSuccess(Void aVoid) {
//          UserService.App.getInstance().getUserComplete(UserUtils.getInstance().getLoggedUser(), new ScorecardAsyncCallback<UserBO>() {
//            @Override
//            public void handleSuccess(UserBO result) {
//              UserUtils.getInstance().updateUser(result);
//
//              reloadTree();
//              GuiFactoryImpl.getInstance().reloadNavigationPanel();
//              Info.display(i18nMessages.administration_groupManager_addButton_addWindow_infoMessage_groupUpdateSuccesful_title(), i18nMessages.administration_groupManager_addButton_addWindow_infoMessage_groupUpdateSuccesful_text(group.getCcgroupname()));
//              callBack.onSuccess(null);
//            }
//          });
//        }
//      });
//    }
//  }

//  /**
//   * Delete a group node and remove it from the backend.
//   *
//   * @param node a node to delete
//   */
//  public void deleteGroupNode(final CcGroupBO node, final AsyncCallback<Void> callBack) {
//    if (node != null) {
//      final GroupServiceAsync groupService = Registry.get(GroupService.REGISTRY_GROUP_SERVICE);
//      groupService.deleteGroup(node, new ScorecardAsyncCallback<Void>() {
//        @Override
//        public void handleSuccess(Void result) {
//          UserService.App.getInstance().getUserComplete(UserUtils.getInstance().getLoggedUser(), new ScorecardAsyncCallback<UserBO>() {
//            @Override
//            public void handleSuccess(UserBO result) {
//              UserUtils.getInstance().updateUser(result);
//              Info.display(i18nMessages.administration_groupManager_removeButton_infoMessage_groupDeleted_title(), i18nMessages.administration_groupManager_removeButton_infoMessage_groupDeleted_text(node.getName()));
//              reloadTree();
//              GuiFactoryImpl.getInstance().reloadNavigationPanel();
//              callBack.onSuccess(null);
//            }
//          });
//        }
//
//        @Override
//        public void handleFailure(Throwable caught) {
//          if (caught instanceof RecordInUse) {
//            MessageBox.alert(i18nMessages.administration_groupManager_removeButton_alertMessage_groupHasUsers_title(), i18nMessages.administration_groupManager_removeButton_alertMessage_groupHasUsers_text(node.getName()), null);
//          }
//          callBack.onFailure(caught);
//        }
//      });
//    }
//  }

  @Override
  protected void onRender(Element target, int index) {
    super.onRender(target, index);
    expandAll();
    if (autoDisable) {
      disabledNodes.addAll(getStore().getAllItems());
      refreshDataView();
    }
  }

  /**
   * A @link{com.extjs.gxt.ui.client.widget.treepanel.TreePanelView} with support for disabling nodes.
   */
  private class GroupTreeView extends TreePanelView<BeanModel> {
    @Override
    public String getTemplate(ModelData m, String id, String text, AbstractImagePrototype icon, boolean checkable,
                              boolean checked, Joint joint, int level, TreeViewRenderMode renderMode) {
      if (renderMode == TreeViewRenderMode.CONTAINER) {
        return "<div class=\"x-tree3-node-ct\" role=\"group\"></div>";
      }
      StringBuilder sb = new StringBuilder();
      if (renderMode == TreeViewRenderMode.ALL || renderMode == TreeViewRenderMode.MAIN) {
        sb.append("<div id=\"");
        sb.append(id);
        sb.append("\"");

        sb.append(" class=\"x-tree3-node\">");
        sb.append("<div class=\"x-tree3-el\" id=\"").append(tree.getId()).append("__").append(id).append("\" role=\"treeitem\" ");
        sb.append(" aria-level=\"").append(level + 1).append("\">");
      }
      if (renderMode == TreeViewRenderMode.ALL || renderMode == TreeViewRenderMode.BODY) {
        Element jointElement;
        switch (joint) {
          case COLLAPSED:
            jointElement = (Element) tree.getStyle().getJointCollapsedIcon().createElement().cast();
            break;
          case EXPANDED:
            jointElement = (Element) tree.getStyle().getJointExpandedIcon().createElement().cast();
            break;
          default:
            Image jointImage = new Image(GXT.BLANK_IMAGE_URL);
            jointImage.setWidth("16px");
            jointElement = jointImage.getElement();
        }

        El.fly(jointElement).addStyleName("x-tree3-node-joint");

        sb.append("<img src=\"");
        sb.append(GXT.BLANK_IMAGE_URL);
        sb.append("\" style=\"height: 18px; width: ");
        sb.append(level * 18);
        sb.append("px;\" />");
        sb.append(DOM.toString(jointElement));
        if (checkable) {
          Element e = (Element) (checked ? GXT.IMAGES.checked().createElement().cast()
                  : GXT.IMAGES.unchecked().createElement().cast());
          El.fly(e).addStyleName("x-tree3-node-check");
          sb.append(DOM.toString(e));
        } else {
          sb.append("<span class=\"x-tree3-node-check\"></span>");
        }
        if (icon != null) {
          Element e = icon.createElement().cast();
          El.fly(e).addStyleName("x-tree3-node-icon");
          sb.append(DOM.toString(e));
        } else {
          sb.append("<span class=\"x-tree3-node-icon\"></span>");
        }
        sb.append("<span class=\"x-tree3-node-text");
        if (disabledNodes.contains(m)) {
          sb.append(" group-item-disabled");
        }
        sb.append("\">");
        sb.append(text);
        sb.append("</span>");
      }

      if (renderMode == TreeViewRenderMode.ALL || renderMode == TreeViewRenderMode.MAIN) {
        sb.append("</div>");
        sb.append("</div>");
      }
      return sb.toString();
    }
  }
}