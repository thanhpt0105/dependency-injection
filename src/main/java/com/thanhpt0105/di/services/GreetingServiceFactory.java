package com.thanhpt0105.di.services;

import com.thanhpt0105.di.repositories.GreetingRepository;

public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {

        switch (lang){
            case "EN":
                return new I18nEnglishGreetingServiceImpl(greetingRepository);
            case "JP":
                return new I18nJapaneseGreetingServiceImpl(greetingRepository);
            default:
                return new PrimaryGreetingServiceImpl();
        }

    }

}
