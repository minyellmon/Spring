package com.demo;

import com.demo.beans.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();
        Knight knight = context.getBean(Knight.class);
        System.out.println(knight.goQuest());
    }




}
