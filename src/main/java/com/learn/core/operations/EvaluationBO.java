package com.learn.core.operations;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

/** @author Stanislav Valenta, 26.6.2009 */
public class EvaluationBO{
  private static final long serialVersionUID = 1835890619213230551L;

  private EvalStatus evalstatus;

  public enum Fields {
	  EVALUATION_ID("id"),
    EVAL_DATE("evaluationDate"), Q_FORM("qformid"), EVALUATOR("evaluatorBO"), EVALUATED_USER("evaluatedUserBO"),
    ALLOW_MODIFICATION("allowModification"), LAST_MODIFIED("lastModified"), NEXT_DEADLINE("nextDeadline"),
    EVAL_STATUS("evalstatus"), COMMENTS("comments"), EVALUATION_COPYOF("copyof"), READ("read"),
    FEEDBACK_IMPROVE("feedbackImprove"),FEEDBACK_MAINTAIN("feedbackMaintain"), APPLY_TO_STATISTICS("applyToStatistics"),
    COMPANY_EVALUATION("company"), SCORE("score"), VISIBLE_TO_AGENT("visibleToAgent"), CREATED_BY("createdByBO");
    private final String fieldName;

    Fields(final String fieldName) {
      this.fieldName = fieldName;
    }

    public String getFieldName() {
      return fieldName;
    }

    public static Fields getField(String fieldName) {
      for (Fields field: Fields.values())
        if (field.getFieldName().equals(fieldName))
          return field;
      return null;
    }
  }

  public enum EvalStatus {
    CREATED, IN_PROGRES, FINISHED, TEMPLATE
  }

  private boolean isEvaluationStatusChanged;

  public EvaluationBO() {
    this.evalstatus = EvalStatus.CREATED;
  }

  public void setEvalstatusEnum(EvalStatus evalStatus) {
    isEvaluationStatusChanged |= this.evalstatus != evalStatus;
    this.evalstatus = evalStatus;
  }

  public boolean hasEvaluationStatusChanged() {
    return isEvaluationStatusChanged;
  }


}
