package com.batch.simon;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created with IntelliJ IDEA.
 * User: dmitriy.bilyk
 * Date: 30.07.13
 * Time: 21:52
 * To change this template use File | Settings | File Templates.
 */

    @ContextConfiguration(locations = "classpath:com/batch/simon/simpleJobChunk.xml")
    @RunWith(SpringJUnit4ClassRunner.class)
    public class ChunkRunTestCase {

        private final static Logger logger = Logger
                .getLogger(HelloWorldTestCase.class);

        @Autowired
        private JobLauncher launcher;

        @Autowired
        private Job job;
        private JobParameters jobParameters = new JobParameters();

        @Test
        public void testLaunchJob() throws Exception {
            launcher.run(job, jobParameters);
        }

    }
