package com.thanhpt0105.di.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Greeting - Setter";
    }
}
