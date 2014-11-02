package com.learn.guava.joiner;

import com.google.common.base.Joiner;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dik81 on 11/2/14.
 */
public class JoinerTest {
  private final static Logger logger = Logger.getLogger(JoinerTest.class);
  public static void main(String[] args) {
    List<Integer> integerList = new ArrayList<Integer>();
    integerList.add(1);
    integerList.add(2);
    integerList.add(3);
    integerList.add(null);

    Map<String, String> map = new HashMap<String, String>();
    map.put("1", "1");
    map.put("2", "2");
    map.put("3", "3");
    map.put("3", null);
    map.put(null, null);
    map.put(null, null);

    StringBuilder appendToString = new StringBuilder();
    appendToString.append("hi");

    String string = Joiner.on("sepa").withKeyValueSeparator(".u.").useForNull("NullText")
            .appendTo(appendToString, map).toString();
    logger.info(string);

    String string2 = Joiner.on("sepa").useForNull("NullText")
            .join(integerList);
    logger.info(string2);

  }
}
