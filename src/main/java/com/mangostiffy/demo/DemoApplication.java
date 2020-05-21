package com.mangostiffy.demo;

import com.mangostiffy.demo.commends.user.UserCommends;
import com.mangostiffy.demo.commends.user.UserCommendsHander;
import com.mangostiffy.demo.domain.model.user.User;
import com.mangostiffy.demo.domain.model.user.UserEvents;
import com.mangostiffy.demo.domain.model.user.UserRepository;
import com.mangostiffy.demo.event.EventUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DemoApplication implements ApplicationRunner {

    @Autowired
    private UserCommendsHander.Create create;

    /*@Autowired
    private UserRepository userRepository;*/

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        EventUtil.publishEvent(UserEvents.EventDemo.builder().name("Mike").birthday(new Date()).build());

        create.handle(new UserCommends.Create("Mkie",new Date(),"123@qwe.com"));


        //userRepository.save(User.create("Mkie",new Date(),"123@qwe.com"));
    }
}
