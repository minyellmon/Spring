package com.demo.jdk;

public class VerboseGreetingProxy implements Greeting{
    private FormalGreetingTarget target;

    public VerboseGreetingProxy(FormalGreetingTarget formalGreetingTarget) {
        this.target = target;

    }


    public String greet(String name){
    return """
            target.greet(name) .
            Hey mate!How're you doing?
            
            """;
}
}
