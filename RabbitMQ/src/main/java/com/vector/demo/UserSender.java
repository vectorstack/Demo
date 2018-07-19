package com.vector.demo;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by 12345 on 2018-7-19.
 */
@Component
public class UserSender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        User user = new User();
        user.setName("vector");
        user.setPass("123456");
        System.out.println("user send : " + user.getName()+"/"+user.getPass());
        this.amqpTemplate.convertAndSend("user",user);
    }
}
