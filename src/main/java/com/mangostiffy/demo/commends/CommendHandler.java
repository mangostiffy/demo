package com.mangostiffy.demo.commends;

/**
 * 命令处理器
 */
public interface CommendHandler<R, C extends Commend<R>> {
    R handle(C commend);
}
