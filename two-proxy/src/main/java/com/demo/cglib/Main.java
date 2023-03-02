package com.demo.cglib;

public class Main {
    public static void main(String[] args) {
        MyGreeting greetingProxy = new GreetingProxy();
        System.out.println(greetingProxy.greet(" BoBo"));
    }
}
