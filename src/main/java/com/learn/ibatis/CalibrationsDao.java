package com.learn.ibatis;

import com.ibatis.sqlmap.client.SqlMapClient;

import java.util.List;

/**
 * Created by dik81 on 24.05.19.
 */
public interface CalibrationsDao {
    public List<SubCalibrationBO> getSubCalibrationsByCalibrationId(Integer id, SqlMapClient sqlMapClient);
}
