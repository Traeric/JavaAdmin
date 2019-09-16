package com.ericjin.javadmin;

import lombok.Data;

import java.util.Map;

@Data
public class CommonsSetting {
    private Map<String, String> dataBase;


    /**
     * action类的位置
     * @return
     */
    public String actionPackage() {
        return "com.ericjin.javadmin.Action";
    }
}
