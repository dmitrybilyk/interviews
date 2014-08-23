package com.learn.core.exceptions.complextesting.service;

import com.learn.core.exceptions.complextesting.dao.DaoService;
import com.learn.core.exceptions.complextesting.dao.DaoServiceImpl;
import com.learn.core.exceptions.complextesting.exception.SaveException;

/**
 * Created with IntelliJ IDEA.
 * User: Buh
 * Date: 30.08.13
 * Time: 19:34
 * To change this template use File | Settings | File Templates.
 */
public class ServiceImpl implements Service {
    DaoService dao = new DaoServiceImpl();
    @Override
    public void save(int i) throws SaveException {
        dao.save(i);
    }
}
