package com.homemean.sb.config;

import com.homemean.sb.entity.Teacher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean
    public Teacher teacher(){
        return new Teacher("Homemean",27);
    }
}
