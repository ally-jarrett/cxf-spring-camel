package com.cxf.services.impl;

import com.cxf.services.HelloWorldService;

public class HelloWorldServiceImpl implements HelloWorldService {
	
    public String sayHi(String text) {
        System.out.println("sayHi called for " + text);
        return "Hello " + text;
    }

}
