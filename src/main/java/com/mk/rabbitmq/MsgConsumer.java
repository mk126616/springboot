package com.mk.rabbitmq;


import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MsgConsumer
{
    @RabbitListener(queues="priorityQueue")
    public void consumerMsg(Message message, Channel channel){
        System.out.println("接受到消息："+new String(message.getBody()));
    }
}
