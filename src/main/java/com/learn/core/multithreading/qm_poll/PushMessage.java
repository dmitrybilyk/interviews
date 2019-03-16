package com.learn.core.multithreading.qm_poll;

//import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Message exchanged between Clients and ScoreCARD server.
 */
public class PushMessage implements Serializable {

  public static final String TYPE = "type";
  private static final String SESSION_ID = "sessionid";
  private static final String EVENT = "event";
  private static final String PARAMS = "params";

  public enum MESSAGE_TYPE {SESSION_EXPIRED, USER_LOGGED_OUT, ERROR, IDLE}

  private MESSAGE_TYPE type;
  private String sessionid;
  private String event;
  private String params;

  public PushMessage() {}

  public PushMessage(Map<String, String> arg) {
    setType(MESSAGE_TYPE.valueOf(arg.get(TYPE)));
    setSessionid(arg.get(SESSION_ID));
    setEvent(arg.get(EVENT));
    setParams(arg.get(PARAMS));
  }

//  @JsonIgnore
  public Map<String, String> toMap() {
    HashMap<String, String> map = new HashMap<>();
    map.put(TYPE, getType().name());
    map.put(SESSION_ID, getSessionid());
    map.put(EVENT, getEvent());
    map.put(PARAMS, getParams());
    return map;
  }

  public MESSAGE_TYPE getType() {
    return type;
  }

  public void setType(MESSAGE_TYPE type) {
    this.type = type;
  }

  public String getSessionid() {
    return sessionid;
  }

  public void setSessionid(String sessionid) {
    this.sessionid = sessionid;
  }

  public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }

  public String getParams() {
    return params;
  }

  public void setParams(String params) {
    this.params = params;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    PushMessage message1 = (PushMessage) o;

    return (event != null ? event.equals(message1.event) : message1.event == null) &&
      (params != null ? params.equals(message1.params) : message1.params == null) &&
      (sessionid != null ? sessionid.equals(message1.sessionid) : message1.sessionid == null) && type == message1.type;
  }

  @Override
  public int hashCode() {
    int result = type != null ? type.hashCode() : 0;
    result = 31 * result + (sessionid != null ? sessionid.hashCode() : 0);
    result = 31 * result + (event != null ? event.hashCode() : 0);
    result = 31 * result + (params != null ? params.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "PushMessage{" +
            "type=" + type +
            ", sessionid='" + sessionid + "'" +
            ", event='" + event + "'" +
            ", params='" + params + "'" +
            '}';
  }
}
