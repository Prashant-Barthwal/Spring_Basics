package com.spring.project1;
public class Run implements Coach {

    FortuneService fortune;

    Run()
    {
        
    }
    Run(FortuneService fortune)
    {
this.fortune=fortune;
    }

    @Override
    public void getDailyWorkout()
    {
        System.out.println("Take 1 round of run");
    }


    @Override
    public void getDailyFortune()
    {
        System.out.println("Luck Day of run");
    }
}
