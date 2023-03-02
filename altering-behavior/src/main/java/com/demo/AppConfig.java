package com.demo;

import com.demo.beans.SpringBean4;
import com.demo.beans.SpringBean5;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@ComponentScan(lazyInit = true) @Configuration
public class AppConfig {
    @Bean @Lazy
    public SpringBean4 springBean4(){
        return new SpringBean4();
    }
    @Bean
    public SpringBean5 springBean5(){
        return new SpringBean5();
    }
}
