package com.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean1 {
    @Value("${app.invoice}")
    private int invoice;
    @Value("${app.name}")
    private String name;
    @Value("${app.vm.name}")
    private String vm;
    @Value("${JAVA_HOME}")
    private String javaHome;
    @Value(("${os.name}"))
    private String osname;



    public void print(){
        System.out.println("Invoice:"+ invoice);
        System.out.println("Name:"+ name);
        System.out.println("VM Properties:"+ vm);
        System.out.println("JAVA home:"+ javaHome);
        System.out.println("Osname:"+ osname);
    }
}
