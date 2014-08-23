package com.batch.simon;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created with IntelliJ IDEA.
 * User: dmitriy.bilyk
 * Date: 29.07.13
 * Time: 22:47
 * To change this template use File | Settings | File Templates.
 */
@ContextConfiguration(locations = "classpath:com/batch/simon/simpleJobWithParams.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class WithParamsTestCase {
    private final static Logger logger = Logger
            .getLogger(HelloWorldTestCase.class);

    @Autowired
    private JobLauncher launcher;

    @Autowired
    private Job job;
    private JobParameters jobParameters = new JobParameters();


    @Test
    public void testWithJobParameters() throws Exception {
        jobParameters.getParameters().put("name", new JobParameter("dima"));
        launcher.run(job, jobParameters);
    }

}
