package com.demo;

import org.ocpsoft.prettytime.PrettyTime;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:/application.properties")
@Configuration
@ComponentScan
public class AppConfig {
    @Bean
    public PrettyTime prettyTime(){
       return new PrettyTime();
    }
}
