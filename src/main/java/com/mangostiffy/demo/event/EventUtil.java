package com.mangostiffy.demo.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class EventUtil {
    private static ApplicationContext applicationContext;

    @Autowired
    public void setApplicationContext(ApplicationContext applicationContext){
        EventUtil.applicationContext = applicationContext;
    }

    public static void publishEvent(Object event){
        applicationContext.publishEvent(event);
    }
}
