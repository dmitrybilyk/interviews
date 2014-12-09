package toknow.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import toknow.model.CompanyBO;

import java.util.List;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("companyService")
public interface CompanyService extends RemoteService {

  /**
   * Utility/Convenience class.
   * Use QuestionaireService.App.getInstance() to access static instance of QuestionaireServiceAsync
   */
  public static class App {
    private static CompanyServiceAsync ourInstance;


    static {
//      ourInstance = CompanyServiceAsync.Util.getInstance();
    }


    public static CompanyServiceAsync getInstance() {
      return ourInstance;
    }


    public static void destroy() {
      ourInstance = null;
    }
  }

  public List<CompanyBO> getCompanyBOs();
}
