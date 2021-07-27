package com.example.session_test.configuration;

import com.example.session_test.data.SessionVo;
import com.example.session_test.data.SimpleSessionVo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
public class DataConfig {

    @Bean
    @SessionScope
    public SessionVo sessionScopedBean() {
        return new SimpleSessionVo();
    }



}
