package com.mangostiffy.demo.domain.model.user;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;
import org.springframework.transaction.support.TransactionSynchronizationAdapter;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import javax.transaction.Transactional;

@Component
@Transactional
public class UserEventListener {

    /**
     * 监听的三种方式
     * 1:@EventListener
     * 2:{@link org.springframework.context.ApplicationListener}
     * 3:{@link org.springframework.context.event.SmartApplicationListener}
     * @param eventDemo
     */

    //异步
    @Async
    //在事务commit/rolback之后进行事件监听，相当于事务回调,fallbackExecution若没有事务的时候，对应的event是否执行,默认值为false表示,没事务就不执行了
    @TransactionalEventListener(fallbackExecution = true)
    //同步
//    @EventListener
    public void onDemo(UserEvents.EventDemo eventDemo){
        System.out.println(eventDemo.getName());

        //手动注册事务回调
        TransactionSynchronizationManager.registerSynchronization(new TransactionSynchronizationAdapter(){
            @Override
            public void afterCommit() {
                System.out.println(eventDemo.getName());
            }
        });
    }
}
