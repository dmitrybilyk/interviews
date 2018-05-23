package com.learn.web.scheduler;

//import cz.zoom.util.configuration.config.mapping.Group;
import org.joda.time.DateTimeConstants;

/**
 * Created with IntelliJ IDEA.
 * User: hrabal
 * Date: 17.10.13
 * Time: 12:03
 */
public class EveryNMinutesPeriodicity implements Periodicity {

  public static final String INTERVAL_MINUTES = "intervalMinutes";
  public static final int INTERVAL_MINUTES_DEFAULT = 10;

  private int intervalMinutes = INTERVAL_MINUTES_DEFAULT;

//  @Override
//  public void configure(Group group) {
//    intervalMinutes = group.getIntValue(INTERVAL_MINUTES);
//  }

  @Override
  public long getPeriodInMillis() {
    return DateTimeConstants.MILLIS_PER_MINUTE * (long) intervalMinutes;
  }

  @Override
  public long getInitialDelay() {
    return 0;
  }
}
