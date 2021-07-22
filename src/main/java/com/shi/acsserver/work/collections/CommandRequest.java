package com.shi.acsserver.work.collections;
import com.shi.acsserver.service.message.IMessageProducer;
import com.shi.acsserver.service.message.protocal.MessageProtocal;
import com.shi.acsserver.service.message.rabbit.MessageProducer;
import com.shi.acsserver.work.IWork;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommandRequest implements IWork{

    IMessageProducer producer = new MessageProducer();

    @Override
    public void doWork(MessageProtocal messageProtocal) {
        producer.sendMessage("Do Work CommandRequest");
        log.info("Do Work CommandRequest");
    }
    
}
