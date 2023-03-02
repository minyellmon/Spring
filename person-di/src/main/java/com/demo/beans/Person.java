package com.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Person {

    private String name="Thaw Thaw";

    @PostConstruct
    public void init(){
        System.out.println("PostConstruct::Address"+ address.getClass().getSimpleName());

    }


    private final Address address;

    public Person(Address address) {
        this.address=address;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }



    public String personInfo() {
        return name+"::"+address.getStreetName();

    }




}
