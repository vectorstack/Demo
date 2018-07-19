package com.vector.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 12345 on 2018-7-19.
 */
@Controller
@RequestMapping("/rabbit")
public class RabbitTest {
    @Autowired
    private HelloSender1 helloSender1;
    @Autowired
    private HelloSender2 helloSender2;
    @Autowired
    private UserSender userSender;

    @Autowired
    private TopicSender topicSender;

    @Autowired
    private FanoutSender fanoutSender;

    @RequestMapping("/hello")
    public void hello(){
        helloSender1.send();
    }

    @RequestMapping("/oneToMany")
    public void oneToMany(){
        for(int i = 0; i < 10; i++){
            helloSender1.send("hellomsg:"+i);
        }
    }

    @RequestMapping("/manyToMany")
    public void manyToMany() {
        for(int i=0;i<10;i++){
            helloSender1.send("hellomsg1:"+i);
            helloSender2.send("hellomsg2:"+i);
        }

    }

    @RequestMapping("/userTest")
    public void userTest() {
        userSender.send();
    }

    @RequestMapping("/topicTest")
    public void topicTest(){
        topicSender.send();
    }

    @RequestMapping("/fanoutTest")
    public void fanoutTest(){
        fanoutSender.send();
    }
}
