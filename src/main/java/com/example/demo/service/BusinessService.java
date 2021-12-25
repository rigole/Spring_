package com.example.demo.service;

import com.example.demo.model.HelloWorld;
import org.springframework.stereotype.Component;

@Component
public class BusinessService {

    public HelloWorld getHelloworld(){
        HelloWorld helloWorld = new HelloWorld();
        return helloWorld;
    }
}
