package com.thanhpt0105.di.config;

import com.thanhpt0105.di.repositories.GreetingRepository;
import com.thanhpt0105.di.services.GreetingService;
import com.thanhpt0105.di.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository repository) {
        return new GreetingServiceFactory(repository);
    }

    @Bean
    @Primary
    @Profile({"default", "EN"})
    GreetingService i18nEnglishGreetingServiceImpl(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("EN");
    }

    @Bean
    @Profile("JP")
    GreetingService i18nJapaneseGreetingServiceImpl(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("JP");
    }

}
