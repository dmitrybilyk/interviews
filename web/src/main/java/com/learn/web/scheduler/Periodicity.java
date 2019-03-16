package com.learn.web.scheduler;

//import cz.zoom.util.configuration.config.mapping.Group;

/**
 * Created with IntelliJ IDEA.
 * User: hrabal
 * Date: 17.10.13
 * Time: 11:28
 */
public interface Periodicity {
//  /**
//   * Configuration for periodicity inside scheduler config. Example: <pre>{@code
//   *   <(Equal)Group name="scheduler">
//   *         ...
//   *         <Value name="periodicityClass">cz.zoom.scorecard.business.utils.scheduler.periodicity.plugins.DailyPlugin</Value>
//   *         <Value name="startAtHours">23:59</Value>
//   *   </(Equal)Group>
//   * }</pre>
//   *
//   * @param group instantiated xml definition, see above.
//   */
//  void configure(Group group);

  /**
   * @return # of ms between two runs using this periodicity
   */
  long getPeriodInMillis();

  /**
   * Returns initial delay in milliseconds before first start
   *
   * @return # of ms
   */
  long getInitialDelay();
}
