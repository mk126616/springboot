package com.mk.rabbitmq;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@org.springframework.context.annotation.Configuration
public class Configuration
{
    @Resource
    private RabbitTemplate rabbitTemplate;

    /**
     * 设置发发送消息回调
     */
    @PostConstruct
    public void custom(){
        rabbitTemplate.setConfirmCallback((correlationData,ack,cause)-> System.out.println("交换机发送确认回调："+correlationData));
        rabbitTemplate.setReturnCallback((message, replyCode, replyText,
                                                 exchange, routingKey)-> System.out.println("队列接受消息失败回调："+message));
    }
    /**
     * 优先级队列
     */
    @Bean
    public Queue priorityQueue(){
        Map<String,Object> argument = new HashMap<>();
        argument.put("x-max-priority",10);//优先级队列
        argument.put("x-queue-mode","lazy"); //惰性队列
        return new Queue("priorityQueue",false,false,true,argument);
    }
    @Bean
    public DirectExchange priorityExchange(){
        return new DirectExchange("priorityExchange", false, true);
    }
    @Bean
    public Binding priorityBinding(@Qualifier("priorityQueue") Queue queue,@Qualifier("priorityExchange")DirectExchange exchange){
        return BindingBuilder.bind(queue).to(exchange).with("priority-routing-key");
    }

}
