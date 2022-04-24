package com.spring.project3;

import org.springframework.stereotype.Component;

@Component
public class GoodFortune implements FortuneService {

    @Override
    public void getDailyFortune()
    {
        System.out.println("Today is your lucky day");
    }
}
