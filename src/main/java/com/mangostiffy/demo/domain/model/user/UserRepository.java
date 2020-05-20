package com.mangostiffy.demo.domain.model.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User add(User user);
}
