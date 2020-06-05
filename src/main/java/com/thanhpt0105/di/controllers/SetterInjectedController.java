package com.thanhpt0105.di.controllers;

import com.thanhpt0105.di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;

public class SetterInjectedController {
    @Autowired
    private GreetingService greetingService;

    public GreetingService getGreetingService() {
        return greetingService;
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
