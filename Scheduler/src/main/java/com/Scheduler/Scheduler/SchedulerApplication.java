package com.Scheduler.Scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class SchedulerApplication {
    //static Logger logger = LoggerFactory.getLogger(SchedulerApplication.class);

        public static void main(String[] args) {

        SpringApplication.run(SchedulerApplication.class, args);
           // logger.info("Hello world");

        }

}
