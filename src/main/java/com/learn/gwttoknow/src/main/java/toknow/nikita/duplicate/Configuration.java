package toknow.nikita.duplicate;

import com.google.gwt.user.client.rpc.AsyncCallback;

import java.io.Serializable;
import java.util.Map;

/** @author Stanislav Valenta, 10.9.2009 */
public class Configuration implements Serializable {
  private static final long serialVersionUID = 1563529407006234256L;
  /** The only one instance of this class */
  private static Configuration instance = null;

  private Map<Key, String> configuraitonMap;

  /** Configuration keys */
  public enum Key {
    CALLS_ADDRESS,
    LOGI_REPORT_SERVER_ADDR,
    LOGI_REPORT_SERVER_PORT,
    LOGI_APPLICATION_NAME,
    LOGI_REPORT_URL,
    LOGI_REPORT_PARAMETER,
    LOGI_REPORTS_SECUREKEY_URL,
    LOGI_REPORTS_SECUREKEY_ADDR,
    LOGI_REPORTS_SECUREKEY_PORT
  }
  /**
   * Returns the only one instance of this class
   * @return the only one instance of this class
   */
  public static synchronized Configuration getInstance() {
    if (instance == null) {
      instance = new Configuration();
    }
    return instance;
  }

  public static void destory() {
    instance = null;
  }


  /** This class is singleton */
  private Configuration() {}


  /**
   * Gets config map via
   * @param callback
   * @param forceUpdate
   */
//  public void getConfigurationMap(final AsyncCallback<Map<Key, String>> callback, Boolean forceUpdate) {
//    if ((configuraitonMap == null) || forceUpdate) {
//      UtilsService.App.getInstance().getConfigurationMap(new ScorecardAsyncCallback<Map<Key, String>>() {
//        @Override
//        public void handleFailure(Throwable throwable) {
//          if (callback != null) {
//            callback.onFailure(throwable);
//          }
//        }
//
//
//        @Override
//        public void handleSuccess(Map<Key, String> keyStringMap) {
//          configuraitonMap = keyStringMap;
//          if (callback != null) {
//            callback.onSuccess(configuraitonMap);
//          }
//        }
//      });
//    }
//    else {
//      if (callback != null) {
//        callback.onSuccess(configuraitonMap);
//      }
//    }
//  }
}
