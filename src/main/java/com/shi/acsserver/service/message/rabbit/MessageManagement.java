package com.shi.acsserver.service.message.rabbit;

import com.shi.acsserver.config.RabbitMqConfig;

import org.springframework.amqp.rabbit.core.RabbitTemplate;

public class MessageManagement {    

    public static RabbitMqConfig config = new RabbitMqConfig();
    public static RabbitTemplate template = config.rabbitTemplate();


}
