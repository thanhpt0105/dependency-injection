package com.thanhpt0105.di.controllers;

import com.thanhpt0105.di.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}

