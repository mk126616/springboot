package com.mk.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class MsgSender
{
    @Autowired
    private RabbitTemplate template;
    public void sendMsg(){

    }
}
