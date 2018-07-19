package com.vector.demo;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by 12345 on 2018-7-19.
 */
@Component
@RabbitListener(queues = "user")
public class UserReceiver {

    @RabbitHandler
    public void process(User user){
        System.out.println("user receive  : " + user.getName()+"/"+user.getPass());
    }
}
