package com.reflection.advanced.logging_proxy;

public class GreetingImpl implements Greeting{
	
    @Override
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    @Override
    public void sayGoodbye(String name) {
        System.out.println("Goodbye, " + name + "!");
    }
}
