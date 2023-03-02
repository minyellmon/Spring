package com.demo.beans;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class SpringBean3 implements MyInterface, Ordered {
    public SpringBean3(){
        System.out.println("SpringBean3");
    }

    @Override
    public int getOrder() {
        return 0;
    }
    public String toString(){
        return "SpringBean3";
    }
}
