package com.example.session_test.data;

import java.util.HashMap;
import java.util.Map;

public class SimpleSessionVo implements SessionVo{

    Map<String , String> dataMap = new HashMap<>();

    @Override
    public Map<String, String> getDataMap() {
        return this.dataMap;
    }
}
