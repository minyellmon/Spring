package com.demo.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component @Lazy
public class SpringBean1 {
    private static int count = 0;
    public SpringBean1(){
        System.out.println("Springbean1 constructor.");
        count++;

    }

    public static int getCount() {
        return count;
    }
}
