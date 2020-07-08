package com.learn.web.scheduler;

//import cz.zoom.scorecard.business.ScorecardImpl;
//import cz.zoom.scorecard.business.app.evaluation.EvaluationManager;
//import cz.zoom.scorecard.business.app.user.UserManager;
//import cz.zoom.scorecard.business.security.ScorecardSecurityUtils;
//import org.apache.shiro.mgt.AuthenticatingSecurityManager;
//import org.apache.shiro.util.ThreadContext;
import org.slf4j.Logger;

/**
 * Created by Ivan on 2/16/2018.
 * Eval Call Thread will be used to isolate actual job into separate thread that will release invoking task for the purpose of
 * better queue control.
 */
public class EvalCallThread implements Runnable {

//  private AuthenticatingSecurityManager securityManager;
//  private EvaluationManager evaluationManager;
//  private UserManager userManager;

  private int evaluationIgnoreAge; // (days) how old can evaluations get before they are ignored
  private String loginExternalKey;
  private String login;
  private String password;
  private Logger logger;

//  public EvalCallThread(int evaluationIgnoreAge, String loginExternalKey, String login, String password, Logger logger, AuthenticatingSecurityManager securityManager) {
  public EvalCallThread(int evaluationIgnoreAge, String loginExternalKey, String login, String password, Logger logger) {
//    evaluationManager = ScorecardImpl.getInstance().getEvaluationManager();
//    userManager = ScorecardImpl.getInstance().getUserManager();
    this.evaluationIgnoreAge = evaluationIgnoreAge;
    this.login = login;
    this.password = password;
    this.loginExternalKey = loginExternalKey;
    this.logger = logger;
//    this.securityManager = securityManager;
  }

  @Override
  public void run() {
    try {
      logger.info("Starting lookup task for eval calls without couple SID");
      if (password == null) {
        logger.error("Error logging in as user \"{}\" does not have a password setup", login);
        return;
      }
      try {
//        ThreadContext.bind(securityManager);
//        ScorecardSecurityUtils.login(login, password.toCharArray(), userManager);
      } catch (Exception exc) {
        logger.error("Error logging in as user \"{}\"", login, exc);
        return;
      }
      logger.info("finalizing surveys");
      Thread.sleep(2000);
//      evaluationManager.finalizeSurveys(evaluationIgnoreAge, loginExternalKey);
//      ScorecardSecurityUtils.logout();
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      logger.info("Exiting from eval lookup task");
    }
  }
}
