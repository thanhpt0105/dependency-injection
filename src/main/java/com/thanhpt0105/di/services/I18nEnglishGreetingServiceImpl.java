package com.thanhpt0105.di.services;

import com.thanhpt0105.di.repositories.GreetingRepository;

public class I18nEnglishGreetingServiceImpl implements GreetingService{

    private final GreetingRepository greetingRepository;

    public I18nEnglishGreetingServiceImpl(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}
