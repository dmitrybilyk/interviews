package toknow.nikita.duplicate;

import com.extjs.gxt.ui.client.data.BaseTreeModel;
import com.extjs.gxt.ui.client.data.TreeModel;
import com.extjs.gxt.ui.client.widget.TabPanel;
import com.google.gwt.core.client.GWT;
import toknow.nikita.duplicate.i18n.ScorecardConstants;


/**
 * @author Stanislav Valenta, 22.5.2009
 */
public class GuiFactoryImpl{

  /**
   * The only one instance of this class at a time
   */
  private static GuiFactoryImpl instance = null;

  /**
   * I18n
   */
  private final ScorecardConstants i18nConstants = GWT.create(ScorecardConstants.class);

  private final TabPanel mainPanel = new TabPanel();

//  private GuiFactoryImpl.GroupsData groupsData;

//  private EvaluationsParametersWindow evaluationsParametersWindow = new EvaluationsParametersWindow();
  private NavigationPanel navigationPanel;
//  private UserPanel userPanel;
//  private AbstractTabManager evaluationPlannerTM;
//  private SimpleTabManager trainingPlannerTM;
//  private AbstractTabManager dashboardTM;
//  private AbstractTabManager listOfEvaluationsManagerTM;
//  private EvaluationList evaluationList;
//  private TrainingList trainingList;
//  private SurveyList surveyList;

  // selenium object constants
  private static final String ITEM_TREE_ICON = "icon";
  private static final String SPEECH_TAG_TREE_ICON = "icon-application-speechtags";

  /**
   * Returns the only one instance of this class
   *
   * @return the only one instance of this class
   */
  public static synchronized GuiFactoryImpl getInstance() {
    if (instance == null) {
      instance = new GuiFactoryImpl();
    }
    return instance;
  }


  /**
   * We need to destroy all graphics by a logout
   */
  public static synchronized void logout() {
    instance = null;
    Configuration.destory();
  }


  /**
   * This class is singleton
   */
  private GuiFactoryImpl() {
    mainPanel.setTabScroll(true);
    mainPanel.setPlain(false);
  }


//  @Override
  public NavigationPanel getNavigationPanel(NavigationPanelOptions options) {
    return navigationPanel == null ? navigationPanel = new NavigationPanel(new NavigationData(options).getModel()) : navigationPanel;
  }


//  @Override
  public TabPanel getMainPanel() {
    return mainPanel;
  }

//
////  @Override
//  public Widget createToolPanel() {
//    return new ToolPanel(this);
//  }

//
//  @Override
//  public EvaluationsParametersWindow createEvaluationsParametersWindow(BaseBean baseBean, Set<CriteriaBO> criteria) {
//    final String criteriaString = getCriteriaText(criteria);
//    evaluationsParametersWindow.setValue(criteriaString);
//    return evaluationsParametersWindow;
//  }


//  @Override
//  public AbstractPanel createUserPanel(BaseBean baseBean) {
//    if (userPanel == null) {
//      userPanel = new UserPanel(baseBean, this);
//    }
//    return userPanel;
//  }

//  @Override
//  public AbstractPanel createQuestionaireManagerPanel(BaseBean baseBean) {
//    return new QuestionnaireManagerPanel(baseBean, this);
//  }


//  @Override
//  public AbstractPanel getListOfEvaluationsPanel(BaseBean baseBean) {
//    if (evaluationList == null) {
//      evaluationList = new EvaluationList(baseBean, this);
//    }
//    return evaluationList;
//  }

//  @Override
//  public AbstractPanel getListOfTrainingPanel(BaseBean baseBean) {
//    if (trainingList == null) {
//      trainingList = new TrainingList(baseBean, this);
//    }
//    return trainingList;
//  }
//
//  @Override
//  public AbstractPanel getListOfIVRPanel(BaseBean baseBean) {
//    if (surveyList == null) {
//      surveyList = new SurveyList(baseBean, this);
//    }
//    return surveyList;
//  }
//
//  public ScorecardDashboard createDashboardWithNewLayout(DashboardConfig config) {
//    final ScorecardDashboard dashboard = new ScorecardDashboard(config);
//    final int columnCount = config.getColumnCount();
//    final List<WidgetConfig> configList = config.getWidgetConfigList();
//    final Iterator<WidgetConfig> widgetConfigIterator = configList.iterator();
//
//    //noinspection WhileLoopReplaceableByForEach
//    while (widgetConfigIterator.hasNext()) {
//      for (int i = 0; i < columnCount; i++) {
//        if (!widgetConfigIterator.hasNext()) {
//          break;
//        }
//        final WidgetConfig widgetConfig = widgetConfigIterator.next();
//        final ScorecardWidget widget = createWidget(widgetConfig, dashboard);
//        dashboard.add(widget, i);
//        widgetConfig.setColumnIndex(i);
//      }
//    }
//    return dashboard;
//  }
//
//  @Override
//  public ScorecardDashboard createDashboard(DashboardConfig config) {
//    final ScorecardDashboard dashboard = new ScorecardDashboard(config);
//    for (int i = 0; i < config.getWidgetConfigList().size(); i++) {
//      for (WidgetConfig widgetConfig : config.getWidgetConfigList()) {
//        //find first with row 0 then 1...
//        if (widgetConfig.getRowIndex() == i) {
//          final ScorecardWidget widget = createWidget(widgetConfig, dashboard);
//          dashboard.add(widget, widgetConfig.getColumnIndex());
//        }
//      }
//    }
//    return dashboard;
//  }
//
//
//  @Override
//  public ScorecardWidget createWidget(WidgetConfig widgetConfig, ScorecardDashboard dashboard) {
//    final ScorecardWidget.Type type = ScorecardWidget.Type.valueOf(widgetConfig.getId());
//    switch (type) {
//      case BEST_USERS:
//      case WORST_USERS:
//        return new UsersWidget(widgetConfig, dashboard);
//      case BEST_GROUPS:
//      case WORST_GROUPS:
//        return new GroupsWidget(widgetConfig, dashboard);
//      case TREND:
//        return new TrendWidget(widgetConfig, dashboard);
//      case PIE:
//        return new PieWidget(widgetConfig, dashboard);
//      default:
//        throw new IllegalArgumentException("Unsupported type: [" + type + "] ");
//    }
//  }
//
//
//  @Override
//  public void showLoginDialog(LoginDialog.LoginClient client) {
//    LoginDialog login = new LoginDialog(client);
//    login.show();
//  }
//
//
//  @Override
//  public void reloadNavigationPanel() {
//    groupsData.load();
//  }
//
//
//  /**
//   * Helper creating text based on criteria  set
//   *
//   * @param criteriaSet from witch will be string created
//   * @return creating text based on criteria  set
//   */
//  private String getCriteriaText(Set<CriteriaBO> criteriaSet) {
//    final StringBuilder applyToStatisticsBuilder = new StringBuilder(i18nConstants.evaluations_listOfEvaluations_evaluate_showEvaluationParameters_applyToStatististics()).append(": ");
//    final StringBuilder mainCriteriaBuilder = new StringBuilder(i18nConstants.evaluations_listOfEvaluations_evaluate_showEvaluationParameters_mainCriteria()).append(":\n");
//    final StringBuilder criteriaBuilder = new StringBuilder(i18nConstants.evaluations_listOfEvaluations_evaluate_showEvaluationParameters_subCriteria()).append(":\n");
//
//    for (CriteriaBO criteria : criteriaSet) {
//      final String criteriaString = criteriaToString(criteria);
//      if (criteria.getIsMain()) {
//        applyToStatisticsBuilder.append(criteria.getEvaluationBO().getApplyToStatistics());
//        applyToStatisticsBuilder.append("\n");
//        mainCriteriaBuilder.append(criteriaString);
//      } else {
//        criteriaBuilder.append(criteriaString);
//      }
//    }
//    mainCriteriaBuilder.append(criteriaBuilder.toString());
//    applyToStatisticsBuilder.append(mainCriteriaBuilder.toString());
//    return applyToStatisticsBuilder.toString();
//  }
//
//
//  /**
//   * Creates text for every single criteria
//   *
//   * @param criteria criteria for creating text
//   * @return text for every single criteria
//   */
//  private String criteriaToString(CriteriaBO criteria) {
//    DateTimeFormat dateFormat = DateTimeFormat.getShortDateFormat();
//    DateTimeFormat timeFormat = DateTimeFormat.getShortTimeFormat();
//
//    final StringBuilder builder = new StringBuilder();
//    if (criteria.getIsMain()) {
//      builder.append(" ").append(i18nConstants.evaluations_listOfEvaluations_evaluate_showEvaluationsParameters_allowCallReplacement_text()).append(": ").append(criteria.getAllowCallReplacement()).append("\n");
//      builder.append(" ").append(i18nConstants.evaluations_listOfEvaluations_evaluate_showEvaluationsParameters_allowCallSelection_text()).append(": ").append(criteria.getAllowCallSelection()).append("\n");
//      builder.append(" ").append(i18nConstants.evaluations_listOfEvaluations_evaluate_showEvaluationsParameters_countTotalInteractions_text()).append(": ").append(criteria.getTotalEvents()).append("\n");
//      builder.append(" ").append(i18nConstants.evaluations_listOfEvaluations_evaluate_showEvaluationsParameters_allowCallFilling_text()).append(": ").append(criteria.getAllowCallFilling()).append("\n");
//
//    }
//
//    builder.append(" ").append(i18nConstants.evaluations_listOfEvaluations_evaluate_showEvaluationsParameters_PeriodFrom_text()).append(": ").append(criteria.getPeriodFrom() != null ? dateFormat.format(criteria.getPeriodFrom()) : "").append("\n");
//    builder.append(" ").append(i18nConstants.evaluations_listOfEvaluations_evaluate_showEvaluationsParameters_PeriodTo_text()).append(": ").append(criteria.getPeriodTo() != null ? dateFormat.format(criteria.getPeriodTo()) : "").append("\n");
//    builder.append(" ").append(i18nConstants.evaluations_listOfEvaluations_evaluate_showEvaluationsParameters_DayTimeFrom_text()).append(": ").append(criteria.getDaytimeFrom() != null ? timeFormat.format(criteria.getDaytimeFrom()) : "").append("\n");
//    builder.append(" ").append(i18nConstants.evaluations_listOfEvaluations_evaluate_showEvaluationsParameters_DayTimeTo_text()).append(": ").append(criteria.getDaytimeTo() != null ? timeFormat.format(criteria.getDaytimeTo()) : "").append("\n");
//    builder.append(" ").append(i18nConstants.evaluations_listOfEvaluations_evaluate_showEvaluationsParameters_MinLength_text()).append(": ").append(criteria.getMinimalLength() != null ? new TimeFormator(criteria.getMinimalLength() * 1000).minutesSeconds() : "").append("\n");
//    builder.append(" ").append(i18nConstants.evaluations_listOfEvaluations_evaluate_showEvaluationsParameters_MaxLength_text()).append(": ").append(criteria.getMaximalLength() != null ? new TimeFormator(criteria.getMaximalLength() * 1000).minutesSeconds() : "").append("\n");
//
//    builder.append(" ").append(i18nConstants.evaluations_listOfEvaluations_evaluate_showEvaluationsParameters_callDirection_text()).append(": ").append(EnumModelDataFactory.getLocalizedName(criteria.getCallDirectionEnum())).append("\n");
//    builder.append(" ").append(i18nConstants.evaluations_listOfEvaluations_evaluate_showEvaluationsParameters_callWrapup_text()).append(": ").append(criteria.getCallWrapupBO() == null ? "" : criteria.getCallWrapupBO().getKey()).append("\n");
//    builder.append(" ").append(i18nConstants.evaluations_listOfEvaluations_evaluate_showEvaluationsParameters_interactions_text()).append(": \n");
//    for (MediaLimitBO mediaLimit : criteria.getMediaLimit()) {
//      builder.append("  ").append(mediaLimit.getInteractionTypeBO().getName()).append(": ").append(mediaLimit.getMinimum()).append("\n");
//    }
//    builder.append(" ").append(i18nConstants.evaluations_listOfEvaluations_evaluate_showEvaluationsParameters_externalData_text()).append(": \n");
//    for (ExternalDataBO externalData : criteria.getExternalData()) {
//      builder.append("  ").append(externalData.getKey()).append(": ").append(externalData.getValue()).append("\n\n");
//    }
//    return builder.toString();
//  }


//  @Override
//  public void openEvaluationPlannerTab() {
//    evaluationPlannerTM.displayTab();
//  }
//
//  @Override
//  public void openTrainingPlannerTab() {
//    trainingPlannerTM.displayTab();
//  }


//  public TabItem getAboutPanel() {
//    return new AboutPanel(new BaseBean(), getInstance(), i18nConstants.guiFactoryImpl_branch_about());
//  }
//
//  public void refreshComponentsAfterRelogin() {
//    if (dashboardTM != null) {
//      AbstractPanel dashboardTab = dashboardTM.getFirstTab();
//      if (dashboardTab instanceof DashboardPane) {
//        DashboardPane dashboardPane = (DashboardPane) dashboardTab;
//        dashboardPane.reload();
//      }
//    }
//  }
//
  private class NavigationData extends BaseTreeModel {
  //    private List<ScorecardLicenseInfo.AppFeature> allowedFeatures = new ArrayList<ScorecardLicenseInfo.AppFeature>();
//    private List<LogiReportsEntry> logiReports = new LinkedList<LogiReportsEntry>();
//    private static final long serialVersionUID = 848772285615564976L;
//
  public NavigationData(NavigationPanelOptions options) {
    // defensive copy
//      this.allowedFeatures.addAll(options.getAllowedFeatures());
//      this.logiReports.addAll(options.getLogiReports());
  }

  private NavigationData() {
  }
//}
//
    TreeModel getModel() {
//      addDashboardIfVisible();
//      addEvaluationsIfVisible();
//      addCustomerInteractions();
//      addQuestionnairesIfVisible();
//      addSurveyListIfVisible();
//      addTrainingIfVisible();
//      addSpeechTagsIfVisible();
//      addReportsIfVisible();
//      addAdministrationIfVisible();
//      // about is always visible - don't check features
//      addAbout();
//
      return this;

    }
}
//
//    private void addEvaluationsIfVisible() {
//      if (UserUtils.getInstance().isCurrentUserPermitted(Rights.VIEW_MY_EVALS, Rights.VIEW_EVALS, Rights.VIEW_TEAM_EVALS,
//          Rights.VIEW_ALL_EVALS, Rights.CREATE_EVALS, Rights.PLAN_ALL_EVALS, Rights.PLAN_GROUP_EVALS) && isEvaluationVisible()) {
//        // evaluation's list node
//        final TabManager evaluationListTM = new EmptyTabManager(mainPanel);
//        final TreeModel evaluationsList = new NavigationTreeNode(i18nConstants.guiFactoryImpl_branch_evaluationListNode(), evaluationListTM);
//        evaluationsList.set(NavigationTreeNode.ID, ObjectIds.NAVIGATIONPANEL_EVALUATIONS_NODE_ID);
//        add(evaluationsList);
//
//        if (UserUtils.getInstance().isCurrentUserPermitted(Rights.VIEW_MY_EVALS, Rights.VIEW_EVALS, Rights.VIEW_TEAM_EVALS, Rights.VIEW_ALL_EVALS)) {
//          // list of evaluation(s) node
//          listOfEvaluationsManagerTM = new AbstractTabManager(mainPanel, true, true) {
//            @Override
//            protected AbstractPanel createTab(BaseBean baseBean) {
//              return getListOfEvaluationsPanel(baseBean);
//            }
//          };
//          final TreeModel listOfEvaluationsManager = new NavigationTreeNode(i18nConstants.guiFactoryImpl_branch_listOfEvaluationsNode(), listOfEvaluationsManagerTM);
//          listOfEvaluationsManager.set("icon", "icon-evaluate");
//          listOfEvaluationsManager.set(NavigationTreeNode.ID, ObjectIds.NAVIGATIONPANEL_LIST_OF_EVALUATIONS_NODE_ID);
//          evaluationsList.add(listOfEvaluationsManager);
//        }
//
//        if (UserUtils.getInstance().isCurrentUserPermitted(Rights.CREATE_EVALS, Rights.PLAN_ALL_EVALS, Rights.PLAN_GROUP_EVALS, Rights.SELF_EVALUATE)) {
//          // evaluation's planner node
//          evaluationPlannerTM = new AbstractTabManager(mainPanel, true, true) {
//            @Override
//            protected AbstractPanel createTab(BaseBean baseBean) {
//              AbstractPanel tab = new EvaluationPlannerPanel(baseBean, getInstance(), i18nConstants.guiFactoryImpl_branch_evaluations_evaluationPlanner(), false);
//              tab.addListener(Events.Close, new Listener<BaseEvent>() {
//                @Override
//                public void handleEvent(BaseEvent be) {
//                  // user may not have permission to see the list of evaluations. in that case listOfEvaluationsManagerTM will be null
//                  if (listOfEvaluationsManagerTM != null) {
//                    AbstractPanel listOfEvaluationsTab = listOfEvaluationsManagerTM.getFirstTab();
//                    if (listOfEvaluationsTab instanceof EvaluationList) {
//                      EvaluationList listOfEvaluationsPanel = (EvaluationList) listOfEvaluationsTab;
//                      listOfEvaluationsPanel.reload();
//                    }
//                  }
//                }
//              });
//              return tab;
//            }
//          };
//          final TreeModel evaluationsPlanner = new NavigationTreeNode(i18nConstants.guiFactoryImpl_branch_evaluationPlannerNode(), evaluationPlannerTM);
//          evaluationsPlanner.set("icon", "icon-date-magnify");
//          evaluationsPlanner.set(NavigationTreeNode.ID, ObjectIds.NAVIGATIONPANEL_EVALUATION_PLANNER_NODE_ID);
//          evaluationsList.add(evaluationsPlanner);
//        }
//      }
//    }
//
//    private void addDashboardIfVisible() {
//      if (UserUtils.getInstance().isCurrentUserPermitted(Rights.VIEW_REPORTS, Rights.VIEW_ALL_REPORTS) && isDashboardVisible()) {
//        // dashboard
//        final TabManager dashboardTM = new AbstractTabManager(mainPanel, true, true) {
//          @Override
//          protected AbstractPanel createTab(BaseBean baseBean) {
//            return createDashboardPane();
//          }
//        };
//        final TreeModel dashboardTreeModel = new NavigationTreeNode(i18nConstants.navigation_dashboard_title(), dashboardTM);
//        dashboardTreeModel.set("icon", "icon-dashboard");
//        dashboardTreeModel.set(NavigationTreeNode.ID, ObjectIds.NAVIGATIONPANEL_DASHBOARD_NODE_ID);
//        add(dashboardTreeModel);
//        // according to user's settings display tab automatically
//        if (UserUtils.getInstance().getPropertyBooleanValue(UserSettingsBO.KEY.DASHBOARD_ENABLED, false)) {
//          dashboardTM.displayTab();
//        }
//      }
//    }
//
//    private void addCustomerInteractions() {
//      if (UserUtils.getInstance().isCurrentUserPermitted(Rights.INTERACTIONS_AGENT_VIEW, Rights.INTERACTIONS_FULL_VIEW,
//              Rights.INTERACTIONS_GROUP_VIEW) && isInteractionsVisible()) {
//        // interactions node
//        TabManager interactionTM = new SimpleTabManager(new AppEvent(InteractionEvents.init));
//
//        final TreeModel interactionsManager = new NavigationTreeNode(i18nConstants.guiFactoryImpl_branch_interactionsNode(), interactionTM);
//        interactionsManager.set("icon", "icon-navigation-interactions");
//        interactionsManager.set(NavigationTreeNode.ID, ObjectIds.NAVIGATIONPANEL_CUSTOMER_INTERACTIONS_NODE_ID);
//        add(interactionsManager);
//      }
//    }
//
//    private void addQuestionnairesIfVisible() {
//      if (UserUtils.getInstance().isCurrentUserPermitted(Rights.MANAGE_QUESTIONNAIRES) && isQuestionnairesVisible()) {
//        // questionaire's list node
//        final TabManager questionairesListTM = new EmptyTabManager(mainPanel);
//        final TreeModel questionairesList = new NavigationTreeNode(i18nConstants.guiFactoryImpl_branch_questionairesListNode(), questionairesListTM);
//        questionairesList.set(NavigationTreeNode.ID, ObjectIds.NAVIGATIONPANEL_QUESTIONNAIRES_NODE_ID);
//        add(questionairesList);
//
//        // questionaire manager node
//        final TabManager questionaireManagerTM = new AbstractTabManager(mainPanel, true, true) {
//          @Override
//          protected AbstractPanel createTab(BaseBean baseBean) {
//            return createQuestionaireManagerPanel(baseBean);
//          }
//        };
//        final TreeModel quesionnaireManager = new NavigationTreeNode(i18nConstants.guiFactoryImpl_branch_questionaireManagerNode(), questionaireManagerTM);
//        quesionnaireManager.set("icon", "icon-application-form-edit");
//        quesionnaireManager.set(NavigationTreeNode.ID, ObjectIds.NAVIGATIONPANEL_QUESTIONNAIRE_MANAGER_NODE_ID);
//        questionairesList.add(quesionnaireManager);
//      }
//    }
//
//    private void addSpeechTagsIfVisible() {
//      // speech tags node
//      if (UserUtils.getInstance().isCurrentUserPermitted(Rights.MANAGE_SPEECH_TAG) && isSpeechTagsVisible()) {
//        add(createSpeechTagsTreeModel());
//      }
//    }
//
//    private void addTrainingIfVisible() {
//      if (UserUtils.getInstance().isCurrentUserPermitted(Rights.CREATE_EVALS, Rights.PLAN_ALL_EVALS, Rights.PLAN_GROUP_EVALS,
//              Rights.SELF_EVALUATE, Rights.VIEW_ALL_EVALS, Rights.VIEW_EVALS, Rights.VIEW_MY_EVALS, Rights.VIEW_TEAM_EVALS) && isTrainingVisible()) {
//        // evaluation's planner node for eLearning training
//        final TabManager trainingListTM = new EmptyTabManager(mainPanel);
//        final TreeModel trainingList = new NavigationTreeNode(i18nConstants.guiFactoryImpl_branch_trainingListNode(), trainingListTM);
//        trainingList.set(NavigationTreeNode.ID, ObjectIds.NAVIGATIONPANEL_TRAINING_NODE_ID);
//        add(trainingList);
//
//        addTrainingList(trainingList);
//        addTrainingPlanner(trainingList);
//      }
//    }
//
//    private void addTrainingList(TreeModel trainingList) {
//      if (UserUtils.getInstance().isCurrentUserPermitted(Rights.VIEW_MY_EVALS, Rights.VIEW_EVALS, Rights.VIEW_TEAM_EVALS, Rights.VIEW_ALL_EVALS)) {
//        // list of evaluation(s) node
//        AbstractTabManager listOfTrainingManagerTM = new AbstractTabManager(mainPanel, true, true) {
//          @Override
//          protected AbstractPanel createTab(BaseBean baseBean) {
//            return getListOfTrainingPanel(baseBean);
//          }
//        };
//        final TreeModel listOfTrainingManager = new NavigationTreeNode(i18nConstants.guiFactoryImpl_branch_listOfTrainingNode(), listOfTrainingManagerTM);
//        listOfTrainingManager.set("icon", "icon-navigation-training-list");
//        listOfTrainingManager.set(NavigationTreeNode.ID, ObjectIds.NAVIGATIONPANEL_LIST_OF_TRAINING_NODE_ID);
//        trainingList.add(listOfTrainingManager);
//      }
//    }
//
//    private void addTrainingPlanner(TreeModel trainingList) {
//      if (UserUtils.getInstance().isCurrentUserPermitted(Rights.CREATE_EVALS, Rights.PLAN_ALL_EVALS, Rights.PLAN_GROUP_EVALS)) {
//        // evaluation's planner node for eLearning training
//        trainingPlannerTM = new SimpleTabManager(new AppEvent(TrainingEvents.init));
//        final TreeModel trainingPlanner = new NavigationTreeNode(i18nConstants.guiFactoryImpl_branch_trainingPlannerNode(), trainingPlannerTM);
//        trainingPlanner.set("icon", "icon-navigation-training-planner");
//        trainingPlanner.set(NavigationTreeNode.ID, ObjectIds.NAVIGATIONPANEL_TRAINING_PLANNER_NODE_ID);
//        trainingList.add(trainingPlanner);
//      }
//    }
//
//    private void addSurveyListIfVisible() {
//      if (UserUtils.getInstance().isCurrentUserPermitted(Rights.VIEW_MY_EVALS, Rights.VIEW_EVALS, Rights.VIEW_TEAM_EVALS, Rights.VIEW_ALL_EVALS) && isSurveyVisible()) {
//        // list of evaluation(s) node
//        AbstractTabManager listOfIVRManagerTM = new AbstractTabManager(mainPanel, true, true) {
//          @Override
//          protected AbstractPanel createTab(BaseBean baseBean) {
//            return getListOfIVRPanel(baseBean);
//          }
//        };
//        final TreeModel listOfIVRManager = new NavigationTreeNode(i18nConstants.guiFactoryImpl_branch_listOfIVRNode(), listOfIVRManagerTM);
//        listOfIVRManager.set("icon", "icon-navigation-ivr");
//        listOfIVRManager.set(NavigationTreeNode.ID, ObjectIds.NAVIGATIONPANEL_LIST_OF_IVR_NODE_ID);
//        add(listOfIVRManager);
//      }
//    }
//
//    private void addReportsIfVisible() {
//      if (UserUtils.getInstance().isCurrentUserPermitted(Rights.VIEW_REPORTS, Rights.VIEW_ALL_REPORTS,
//              Rights.VIEW_DATA_WAREHOUSE_REPORTS) && isReportsVisible()) {
//        // reportsList node
//        final TabManager reportsListTM = new EmptyTabManager(mainPanel);
//        final TreeModel reportsList = new NavigationTreeNode(i18nConstants.guiFactoryImpl_branch_reportsNode(), reportsListTM);
//        reportsList.set(NavigationTreeNode.ID, ObjectIds.NAVIGATIONPANEL_REPORTS_NODE_ID);
//
//        addGxtReports(reportsList);
//        addLogiReports(reportsList);
//
//        // only add if there are actually reports to show
//        if (reportsList.getChildCount() > 0) {
//          add(reportsList);
//        }
//      }
//    }
//
//    private void addLogiReports(TreeModel reportsList) {
//      for (final LogiReportsEntry logiEntry : logiReports) {
//        // seems it's enough if the user has only one permission
//        if (isValidLogiReport(logiEntry)) {
//          final TabManager logiReportManager = new AbstractTabManager(mainPanel) {
//            @Override
//            protected AbstractPanel createTab(BaseBean baseBean) {
//              final AbstractPanel logiPanel = new BlankPanel(baseBean, getInstance(), logiEntry.getLocalizedName());
//              UtilsService.App.getInstance().buildLogiReportCompleteUrl(logiEntry.getReportUrl(),
//                      UserUtils.getInstance().getLoggedUser(), new AsyncCallback<String>() {
//                        @Override
//                        public void onFailure(Throwable caught) {
//                          Log.error("Error when obtaining the url for logi reports: ", caught);
//                          MessageBox.alert(i18nConstants.guiFactoryImpl_logiReportsError_title(), i18nConstants.guiFactoryImpl_logiReportsError_text(), null);
//                        }
//
//                        @Override
//                        public void onSuccess(String result) {
//                          logiPanel.setUrl(result);
//                        }
//                      });
//              return logiPanel;
//            }
//          };
//          final TreeModel logiReportPanel = new NavigationTreeNode(logiEntry.getLocalizedName(), logiReportManager);
//          logiReportPanel.set("icon", "icon-graph");
//          logiReportPanel.set(NavigationTreeNode.ID, ObjectIds.NAVIGATIONPANEL_LOGI_REPORT_NODE_ID + logiEntry.getReportId());
//          reportsList.add(logiReportPanel);
//        }
//      }
//    }
//
//    private void addGxtReports(TreeModel reportsList) {
//      if (UserUtils.getInstance().isCurrentUserPermitted(Rights.VIEW_REPORTS, Rights.VIEW_ALL_REPORTS)) {
//        // question trend chart
//        final TabManager trendChartTM = new AbstractTabManager(mainPanel) {
//          @Override
//          protected AbstractPanel createTab(BaseBean baseBean) {
//            return new QuestionTrendChartPanel(baseBean, getInstance(), i18nConstants.guiFactoryImpl_branch_reports_questionTrendChart());
//          }
//        };
//        final TreeModel questionTrendChart = new NavigationTreeNode(i18nConstants.guiFactoryImpl_branch_graphsNode_trendChart(), trendChartTM);
//        questionTrendChart.set("icon", "icon-graph");
//        questionTrendChart.set(NavigationTreeNode.ID, ObjectIds.NAVIGATIONPANEL_QUESTION_TREND_NODE_ID);
//        reportsList.add(questionTrendChart);
//
//        // compare scores export
//        final TabManager compareScoresManager = new AbstractTabManager(mainPanel) {
//          @Override
//          protected AbstractPanel createTab(BaseBean baseBean) {
//            return new CompareScoresPanel(baseBean, getInstance());
//          }
//        };
//        final TreeModel compareScoresPanel = new NavigationTreeNode(i18nConstants.guiFactoryImpl_branch_charts_compareScores(), compareScoresManager);
//        compareScoresPanel.set("icon", "icon-graph");
//        compareScoresPanel.set(NavigationTreeNode.ID, ObjectIds.NAVIGATIONPANEL_COMPARE_SCORES_NODE_ID);
//        reportsList.add(compareScoresPanel);
//
//        // interactions volume
//        final TabManager interactionsVolumeManager = new AbstractTabManager(mainPanel) {
//          @Override
//          protected AbstractPanel createTab(BaseBean baseBean) {
//            return new InteractionsVolumeChartPanel(baseBean, getInstance(), i18nConstants.guiFactoryImpl_branch_charts_interactionsVolume());
//          }
//        };
//        final TreeModel interactionsVolumePanel = new NavigationTreeNode(i18nConstants.guiFactoryImpl_branch_charts_interactionsVolume(), interactionsVolumeManager);
//        interactionsVolumePanel.set("icon", "icon-graph");
//        interactionsVolumePanel.set(NavigationTreeNode.ID, ObjectIds.NAVIGATIONPANEL_INTERACTION_VOLUME_NODE_ID);
//        reportsList.add(interactionsVolumePanel);
//
//        // evaluations volume
//        final TabManager evaluationsVolumeManager = new AbstractTabManager(mainPanel) {
//          @Override
//          protected AbstractPanel createTab(BaseBean baseBean) {
//            return new EvaluationsVolumeChartPanel(baseBean, getInstance(), i18nConstants.guiFactoryImpl_branch_charts_evaluationsVolume());
//          }
//        };
//        final TreeModel evaluationsVolumePanel = new NavigationTreeNode(i18nConstants.guiFactoryImpl_branch_charts_evaluationsVolume(), evaluationsVolumeManager);
//        evaluationsVolumePanel.set("icon", "icon-graph");
//        evaluationsVolumePanel.set(NavigationTreeNode.ID, ObjectIds.NAVIGATIONPANEL_EVALUATION_VOLUME_NODE_ID);
//        reportsList.add(evaluationsVolumePanel);
//      }
//    }
//
//    private boolean isValidLogiReport(LogiReportsEntry logiEntry) {
//      return !logiEntry.getPermissions().isEmpty()
//              && UserUtils.getInstance().isCurrentUserPermitted(logiEntry.getPermissions().toArray(
//                                new RightBO.Rights[logiEntry.getPermissions().size()]))
//              && logiEntry.getReportUrl() != null
//              && !logiEntry.getReportUrl().isEmpty();
//    }
//
//
//    private void addAdministrationIfVisible() {
//      if (UserUtils.getInstance().isCurrentUserPermitted(Rights.MANAGE_USERS, Rights.MANAGE_ROLES, Rights.EDIT_SETTINGS,
//              Rights.VIEW_AUDIT, Rights.EDIT_INTERACTION_TYPES, Rights.RESET_TEAM_PASSWORD, Rights.RESET_ALL_PASSWORD) && isAdministrationVisible()) {
//        // administration node
//        final TabManager administrationTM = new EmptyTabManager(mainPanel);
//        final TreeModel administration = new NavigationTreeNode(i18nConstants.guiFactoryImpl_branch_administrationNode(), administrationTM);
//        administration.set(NavigationTreeNode.ID, ObjectIds.NAVIGATIONPANEL_ADMINSTRATION_NODE_ID);
//        add(administration);
//
//        if (UserUtils.getInstance().isCurrentUserPermitted(Rights.RESET_TEAM_PASSWORD, Rights.RESET_ALL_PASSWORD, Rights.MANAGE_USERS)) {
//          // group manager node
//          final TabManager groupManagerTM;
//
//          if (UserUtils.getInstance().isCurrentUserPermitted(Rights.RESET_ALL_PASSWORD, Rights.MANAGE_USERS)) {
//            groupManagerTM = new AbstractTabManager(mainPanel, true, true) {
//              @Override
//              protected AbstractPanel createTab(BaseBean baseBean) {
//                return new GroupManagerPanel(baseBean, getInstance(), i18nConstants.guiFactoryImpl_branch_administration_groupManager());
//              }
//            };
//          } else {
//            groupManagerTM = new EmptyTabManager(mainPanel);
//          }
//          final TreeModel groupManager = new NavigationTreeNode(i18nConstants.guiFactoryImpl_branch_groupManagerNode(), groupManagerTM);
//          groupManager.set(NavigationTreeNode.ID, ObjectIds.NAVIGATIONPANEL_GROUP_MANAGER_NODE_ID);
//          administration.add(groupManager);
//          groupsData = new GroupsData(groupManager);
//          groupsData.load();
//        }
//
//        if (UserUtils.getInstance().isCurrentUserPermitted(Rights.RESET_ALL_PASSWORD, Rights.MANAGE_USERS)) {
//          // user manager node
//          final TabManager userManagerTM = new AbstractTabManager(mainPanel, true, true) {
//            @Override
//            protected AbstractPanel createTab(BaseBean baseBean) {
//              return createUserPanel(baseBean);
//            }
//          };
//          final TreeModel userManager = new NavigationTreeNode(i18nConstants.guiFactoryImpl_branch_userManagerNode(), userManagerTM);
//          userManager.set("icon", "icon-key");
//          userManager.set(NavigationTreeNode.ID, ObjectIds.NAVIGATIONPANEL_USER_MANAGER_NODE_ID);
//          administration.add(userManager);
//        }
//
//
//        if (UserUtils.getInstance().isCurrentUserPermitted(Rights.EDIT_SETTINGS)) {
//          // category node
//          final TabManager categoryTM = new AbstractTabManager(mainPanel, true, true) {
//            @Override
//            protected AbstractPanel createTab(BaseBean baseBean) {
//              return new CategoryPanel(baseBean, getInstance(), i18nConstants.guiFactoryImpl_branch_category());
//            }
//          };
//          final TreeModel category = new NavigationTreeNode(i18nConstants.guiFactoryImpl_branch_categoryNode(), categoryTM);
//          category.set("icon", "icon-comment");
//          category.set(NavigationTreeNode.ID, ObjectIds.NAVIGATIONPANEL_CATEGORY_NODE_ID);
//          administration.add(category);
//
//          // wrap-up node
//          final TabManager wrapUpTM = new AbstractTabManager(mainPanel, true, true) {
//            @Override
//            protected AbstractPanel createTab(BaseBean baseBean) {
//              return new WrapUpPanel(baseBean, getInstance(), i18nConstants.guiFactoryImpl_branch_wrapUp());
//            }
//          };
//          final TreeModel wrapUp = new NavigationTreeNode(i18nConstants.guiFactoryImpl_branch_wrapUpNode(), wrapUpTM);
//          wrapUp.set("icon", "icon-building-edit");
//          wrapUp.set(NavigationTreeNode.ID, ObjectIds.NAVIGATIONPANEL_WRAPUP_NODE_ID);
//          administration.add(wrapUp);
//        }
//
//        if (UserUtils.getInstance().isCurrentUserPermitted(Rights.EDIT_INTERACTION_TYPES)) {
//          // interaction types node
//          final TabManager interactionTypeTM = new AbstractTabManager(mainPanel, true, true) {
//            @Override
//            protected AbstractPanel createTab(BaseBean baseBean) {
//              return new InteractionTypesPanel(baseBean, getInstance(), i18nConstants.guiFactoryImpl_branch_interactionTypes());
//            }
//          };
//          final TreeModel interactionTypes = new NavigationTreeNode(i18nConstants.guiFactoryImpl_branch_interactionTypeNode(), interactionTypeTM);
//          interactionTypes.set("icon", "icon-building-edit");
//          interactionTypes.set(NavigationTreeNode.ID, ObjectIds.NAVIGATIONPANEL_INTERACTION_TYPES_NODE_ID);
//          administration.add(interactionTypes);
//        }
//
//
//        if (UserUtils.getInstance().isCurrentUserPermitted(Rights.VIEW_AUDIT)) {
//          // auditLog node
//          final TabManager auditLogTM = new AbstractTabManager(mainPanel, true, true) {
//            @Override
//            protected AbstractPanel createTab(BaseBean baseBean) {
//              return new AdministrationAuditLogPanel(baseBean, getInstance(), i18nConstants.guiFactoryImpl_branch_auditLog());
//            }
//          };
//          final TreeModel auditLog = new NavigationTreeNode(i18nConstants.guiFactoryImpl_branch_auditLogNode(), auditLogTM);
//          auditLog.set("icon", "icon-monitor-error");
//          auditLog.set(NavigationTreeNode.ID, ObjectIds.NAVIGATIONPANEL_AUDIT_NODE_ID);
//          administration.add(auditLog);
//        }
//
//        if (UserUtils.getInstance().isCurrentUserPermitted(Rights.MANAGE_ROLES)) {
//          // role manager node
//          final TabManager roleManagementTM = new AbstractTabManager(mainPanel, true, true) {
//            @Override
//            protected AbstractPanel createTab(BaseBean baseBean) {
//              return new RoleManagerPanel(baseBean, getInstance(), i18nConstants.administration_roleManagement_tabItem_title());
//            }
//          };
//          final TreeModel roleManager = new NavigationTreeNode(i18nConstants.guiFactoryImpl_branch_roleManagementNode(), roleManagementTM);
//          roleManager.set("icon", "icon-role-manager");
//          roleManager.set(NavigationTreeNode.ID, ObjectIds.NAVIGATIONPANEL_ROLE_MANAGER_NODE_ID);
//          administration.add(roleManager);
//        }
//
//        if (UserUtils.getInstance().isCurrentUserPermitted(Rights.EDIT_ADMIN_SETTING)) {
//          // ApplicationOptions node
//          final TabManager appOptionTM = new AbstractTabManager(mainPanel, true, true) {
//            @Override
//            protected AbstractPanel createTab(BaseBean baseBean) {
//              return new ApplicationOptionsPanel(baseBean, getInstance(), i18nConstants.guiFactoryImpl_branch_applicationOptions());
//            }
//          };
//          final TreeModel appOption = new NavigationTreeNode(i18nConstants.guiFactoryImpl_branch_applicationOptionsNode(), appOptionTM);
//          appOption.set("icon", "icon-cog");
//          appOption.set(NavigationTreeNode.ID, ObjectIds.NAVIGATIONPANEL_OPTIONS_NODE_ID);
//          administration.add(appOption);
//        }
//      }
//    }
//
//    private void addAbout() {
//      final TabManager aboutTM = new AbstractTabManager(mainPanel, true, true) {
//        @Override
//        protected AbstractPanel createTab(BaseBean baseBean) {
//          return new AboutPanel(baseBean, getInstance(), i18nConstants.guiFactoryImpl_branch_about());
//        }
//      };
//      final TreeModel about = new NavigationTreeNode(i18nConstants.guiFactoryImpl_branch_aboutNode(), aboutTM);
//      about.set("icon", "icon-information");
//      about.set(NavigationTreeNode.ID, ObjectIds.NAVIGATIONPANEL_ABOUT_NODE_ID);
//      add(about);
//    }
//
//    private boolean isDashboardVisible() {
//      return allowedFeatures.contains(ScorecardLicenseInfo.AppFeature.STANDARD_SCORECARD);
//    }
//
//    private boolean isEvaluationVisible() {
//      return allowedFeatures.contains(ScorecardLicenseInfo.AppFeature.STANDARD_SCORECARD);
//    }
//
//    private boolean isAdministrationVisible() {
//      return allowedFeatures.contains(ScorecardLicenseInfo.AppFeature.CUSTOMER_INTERACTIONS) ||
//              allowedFeatures.contains(ScorecardLicenseInfo.AppFeature.STANDARD_SCORECARD) ||
//              allowedFeatures.contains(ScorecardLicenseInfo.AppFeature.SPEECH_REC);
//    }
//
//    private boolean isQuestionnairesVisible() {
//      return allowedFeatures.contains(ScorecardLicenseInfo.AppFeature.STANDARD_SCORECARD);
//      }
//    private boolean isReportsVisible() {
//      return allowedFeatures.contains(ScorecardLicenseInfo.AppFeature.STANDARD_SCORECARD);
//    }
//
//    private boolean isSpeechTagsVisible() {
//      return allowedFeatures.contains(ScorecardLicenseInfo.AppFeature.SPEECH_REC);
//    }
//
//    private boolean isInteractionsVisible() {
//      return allowedFeatures.contains(ScorecardLicenseInfo.AppFeature.STANDARD_SCORECARD) ||
//              allowedFeatures.contains(ScorecardLicenseInfo.AppFeature.CUSTOMER_INTERACTIONS) ||
//              allowedFeatures.contains(ScorecardLicenseInfo.AppFeature.SPEECH_REC);
//    }
//
//    private boolean isTrainingVisible() {
//      return allowedFeatures.contains(ScorecardLicenseInfo.AppFeature.ELEARNING);
//    }
//
//    private boolean isSurveyVisible() {
//      return allowedFeatures.contains(ScorecardLicenseInfo.AppFeature.SURVEYING);
//    }
//
//    private DashboardPane createDashboardPane() {
//      return new DashboardPane(new BaseBean(), GuiFactoryImpl.this, i18nConstants.dashboard_panel_title());
//    }
//  }
//
//  /**
//   * Helper class loading user groups into navigation tree
//   */
//  class GroupsData extends BaseTreeModel {
//    private static final long serialVersionUID = 1093540648451200131L;
//    // node object keeps group and panel - this are keys for obtaining this objects
//    public static final String GROUP = "group";
//    public static final String PANEL = "panel";
//    // user groups root node
//    private TreeModel model;
//    // manages tabs assigned to nodes
//    private final TabManager groupTabManager;
//    // panel displaying users assigned to selected group
//    private UsersByGroupPanel groupsManagementPanel = new UsersByGroupPanel(new BaseBean(), GuiFactoryImpl.this);
//
//    private Comparator groupComparator = new GroupNameComparator();
//
//
//    /**
//     * Creates new instance based on root node passed as a parameter
//     *
//     * @param root root node for group's nodes
//     */
//    private GroupsData(TreeModel root) {
//      super();
//      model = root;
//
//      groupTabManager = new AbstractTabManager(GuiFactoryImpl.this.getMainPanel(), true, true) {
//        @Override
//        protected AbstractPanel createTab(BaseBean baseBean) {
//          return groupsManagementPanel;
//        }
//      };
//    }
//
//
//    /**
//     * Loads remotely groups
//     */
//    void load() {
//      final GroupServiceAsync groupService = Registry.get(GroupService.REGISTRY_GROUP_SERVICE);
//      if (UserUtils.getInstance().isCurrentUserPermitted(Rights.RESET_ALL_PASSWORD, Rights.MANAGE_USERS, Rights.MANAGE_ROLES)) {
//        groupService.getRootGroup(Boolean.TRUE, new ScorecardAsyncCallback<CcGroupBO>() {
//          @Override
//          public void handleSuccess(CcGroupBO root) {
//            model.removeAll();
//            createNode(model, root);
//          }
//        });
//      } else {
//        Set<CcGroupBO> groups = UserUtils.getInstance().getLoggedUser().getBelongsToCcGroups();
//        if (groups.size() == 1) {
//          groupService.getGroup(groups.iterator().next(), new ScorecardAsyncCallback<CcGroupBO>() {
//            @Override
//            public void handleSuccess(CcGroupBO root) {
//              model.removeAll();
//              createNode(model, root);
//            }
//          });
//        }
//      }
//
//    }
//
//    private void createNode(TreeModel model, CcGroupBO group) {
//      final TreeModel node = new NavigationTreeNode(group.getName(), groupTabManager);
//      node.set(GROUP, group);
//      node.set(PANEL, groupsManagementPanel);
//      node.set(NavigationTreeNode.ICON, "icon-group");
//      node.set(NavigationTreeNode.ID, createModelId(node));
//      model.add(node);
//      processChildren(node, group);
//    }
//
//
//    /**
//     * Creates recursive tree model based on passed params
//     *
//     * @param group parent group
//     */
//    private void processChildren(TreeModel model, CcGroupBO group) {
//      // collection to store the sorted children of a node
//      Collection<CcGroupBO> sortedChildrenGroups;
//
//      /* only create sorted collection if there are enough children to be sorted */
//      if (group.getChildrenGroups().size() < 2) {
//        sortedChildrenGroups = group.getChildrenGroups();
//      } else {
//        /* a set can't be ordered, so a list is used instead */
//        sortedChildrenGroups = new ArrayList<CcGroupBO>(group.getChildrenGroups());
//        Collections.sort((ArrayList<CcGroupBO>) sortedChildrenGroups, groupComparator);
//      }
//
//      for (CcGroupBO child : sortedChildrenGroups) {
//        createNode(model, child);
//      }
//    }

    private String createModelId(TreeModel model) {
      String groupName = model.<String>get(NavigationTreeNode.NAME).replaceAll("\\s", "");
      return new StringBuilder().append(ObjectIds.NAVIGATIONPANEL_GROUP_NODE_PREFIX_ID).append(groupName).append(ObjectIds.NAVIGATIONPANEL_GROUP_NODE_SUFFIX_ID).toString();
    }

//    /**
//     * Comparator to sort CCGroups by name
//     */
//    private class GroupNameComparator implements Comparator<CcGroupBO> {
//      @Override
//      public int compare(CcGroupBO o1, CcGroupBO o2) {
//        return GuiTools.compareLocaleSensitive(o1.getCcgroupname(), o2.getCcgroupname());
//      }
//    }
//  }
//
//  /**
//   * Shows {@link LoginDialog} to enable user relogin to application
//   *
//   * @see cz.zoom.scorecard.webui.client.gui.GuiFactory#showReLoginDialog(cz.zoom.scorecard.webui.client.gui.LoginDialog.LoginClient)
//   */
//  @Override
//  public void showReLoginDialog(LoginClient client) {
//    new LoginDialog(client, UserUtils.getInstance().getLoggedUser()).show();
//  }
//
//  private TreeModel createSpeechTagsTreeModel() {
//    // speechTags manager node
//    final TabManager speechTagsManagerTM = new AbstractTabManager(mainPanel, true, true) {
//      @Override
//      protected AbstractPanel createTab(BaseBean baseBean) {
//        return createSpeechTagsManagerPanel(baseBean);
//      }
//    };
//
//    final TreeModel speechTagsManager = new NavigationTreeNode(i18nConstants.guiFactoryImpl_branch_speechTagsManagerNode(), speechTagsManagerTM);
//    speechTagsManager.set(ITEM_TREE_ICON, SPEECH_TAG_TREE_ICON);
//    speechTagsManager.set(NavigationTreeNode.ID, "navigationPanel_speechTagsManagerNode");
//    return speechTagsManager;
//  }
//
//  @Override
//  public AbstractPanel createSpeechTagsManagerPanel(BaseBean baseBean) {
//    return new SpeechTagParentPanel(baseBean, this);
//  }
}