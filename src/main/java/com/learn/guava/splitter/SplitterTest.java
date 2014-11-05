package com.learn.guava.splitter;

import com.google.common.base.Splitter;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Created by dik81 on 11/2/14.
 */
public class SplitterTest {
  private final static Logger logger = Logger.getLogger(SplitterTest.class);
  public static void main(String[] args) {
    String startString = "1:3:5:   7";
//    List<String> result = Splitter.on(':').limit(2).splitToList(startString);
    List<String> result = Splitter.on(':').trimResults().splitToList(startString);
    for (String s : result) {
      logger.info(s);
    }
  }
}
