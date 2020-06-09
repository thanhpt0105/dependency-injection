package com.thanhpt0105.di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("JP")
@Service("i18nService")
public class I18nJapaneseGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Greeting - JP";
    }
}
