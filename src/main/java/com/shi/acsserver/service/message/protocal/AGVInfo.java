package com.shi.acsserver.service.message.protocal;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class AGVInfo {

    public AGVInfo(String name, String address, int port, String state, String workProcessPath) {
        this.name = name;
        this.address = address;
        this.port = port;
        this.state = state;
        this.workProcessPath = "com.shi.acsserver.work.collections." + workProcessPath;
    }
    
    String name;
    String address;
    int port;
    String state;
    String workProcessPath;
}
