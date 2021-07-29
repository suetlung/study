package com.example.session_test.data;

import org.springframework.security.core.userdetails.UserDetails;

import java.util.Map;

public interface SessionVo {
    UserDetails getUserDetails();
    Map<String,String> getDataMap();
}


