package com.spring.project4;
import org.springframework.stereotype.Component;


public class GoodFortune implements FortuneService {

    @Override
    public void getDailyFortune()
    {
        System.out.println("Today is your lucky day");
    }
}
