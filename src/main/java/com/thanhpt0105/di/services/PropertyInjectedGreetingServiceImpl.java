package com.thanhpt0105.di.services;

import org.springframework.stereotype.Service;

//@Service
public class PropertyInjectedGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Greeting - Property";
    }
}
