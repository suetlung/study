package com.example.session_test.data;

import org.springframework.security.core.userdetails.UserDetails;

import java.util.HashMap;
import java.util.Map;

public class SimpleSessionVo implements SessionVo{

    UserDetails userDetails;

    Map<String , String> dataMap = new HashMap<>();

    @Override
    public Map<String, String> getDataMap() {
        return this.dataMap;
    }

    @Override
    public UserDetails getUserDetails() {
        return this.userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }
}
