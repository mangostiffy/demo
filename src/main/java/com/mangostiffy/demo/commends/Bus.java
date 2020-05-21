package com.mangostiffy.demo.commends;

public interface Bus {
    <R, C extends Commend> R execute(C command);
}
