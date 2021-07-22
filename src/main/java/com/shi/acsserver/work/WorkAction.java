package com.shi.acsserver.work;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WorkAction {
    
    @Autowired
    static ExecutorService executorService = Executors.newFixedThreadPool(10);

    public static void doAction(Object info) {

        //DATA 정보로 Thead Start();
        Runnable runnable = new Runnable(){

            @Override
            public void run() {
                log.info(WorkFactory.Action(info));
                log.info("doAction");
            } 
        };

        executorService.submit(runnable);
    }
}
