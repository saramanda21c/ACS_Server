package com.shi.acsserver.service.message.protocal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AGVMessageProtoal {
    
    AGVInfo agv = new AGVInfo();
    
    MessageProtocal messageProtocal = new MessageProtocal();
}
