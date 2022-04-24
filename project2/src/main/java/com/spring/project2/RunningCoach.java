package com.spring.project2;

import org.springframework.stereotype.Component;

@Component
public class RunningCoach implements Coach{

 
protected FortuneService fortune;
    RunningCoach(FortuneService fortune)
    {
        this.fortune=fortune;

    }



    @Override
    public void getDailyFortune()
    {
  System.out.println("Do 15 jumps");
    }
    
    
    @Override
    public void getDailyWorkout()
    {

        fortune.getDailyFortune();

        
    }
}
