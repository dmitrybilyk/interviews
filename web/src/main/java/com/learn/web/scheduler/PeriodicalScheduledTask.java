package com.learn.web.scheduler;

//import cz.zoom.scorecard.business.app.exception.InvalidConfigurationException;
//import cz.zoom.scorecard.business.utils.scheduler.periodicity.Periodicity;
//import cz.zoom.scorecard.business.utils.scheduler.periodicity.PeriodicityFactory;
//import cz.zoom.util.configuration.config.mapping.Group;
//import cz.zoom.util.configuration.config.mapping.Value;
//import org.apache.shiro.mgt.AuthenticatingSecurityManager;
//import org.apache.shiro.util.ThreadContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by IntelliJ IDEA.
 * User: mensik
 * Date: 7.12.2009
 * Time: 12:50:38
 */
public abstract class PeriodicalScheduledTask implements ScheduledTask {

  public static final String RUN_UNDER_LOGIN = "runUnderLogin";
  @SuppressWarnings("squid:S2068")
  public static final String RUN_UNDER_PASSWORD = "runUnderPassword";
  public static final String ENABLED = "enabled";

  protected Logger logger = LoggerFactory.getLogger(PeriodicalScheduledTask.class);
//  protected boolean enabled = true; // task is by default enabled
  protected Periodicity periodicity = new EveryNMinutesPeriodicity();
  protected String login;
  protected String password;

//  protected AuthenticatingSecurityManager securityManager;

//  @Override
//  public void configure(Group group, Logger logger) throws InvalidConfigurationException {
//    this.logger = logger;
//    // first load periodicity, because of backward compatibility of enabled value
//    periodicity = PeriodicityFactory.getPeriodicity(group);
//    Value enabledValue = group.getValue(ENABLED);
//    if (enabledValue != null) {
//      enabled = enabledValue.getBoolValue();
//    }
//    Value loginValue = group.getValue(RUN_UNDER_LOGIN);
//    if (loginValue != null) {
//      login = loginValue.getStringValue();
//    }
//    Value passwordValue = group.getValue(RUN_UNDER_PASSWORD);
//    if (passwordValue != null) {
//      password = passwordValue.getStringValue();
//    }
//    securityManager = Scheduler.getInstance().getSecurityManager();
//  }

  /**
   * PeriodicityString that was given in configuration Equalgroup returns null or number that is equal to miliseconds
   * in period.
   *
   * @return long # equal to miliseconds in period.
   */
  public long getPeriodInMillis() {
    if (periodicity == null) {
      logger.warn("PeriodicalTask periodicity is not specified. ");
    } else {
      return periodicity.getPeriodInMillis();
    }
    return -1;
  }

  /**
   * initialTime that was given in configuration Equalgroup returns null or number that is equal to miliseconds
   * before first start of this scheduler.
   *
   * @return # of ms
   */
  public long getInitialDelay() {
    if (periodicity != null) {
      return periodicity.getInitialDelay();
    }
    return 0;
  }

//  @Override
//  public boolean isEnabled() {
//    return enabled;
//  }

//  protected void setAuthenticator() {
//    ThreadContext.bind(securityManager);
//  }
}
