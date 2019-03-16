package com.learn.core.multithreading.qm_poll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Zdary
 * Date: 16/04/13
 * Time: 14:38
 */
public class ObserverCommunicator {
  private static final Logger logger = LoggerFactory.getLogger(ObserverCommunicator.class);

  private static ObserverCommunicator instance;

  private final GWTObserver gwtObserver;

  public static synchronized ObserverCommunicator getInstance() {
    if (instance == null) {
      instance = new ObserverCommunicator();
    }
    return instance;
  }

  public static synchronized ObserverCommunicator getInstance(boolean forceExistingInstance) {
    return forceExistingInstance ? instance : getInstance();
  }

  private ObserverCommunicator() {
    this.gwtObserver = new GWTObserver();
  }

  /**
   * Invoked by GWT client to receive (or rather "pull") a new PushMessage
   * from an external non-GWT client (such as Player communicating via UniversalCommunicator).
   * The PushMessage can be internal as well (such as SessionExpired).
   * The GWT client that is pulling a new message is identified by its sessionID.
   * Blocks until a message is available, but returns null, if no message comes in within a certain period.
   * If there's a problem or communication is disabled,
   * returns an empty message with {@link PushMessage.MESSAGE_TYPE#ERROR ERROR} message type.
   *
   * @param sessionId the session ID to receive a new PushMessage for
   * @return a new message for the client, or null if no message comes within timeout period,
   * or a new message with {@link PushMessage.MESSAGE_TYPE#ERROR ERROR} type (not coming from external source).
   */
  public PushMessage server2client(String sessionId) {
    try {
      return gwtObserver.waitForMessage(sessionId);
    } catch (InterruptedException e) {
//      logger.error("Error waiting for a message for client with session ID: {}, {}", sessionId, e.getMessage(), e);
      Thread.currentThread().interrupt();
    }
    return getErrorMessage();
  }

  private PushMessage getErrorMessage() {
    PushMessage message = new PushMessage();
    message.setType(PushMessage.MESSAGE_TYPE.ERROR);
    return message;
  }

  public void sessionEnded(String sessionId, PushMessage.MESSAGE_TYPE type) {
    PushMessage message = new PushMessage();
    message.setType(type);
    message.setSessionid(sessionId);
    // GWT client needs to receive the TimeOut even though Player cannot.
    logger.info("session ended " + sessionId);
    gwtObserver.update(null,message.toMap());
  }
}
