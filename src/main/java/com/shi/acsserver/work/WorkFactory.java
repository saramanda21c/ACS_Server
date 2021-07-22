package com.shi.acsserver.work;

import java.lang.reflect.Constructor;

import com.shi.acsserver.service.message.protocal.AGVMessageProtoal;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WorkFactory {
    
    public static String Action(Object actionInfo) { 

        AGVMessageProtoal info = (AGVMessageProtoal)actionInfo;              
        IWork work = CreateInstance(info.getAgv().getWorkProcessPath());
        if(work != null){
            work.doWork(info.getMessageProtocal());
        }
        else{
            log.info("해당 Work에 필요한 Class가 없습니다.");
        }
                        
        return "WorkFactory_Action";
    }

    private static IWork CreateInstance(String className) {
        Object instance = null;       

        try {
            Class<?> clazz = Class.forName(className);
            Constructor<?> constructor = clazz.getConstructor();            

            log.info(clazz.getName());

            instance = constructor.newInstance();
            
        } catch (Exception e) {
            log.info(e.getMessage());
        }
    
        return (IWork)instance;
    }
}
