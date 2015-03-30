package com.learn.core.operations;

/**
 * Created by dmitry on 30.03.15.
 */
public class OrWithNPECheck {
  public static void main(String[] args) {
    EvaluationBO evaluationBO = new EvaluationBO();
    System.out.println(evaluationBO.hasEvaluationStatusChanged());
    evaluationBO.setEvalstatusEnum(EvaluationBO.EvalStatus.IN_PROGRES);
    System.out.println(evaluationBO.hasEvaluationStatusChanged());
    evaluationBO.setEvalstatusEnum(EvaluationBO.EvalStatus.FINISHED);
    System.out.println(evaluationBO.hasEvaluationStatusChanged());
    evaluationBO.setEvalstatusEnum(EvaluationBO.EvalStatus.CREATED);
    System.out.println(evaluationBO.hasEvaluationStatusChanged());
  }
}
