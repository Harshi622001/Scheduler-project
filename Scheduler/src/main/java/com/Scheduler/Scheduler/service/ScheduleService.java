
package com.Scheduler.Scheduler.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;
@EnableScheduling
@Service
public class ScheduleService {
    Logger logger = LoggerFactory.getLogger(ScheduleService.class);

    @Scheduled(fixedRate = 1000L)
    public void schedule() {
        logger.info("The time is now" + new Date());

    }

    @Scheduled(fixedDelay = 1000L,initialDelay = 2000L)
    public void schedule1() {
        logger.info("The time1 is now" + new Date());

    }
}


