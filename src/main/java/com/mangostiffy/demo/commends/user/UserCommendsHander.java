package com.mangostiffy.demo.commends.user;

import com.mangostiffy.demo.commends.CommendHandler;
import com.mangostiffy.demo.domain.model.user.User;
import com.mangostiffy.demo.domain.model.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

public class UserCommendsHander {

    @Transactional
    @Component
    public static class Create implements CommendHandler<User, UserCommends.Create> {

        @Autowired
        private UserRepository userRepository;

        @Override
        public User handle(UserCommends.Create commend) {
            User user = User.create(commend.getName(), commend.getBrithday(), commend.getEmail());
            return userRepository.save(user);
        }
    }
}
