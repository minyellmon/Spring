package com.demo.jdk;

import com.demo.jdk.FormalGreetingTarget;
import com.demo.jdk.Greeting;
import com.demo.jdk.VerboseGreetingProxy;

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new VerboseGreetingProxy(new FormalGreetingTarget());
        System.out.println(greeting.greet("John"));

    }
}
