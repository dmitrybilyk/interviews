package com.learn.core.reflection.reflectiontests;

import junit.framework.TestResult;
import junit.framework.TestSuite;

/**
 * Created by dik81 on 11/29/14.
 */
public class Main {
  public static void main(String[] args) {
    try {
      TestSuite testSuite = suite();
      TestResult testResult = new TestResult();
      testSuite.run(testResult);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static TestSuite suite() throws Exception {
    TestSuite result = new TestSuite(AnswerBOTest.class.getName());
    new AnswerBOTest().fillSuite(result);
    return result;
  }
}
