package com.shi.acsserver.service.message.protocal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HeaderMessage {
    
    String RequestFrom = "ACS";
    String RequstTo;
    String MsgName;
    String TransactionId;     
}
