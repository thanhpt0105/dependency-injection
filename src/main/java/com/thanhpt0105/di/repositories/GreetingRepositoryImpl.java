package com.thanhpt0105.di.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Greeting - English";
    }

    @Override
    public String getJapaneseGreeting() {
        return "Greeting - Japanese";
    }
}
