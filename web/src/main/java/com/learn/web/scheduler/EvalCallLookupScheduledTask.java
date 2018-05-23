package com.learn.web.scheduler;

//import cz.zoom.scorecard.business.app.exception.InvalidConfigurationException;
//import cz.zoom.scorecard.business.configuration.SurveyXmlConfiguration;
//import cz.zoom.util.configuration.config.mapping.Group;
import org.slf4j.Logger;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class EvalCallLookupScheduledTask extends PeriodicalScheduledTask {
  protected static final String EVALUATION_IGNORE_AGE = "ignoreAge";

  private int evaluationIgnoreAge; // (days) how old can evaluations get before they are ignored
  private String loginExternalKey;
  private Future<?> lastExecution;
  private final ExecutorService executor = Executors.newSingleThreadExecutor();

//  public void configure(Group group, Logger logger, String loginExternalKey) throws InvalidConfigurationException {
//    super.configure(group, logger);
//    evaluationIgnoreAge = group.getIntValue(EVALUATION_IGNORE_AGE); // in days
//    this.loginExternalKey = loginExternalKey;
//  }

//  @Override
//  public void configure(Group group, Logger logger) throws InvalidConfigurationException {
//    configure(group, logger, SurveyXmlConfiguration.LoginKey.DEFAULT_KEY);
//  }

  @Override
  public void run() {
    if (lastExecution != null && !lastExecution.isDone()) {
      logger.info("EvalCallLookup task is already running, skipping this scheduled run.");
      return;
    }
    EvalCallThread actualTask = new EvalCallThread(evaluationIgnoreAge, loginExternalKey, login, password, logger);
    lastExecution = executor.submit(actualTask);
  }
}
