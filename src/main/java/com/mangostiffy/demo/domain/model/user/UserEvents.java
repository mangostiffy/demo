package com.mangostiffy.demo.domain.model.user;

import lombok.Builder;
import lombok.Data;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.PayloadApplicationEvent;

import java.util.Date;


/**
 * 如果事件不是{@link ApplicationEvent}，则会包装在{@link PayloadApplicationEvent}中
 * PayloadApplicationEvent 的定义是承载任何负载的ApplicationEvent
 */

public class UserEvents {

    @Data
    @Builder
    public static class EventDemo{
        private String name;
        private Date birthday;
    }

}
