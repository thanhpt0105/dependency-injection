package com.thanhpt0105.di.services;

import org.springframework.stereotype.Service;

//@Service
public class ConstructorInjectedGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Greeting - Constructor";
    }
}
