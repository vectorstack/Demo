package com.vector.demo.rabbitmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;

/**
 * Created by 12345 on 2018-7-18.
 */
public class SendMQ {
    private final static String QUEUE_NAME = "Hello";
//    public static void main(String[] args) throws IOException, Exception {
//        // connection��socket���ӵĳ��󣬲���Ϊ���ǹ���Э��汾Э�̣�protocol version negotiation����
//        // ��֤��authentication ���ȵ����顣��������Ҫ���ӵ���Ϣ�����ڱ��أ�������ǽ�host��Ϊ��localhost����
//        // ����������������������ϵĴ���ֻ��Ҫ�������Ϊ�ض�����������IP��ַ��
//        ConnectionFactory factory = new ConnectionFactory();
//        factory.setHost("localhost");
//        factory.setPort(5672); //Ĭ�϶˿ں�
//        factory.setUsername("guest");//Ĭ���û���
//        factory.setPassword("guest");//Ĭ������
//        Connection connection = factory.newConnection();
//        Channel channel = connection.createChannel();
//        // �����������Ǵ���һ��channel�����󲿷�API������Ҫͨ������������ɡ�
//        // ����֮ǰ�����Ǳ���������ϢҪ�����ĸ����У�Ȼ�����ǿ�������з�һ����Ϣ��
//        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
//        String message = "Hello world";
//        channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
//        System.out.println(" [x] Sent '" + message + "'");
//        channel.close();
//        connection.close();
//    }
}
