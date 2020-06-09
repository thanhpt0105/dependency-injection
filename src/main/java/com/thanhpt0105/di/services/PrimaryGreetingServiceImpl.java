package com.thanhpt0105.di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Greeting - Primary";
    }
}
// Primary bean will be used if there are no qualifier defined in injected class.