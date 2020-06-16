package com.thanhpt0105.di.services;

import com.thanhpt0105.di.repositories.GreetingRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


public class I18nJapaneseGreetingServiceImpl implements GreetingService {

    private final GreetingRepository greetingRepository;

    public I18nJapaneseGreetingServiceImpl(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getJapaneseGreeting();
    }
}
