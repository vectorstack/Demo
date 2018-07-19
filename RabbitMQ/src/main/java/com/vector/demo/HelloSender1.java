package com.vector.demo;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by 12345 on 2018-7-19.
 */
@Component
public class HelloSender1 {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String sendMsg = "hello1 " + new Date();
        System.out.println("Sender1 : " + sendMsg);
        this.rabbitTemplate.convertAndSend("hello", sendMsg);
    }

    public void send(String word){
        String sendMsg = "hello1 send: "+word+" 发送时间："+ new Date();
        System.out.println("Sender1:"+sendMsg);
        this.rabbitTemplate.convertAndSend("hello", sendMsg);
    }
}
