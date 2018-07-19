package com.vector.demo;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by 12345 on 2018-7-19.
 */
@Component
@RabbitListener(queues = "topic.message")
public class TopicMessageReceiver {

    @RabbitHandler
    public void process(String msg){
        System.out.println("topicMessageReceiver :"+ msg);
    }
}
