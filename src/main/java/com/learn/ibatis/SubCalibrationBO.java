package com.learn.ibatis;

public class SubCalibrationBO {
  private static final long serialVersionUID = -8713822400793145528L;

  public enum Fields {
    SUB_CALIBRATION_ID("subCalibrationId"), CONVERSATION_ID("conversationId");
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

  private Integer subCalibrationId;
  private String conversationId;

  public SubCalibrationBO() {
  }

  public Integer getSubCalibrationId() {
    return subCalibrationId;
  }

  public void setSubCalibrationId(Integer subCalibrationId) {
    this.subCalibrationId = subCalibrationId;
  }

  public String getConversationId() {
    return conversationId;
  }

  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }

  @Override
  public int hashCode() {
    return ((getSubCalibrationId() == null) ? 0 : getSubCalibrationId().hashCode());
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof SubCalibrationBO))
      return false;
    SubCalibrationBO other = (SubCalibrationBO) obj;
    if (getSubCalibrationId() == null || other.getSubCalibrationId() == null)
      return false;
    return getSubCalibrationId().equals(other.getSubCalibrationId());
  }


  @Override
  public String toString() {
    return "SubCalibrationBO" + "{subCalibrationId = " + subCalibrationId + "; conversationId = " + conversationId + '}';
  }

}