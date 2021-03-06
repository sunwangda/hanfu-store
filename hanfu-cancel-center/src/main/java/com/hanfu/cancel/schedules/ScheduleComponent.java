package com.hanfu.cancel.schedules;

import com.hanfu.cancel.tasks.AsyncTasksComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class ScheduleComponent {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AsyncTasksComponent taskExecutor;

    @Scheduled(cron = "0/10 * * * * ?")
    public void taskClear() throws InterruptedException {
        logger.info(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SSS")));
        taskExecutor.task4();
    }
}
