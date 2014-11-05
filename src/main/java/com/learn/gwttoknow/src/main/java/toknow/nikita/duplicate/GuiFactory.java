package toknow.nikita.duplicate;

import com.extjs.gxt.ui.client.widget.TabPanel;
import com.google.gwt.user.client.ui.Widget;
import toknow.server.BaseBean;

import java.util.Set;


/** @author Stanislav Valenta, 22.5.2009 */
public interface GuiFactory {

  public NavigationPanel getNavigationPanel(final NavigationPanelOptions options);

  public TabPanel getMainPanel();

  public Widget createToolPanel();

  public AbstractPanel createUserPanel(BaseBean baseBean);

  public AbstractPanel createQuestionaireManagerPanel(BaseBean baseBean);

//  public void showLoginDialog(LoginDialog.LoginClient client);

//  public void showReLoginDialog(LoginDialog.LoginClient client);

//  public EvaluationsParametersWindow createEvaluationsParametersWindow(BaseBean baseBean, Set<CriteriaBO> criteria);

  public void reloadNavigationPanel();

  public void openEvaluationPlannerTab();

  public AbstractPanel getListOfEvaluationsPanel(BaseBean baseBean);

  public AbstractPanel getListOfTrainingPanel(BaseBean baseBean);

  public AbstractPanel getListOfIVRPanel(BaseBean baseBean);

//  ScorecardDashboard createDashboard(DashboardConfig config);
//  ScorecardWidget createWidget(WidgetConfig widgetConfig, ScorecardDashboard dashboard);

  public AbstractPanel createSpeechTagsManagerPanel(BaseBean baseBean);

  void openTrainingPlannerTab();
}