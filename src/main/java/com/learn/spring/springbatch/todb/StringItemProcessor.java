package com.learn.spring.springbatch.todb;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: dmitriy.bilyk
 * Date: 28.03.13
 * Time: 22:39
 * To change this template use File | Settings | File Templates.
 */
@Component("itemProcessor")
@Scope("step")
public class StringItemProcessor implements ItemProcessor {
    private String fileName;
    @Value("#{jobParameters['inputFile']}")
    public void setFileName(final String name) {
        this.fileName = name;
    }
    public Object process(Object item) throws Exception {
        Ledger ledger = (Ledger) item;
        ledger.setComments(fileName + " comments");
        return ledger;
    }
}
