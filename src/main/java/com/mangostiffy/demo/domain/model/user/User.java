package com.mangostiffy.demo.domain.model.user;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Date birthday;
    private String email;
    private Date createTime;

    public User(String name, Date birthday, String email) {
        this.name = name;
        this.birthday = birthday;
        this.email = email;
    }

    public static User create(String name, Date birthday, String email) {
        User user = new User();
        user.setName(name);
        user.setBirthday(birthday);
        user.setEmail(email);
        user.setCreateTime(new Date());
        return user;
    }

    private void bye(){

    }

}
