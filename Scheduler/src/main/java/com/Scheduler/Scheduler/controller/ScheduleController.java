package com.Scheduler.Scheduler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Scheduler.Scheduler.service.ScheduleService;

@RestController
public class ScheduleController {
    @Autowired
    private ScheduleService scheduleService;
    @GetMapping("/data")
    public void getData()
    {
        scheduleService.schedule();

    }
}
