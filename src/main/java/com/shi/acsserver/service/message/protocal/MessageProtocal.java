package com.shi.acsserver.service.message.protocal;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageProtocal {

    HeaderMessage Header = new HeaderMessage();
    Map<String, Object> DataSet = new HashMap<String, Object>();
}
