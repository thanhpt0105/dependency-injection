package com.thanhpt0105.di.controllers;

import com.thanhpt0105.di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

//@Controller
public class ConstructorInjectedController {
    GreetingService greetingService;

    //using qualifier to make Spring knows which implementation of Greeting Service to inject.
    public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
