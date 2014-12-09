package toknow.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import toknow.model.CompanyBO;

import java.util.List;

public interface CompanyServiceAsync {

  void getCompanyBOs(AsyncCallback<List<CompanyBO>> async);
}
