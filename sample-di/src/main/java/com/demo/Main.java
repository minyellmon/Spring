package com.demo;

import com.demo.beans.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(AppConfi.class);
        context.registerShutdownHook();

        Person person= context.getBean(Person.class);
        person.setName("Mg Mg");
        System.out.println("Name:"+person.getName());
    }
}
