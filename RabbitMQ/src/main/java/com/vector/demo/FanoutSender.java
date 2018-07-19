package com.vector.demo;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by 12345 on 2018-7-19.
 */
@Component
public class FanoutSender {
    @Autowired
    private AmqpTemplate amqpTemplate;


    public void send(){
        String msgString = "fanoutSender: hello i am vector";
        System.out.println(msgString);
        this.amqpTemplate.convertAndSend("fanoutExchange","abcd.ee",msgString);
    }
}
