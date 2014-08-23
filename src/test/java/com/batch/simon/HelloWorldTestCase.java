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
import org.springframework.util.StopWatch;

/**
 * Created with IntelliJ IDEA.
 * User: dmitriy.bilyk
 * Date: 29.07.13
 * Time: 22:20
 * To change this template use File | Settings | File Templates.
 */
@ContextConfiguration(locations = "classpath:com/batch/simon/simpleJob.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class HelloWorldTestCase {

    private final static Logger logger = Logger
            .getLogger(HelloWorldTestCase.class);

    @Autowired
    private JobLauncher launcher;

    @Autowired
    private Job job;
    private JobParameters jobParameters = new JobParameters();

    @Test
    public void testLaunchJob() throws Exception {
        StopWatch sw = new StopWatch();
        sw.start();
        launcher.run(job, jobParameters);
        sw.stop();
        logger.info(">>> TIME ELAPSED:" + sw.prettyPrint());
    }

    @Test
    public void testWithJobParameters() throws Exception {
        jobParameters.getParameters().put("name", new JobParameter("dima"));
        launcher.run(job, jobParameters);
    }


}
