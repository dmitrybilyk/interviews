package com.learn.web.scheduler;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.util.concurrent.ScheduledFuture;
//import org.apache.shiro.mgt.AuthenticatingSecurityManager;
//import org.apache.shiro.mgt.DefaultSecurityManager;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Scheduler {
  private static final String EQUALGROUP_SCHEDULER = "scheduler";
  private static final String SCHEDULED_TASK_CLASS = "scheduledTaskClass";
  private static final String GROUP_EVAL_CALL_LOOKUP_TASK = "evalCallLookupTask";
  private static final String GROUP_SURVEY_AGENT_IDENTIFICATION="surveyAgentIdentification";

  private static Scheduler instance = new Scheduler();

  private ScheduledThreadPoolExecutor threadPool = new ScheduledThreadPoolExecutor(3, new ThreadFactoryBuilder().setNameFormat("Scheduler").build());
  private List<ScheduledTask> tasks = new ArrayList<>();
//  private AuthenticatingSecurityManager securityManager = new DefaultSecurityManager();
//  private EvaluationSchedulerTask evaluationSchedulerTask;
  private ScheduledFuture<?> evaluationSchedulerFuture;

  private boolean running = false;
  public static Scheduler getInstance() {
    return instance;
  }

  public static void destroy() {
    instance = null;
  }

  /**
   * Reads from configuration equalGroups scheduler and creates instances of given ScheduledTask.
   * Tasks are configured and prepared to be planned. They are not started!
   *
   * @param config Scorecard configuration.
   * @throws InitializationException
   */
//  public synchronized void configure(@NotNull Configuration config) throws InitializationException {
//    threadPool.setRemoveOnCancelPolicy(true);
//    tasks.clear();
//    securityManager.setAuthenticator(new ScorecardAuthenticator());
//    securityManager.setRealm(new ScorecardRealm());
//
//    try {
//      Logger logger = LoggerFactory.getLogger(Scheduler.class);
//      addGenericTasks(config, logger);
//      addEvalCallLookupTask(config, logger);
//      addDataExportTask(logger);
//      configureEvaluationSchedulerTask(logger);
//    } catch (Exception e) {
//      throw new InitializationException(InitializationException.INIT_ERROR_MESSAGE, e);
//    }
//  }

//  /**
//   * Creates and adds generic scheduled tasks that are configured to be run.
//   *
//   * @param config config that contains {@link ConfigConst#SPEC_CONF_SCORECARD_WEBUI}
//   * @param logger logger for the added task to log events to
//   */
//  private void addGenericTasks(@NotNull Configuration config, @NotNull Logger logger) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvalidConfigurationException {
//    SpecifiedConfiguration tasksConfig = config.getSpecifiedConfiguration(ConfigConst.SPEC_CONF_SCORECARD_WEBUI);
//    ArrayList<EqualGroup> schedulerGroups = tasksConfig.getEqualGroups(EQUALGROUP_SCHEDULER);
//
//    for (EqualGroup schedulerGroup : schedulerGroups) {
//      Class clazz = Class.forName(schedulerGroup.getStringValue(SCHEDULED_TASK_CLASS));
//      SchedulerPlugin plugin = (SchedulerPlugin) clazz.newInstance();
//      ScheduledTask task = (ScheduledTask) Class.forName(plugin.getSchedulerClass()).newInstance();
//      task.configure(schedulerGroup, logger);
//      if (task.isEnabled()) {
//        tasks.add(task);
//      }
//    }
//  }

  /**
   * Creates and adds the Post Call Survey (IVR) EvalCall lookup task,
   * which is looking up details for eval calls
   * that are specified from IVR without complete details (such as couple SID).
   * <p/>
   * If no configuration is provided, no task will be added.
   *
   * @param config config that (optionally) contains {@link ConfigConst#SPEC_CONF_SCORECARD_BUSINESS_PCS}
   * @param logger logger for the added task to log events to
   */
//  private void addEvalCallLookupTask(@NotNull Configuration config, @NotNull Logger logger) throws InvalidConfigurationException {
//    SpecifiedConfiguration pcsConfiguration =
//            config.getSpecifiedConfiguration(ConfigConst.SPEC_CONF_SCORECARD_BUSINESS_PCS);
//    if (pcsConfiguration == null) {
//      return;
//    }
//    Group taskGroup = pcsConfiguration.getGroup(GROUP_EVAL_CALL_LOOKUP_TASK);
//    Group surveyGroup = pcsConfiguration.getGroup(GROUP_SURVEY_AGENT_IDENTIFICATION);
//    String loginExternalKey;
//    if (surveyGroup == null || surveyGroup.getValue(0) == null) {
//      loginExternalKey = SurveyXmlConfiguration.LoginKey.DEFAULT_KEY;
//    } else {
//      loginExternalKey = surveyGroup.getValue(0).getValue();
//    }
//    EvalCallLookupScheduledTask lookupTask = new EvalCallLookupScheduledTask();
//    lookupTask.configure(taskGroup, logger, loginExternalKey);
//    if (lookupTask.isEnabled()) {
//      tasks.add(lookupTask);
//    }
//  }

//  private void addDataExportTask(@NotNull Logger logger) throws InvalidConfigurationException {
//    ScheduledTask task = new DataExportScheduledTask();
//    task.configure(null, logger);
//    if (task.isEnabled()) {
//      tasks.add(task);
//    }
//  }

//  private void configureEvaluationSchedulerTask(@NotNull Logger logger) throws InvalidConfigurationException {
//    evaluationSchedulerTask = new EvaluationSchedulerTask();
//    evaluationSchedulerTask.configure(null, logger);
//  }

  /**
   * Starts configured tasks. If any of the tasks are already planned, all of them are canceled and rescheduled again.
   */
  public synchronized void start() {
//    if (running) {
//      threadPool.getQueue().clear();
//    }
    tasks.add(new EvalCallLookupScheduledTask());
    for (ScheduledTask task : tasks) {
      threadPool.scheduleAtFixedRate(task, task.getInitialDelay(), task.getPeriodInMillis(), TimeUnit.MILLISECONDS);
    }
//    evaluationSchedulerFuture = threadPool.scheduleAtFixedRate(evaluationSchedulerTask, evaluationSchedulerTask.getInitialDelay(),
//      evaluationSchedulerTask.getPeriodInMillis(), TimeUnit.MILLISECONDS);

    running = true;
  }

  public synchronized void stop() {
    threadPool.shutdownNow();
  }

//  public AuthenticatingSecurityManager getSecurityManager() {
//    return securityManager;
//  }

  // cancel(will be automatically removed) task with old time period, set new period and create new future task
//  public void reconfigureEvaluationSchedulerTask(String time) {
//    evaluationSchedulerFuture.cancel(false);
//    evaluationSchedulerTask.setPeriod(time);
//    evaluationSchedulerFuture = threadPool.scheduleAtFixedRate(evaluationSchedulerTask, evaluationSchedulerTask.getInitialDelay(),
//      evaluationSchedulerTask.getPeriodInMillis(), TimeUnit.MILLISECONDS);
//  }
}
