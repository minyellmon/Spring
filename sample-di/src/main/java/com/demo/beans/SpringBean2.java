package com.demo.beans;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class SpringBean2 implements MyInterface, Ordered {
    public SpringBean2(){

        System.out.println("SpringBean2");
    }

    @Override
    public int getOrder() {

        return 0;
    }

    public String toString(){
        return "SpringBean2";
    }
}
