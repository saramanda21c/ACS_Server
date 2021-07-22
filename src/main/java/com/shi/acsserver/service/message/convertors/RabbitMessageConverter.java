package com.shi.acsserver.service.message.convertors;

import java.sql.Timestamp;

import com.shi.acsserver.service.message.protocal.MessageProtocal;

public class RabbitMessageConverter {
    
    public static MessageProtocal convertToMessageProteocal(String message){

        MessageProtocal messageProtocal = new MessageProtocal();
        
        messageProtocal.getHeader().setMsgName(message);
        messageProtocal.getHeader().setMsgName("AGV_01");
        messageProtocal.getHeader().setTransactionId(new Timestamp(System.currentTimeMillis()).toString());

        messageProtocal.getDataSet().put("Process", message);

        return messageProtocal;
    }
}
