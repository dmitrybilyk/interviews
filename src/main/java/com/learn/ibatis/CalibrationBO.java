package com.learn.ibatis;

import java.util.List;

public class CalibrationBO {
  private static final long serialVersionUID = -2484030907048986316L;

  public enum Fields {
    CALIBRATION_ID("calibrationId"), SUB_CALIBRATION_ID("subCalibrationId");
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

  private Integer calibrationId;
  private Integer subCalibrationId;
  private SubCalibrationBO subCalibration;

  public CalibrationBO() {
  }

  public Integer getCalibrationId() {
    return calibrationId;
  }

  public void setCalibrationId(Integer calibrationId) {
    this.calibrationId = calibrationId;
  }

  public Integer getSubCalibrationId() {
    return subCalibrationId;
  }

  public void setSubCalibrationId(Integer subCalibrationId) {
    this.subCalibrationId = subCalibrationId;
  }

  public SubCalibrationBO getSubCalibration() {
    return subCalibration;
  }

  public void setSubCalibration(SubCalibrationBO subCalibration) {
    this.subCalibration = subCalibration;
  }

  @Override
  public int hashCode() {
    return ((getCalibrationId() == null) ? 0 : getCalibrationId().hashCode());
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof CalibrationBO))
      return false;
    CalibrationBO other = (CalibrationBO) obj;
    if (getCalibrationId() == null || other.getCalibrationId() == null)
      return false;
    return getCalibrationId().equals(other.getCalibrationId());
  }


  @Override
  public String toString() {
    return "CalibrationBO" + "{calibrationId = " + calibrationId + "; subCalibrationId = " + subCalibrationId + '}';
  }

}