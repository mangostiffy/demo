package com.mangostiffy.demo.commends.user;

import com.mangostiffy.demo.commends.Commend;
import com.mangostiffy.demo.domain.model.user.User;
import lombok.Data;

import java.util.Date;

/**
 * 命令及命令中携带的参数
 */
public class UserCommends {

    @Data
    public static class Create implements Commend<User> {
        private String name;
        private Date brithday;
        private String email;
    }
}
