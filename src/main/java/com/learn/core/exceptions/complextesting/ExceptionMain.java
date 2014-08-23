package com.learn.core.exceptions.complextesting;

import com.learn.core.exceptions.complextesting.exception.MyRuntimeException;
import com.learn.core.exceptions.complextesting.exception.SaveException;
import com.learn.core.exceptions.complextesting.service.Service;
import com.learn.core.exceptions.complextesting.service.ServiceImpl;
import org.apache.log4j.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: Buh
 * Date: 30.08.13
 * Time: 19:34
 * To change this template use File | Settings | File Templates.
 */
public class ExceptionMain {
    static Logger logger = Logger.getLogger(ExceptionMain.class);
    public static void main(String[] args) {
          Service service = new ServiceImpl();
        try {
            service.save(41);
        } catch (SaveException e) {
            logger.error(e.getMessage());
            System.out.println(e.getMessage());
            try{
                throw new MyRuntimeException();
            }catch(MyRuntimeException ex){
                System.out.println(ex.getMessage());
            }
        }catch (MyRuntimeException e){
            System.out.println(e.getMessage());
        } catch (Exception e){

        }
    }
}
