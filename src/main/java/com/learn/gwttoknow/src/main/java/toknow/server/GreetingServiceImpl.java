package toknow.server;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import toknow.client.GreetingService;
import toknow.model.CompanyBO;
import toknow.shared.FieldVerifier;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import java.util.ArrayList;
import java.util.List;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements
    GreetingService {

  public String greetServer(String input) throws IllegalArgumentException {
    // Verify that the input is valid.
    if (!FieldVerifier.isValidName(input)) {
      // If the input is not valid, throw an IllegalArgumentException back to
      // the client.
      throw new IllegalArgumentException(
          "Name must be at least 4 characters long");
    }

    DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
    Entity entity = new Entity("Person");
    entity.setProperty("first", "first value");
    entity.setProperty("second", "second value");

    ds.put(entity);

    String serverInfo = getServletContext().getServerInfo();
    String userAgent = getThreadLocalRequest().getHeader("User-Agent");

    // Escape data from the client to avoid cross-site script vulnerabilities.
    input = escapeHtml(input);
    userAgent = escapeHtml(userAgent);

    return "Hello, " + input + "!<br><br>I am running " + serverInfo
        + ".<br><br>It looks like you are using:<br>" + userAgent;
  }

  public List<CompanyBO> getCompanyBOs() {
   List<CompanyBO> companyBOs = new ArrayList<CompanyBO>();
  CompanyBO companyBO = new CompanyBO.CompanyBOBuilder(1).description("desc1").displayName("displ name")
          .configurationEqualGroup("group1").build();
    companyBOs.add(companyBO);
    CompanyBO companyBO2 = new CompanyBO.CompanyBOBuilder(1).description("desc1").displayName("displ name")
            .configurationEqualGroup("group1").build();
    companyBOs.add(companyBO2);
    return companyBOs;
  }

  /**
   * Escape an html string. Escaping data received from the client helps to
   * prevent cross-site script vulnerabilities.
   *
   * @param html the html string to escape
   * @return the escaped string
   */
  private String escapeHtml(String html) {
    if (html == null) {
      return null;
    }
    return html.replaceAll("&", "&amp;").replaceAll("<", "&lt;").replaceAll(
        ">", "&gt;");
  }
}
