package com.learn.ibatis;

import com.ibatis.sqlmap.client.SqlMapClient;

import java.util.List;

/**
 * Created by dik81 on 24.07.19.
 */
public class CalibrationsDaoImpl implements CalibrationsDao {
    @Override
    public List<SubCalibrationBO> getSubCalibrationsByCalibrationId(Integer id, SqlMapClient sqlMapClient) {
        try
        {
            return sqlMapClient.queryForList("calibrations.loadSubCalibrationsByCalibrationId", id);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
