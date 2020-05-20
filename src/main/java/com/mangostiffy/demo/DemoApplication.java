package com.mangostiffy.demo;

import com.mangostiffy.demo.domain.model.user.UserEvent;
import com.mangostiffy.demo.event.EventUtil;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DemoApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        EventUtil.publishEvent(UserEvent.builder().name("Mike").birthday(new Date()).build());
    }
}
