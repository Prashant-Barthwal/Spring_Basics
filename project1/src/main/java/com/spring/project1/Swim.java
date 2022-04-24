package com.spring.project1;
public class Swim implements Coach {

    FortuneService fortune;

    Swim()
    {
        
    }
    Swim(FortuneService fortune)
    {
this.fortune=fortune;
    }


    @Override
    public void getDailyWorkout()
    {
        System.out.println("Take 1 round of swimming pool");
    }

    @Override
    public void getDailyFortune()
    {
        System.out.println("Luck Day of run");
    }
}
