package com.mangostiffy.demo.commends.user;

import com.mangostiffy.demo.commends.Commend;
import com.mangostiffy.demo.domain.model.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 命令及命令中携带的信息
 */
public class UserCommends {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Create implements Commend<User> {
        private String name;
        private Date brithday;
        private String email;

    }
}
