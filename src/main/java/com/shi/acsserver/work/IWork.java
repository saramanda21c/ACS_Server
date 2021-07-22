package com.shi.acsserver.work;

import com.shi.acsserver.service.message.protocal.MessageProtocal;

public interface IWork {    
    void doWork(MessageProtocal messageProtocal);
}
