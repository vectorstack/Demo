package com.vector.demo;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by 12345 on 2018-7-19.
 */
@Component
public class HelloSender2 {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(String word){
        String sendMsg = "hello2 send: "+word+" 发送时间："+ new Date();
        System.out.println("Sender2:"+sendMsg);
        this.amqpTemplate.convertAndSend("hello", sendMsg);
    }
}
