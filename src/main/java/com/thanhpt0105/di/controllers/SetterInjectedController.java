package com.thanhpt0105.di.controllers;

import com.thanhpt0105.di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

//@Controller
public class SetterInjectedController {

    @Qualifier("setterInjectedGreetingServiceImpl") //using qualifier to make Spring knows which implementation of Greeting Service to inject.
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
