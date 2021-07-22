package com.shi.acsserver.service.message.rabbit;


import com.shi.acsserver.service.message.IMessageProducer;


import org.springframework.stereotype.Component;
//import org.springframework.scheduling.annotation.Scheduled;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class MessageProducer implements IMessageProducer{
    
    private static final String topicExchagne = "ACS-TO-MCS-EXCHANGE";
        
    public String send(){
        String msg = "Hello";
        return sendMessage(msg);
    }


    @Override    
    public String sendMessage(Object message) {       

        try {
            MessageManagement.template.convertAndSend(topicExchagne, "ACS.MCS.IN", message.toString());        
            log.info("Send Message");                            
        } catch (Exception e) {
            log.info(e.getMessage());
        }

        return message.toString();

    }
}
