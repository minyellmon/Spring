package com.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component @Lazy(value = true)
public class SpringBean1 {
    @Autowired
    private SpringBean2 springBean2;
    public SpringBean1(){
        System.out.println(this.getClass().getSimpleName());

    }
}
