package com.learn.web.scheduler;

//import cz.zoom.scorecard.business.app.exception.InvalidConfigurationException;
//import cz.zoom.util.configuration.config.mapping.Group;
import org.slf4j.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: mensik
 * Date: 7.12.2009
 * Time: 12:42:59
 */
public interface ScheduledTask extends Runnable {

  /**
   * Configuration for scheduler. Example: <pre>{@code
   *   <EqualGroup name="scheduler">
   *         <Value name="scheduledTaskClass">cz.zoom.scorecard.business.utils.scheduler.plugins.MailSchedulerPlugin</Value>
   *         <Value name="firstStart">11:18</Value>
   *         <Value name="periodicity">DAILY</Value>
   *   </EqualGroup>
   * }</pre>
   *
   * @param group  instantiated xml definition, see above.
   * @param logger where to log
   */
//  void configure(Group group, Logger logger) throws InvalidConfigurationException;

  /**
   * @return # of ms between two runs of this task
   */
  long getPeriodInMillis();

  /**
   * Returns initial delay in milliseconds before task is started for first time.
   *
   * @return # of ms
   */
  long getInitialDelay();

  /**
   * Returns if this task is enabled (should be scheduled)
   *
   * @return true if enabled, false otherwise
   */
//  boolean isEnabled();
}
