package com.spring.project1;

public class GoodFortune implements FortuneService {

    @Override
    public void getDailyFortune()
    {
   System.out.println("Today is your lucky day");
    }
    
}
