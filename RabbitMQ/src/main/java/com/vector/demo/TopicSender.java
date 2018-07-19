package com.vector.demo;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by 12345 on 2018-7-19.
 */
@Component
public class TopicSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        String msg1 = "I am topic.mesaage msg======";
        System.out.println("sender1 : " + msg1);
        this.amqpTemplate.convertAndSend("exchange", "topic.message", msg1);

        String msg2 = "I am topic.mesaages msg########";
        System.out.println("sender2 : " + msg2);
        this.amqpTemplate.convertAndSend("exchange", "topic.messages", msg2);
    }
}
