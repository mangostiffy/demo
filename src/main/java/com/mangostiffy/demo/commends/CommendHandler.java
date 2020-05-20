package com.mangostiffy.demo.commends;

/**
 * 命令执行者
 */
public interface CommendHandler<R, C extends Commend<R>> {
    R execute(C commend);
}
