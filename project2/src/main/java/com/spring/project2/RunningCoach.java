package com.spring.project2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RunningCoach implements Coach {

    //FIELD INJECTION

    @Autowired
  protected FortuneService fortune;

  /*
//USING CONTRUCTOR AUTOWIRE

@Autowired 
    RunningCoach(FortuneService fortune)
    {
        this.fortune=fortune;

    }

*/

/*
  //USING Setter method AUTOWIRE
  @Autowired
  public void setFortuneService(FortuneService fortune) {
    this.fortune = fortune;
  }
*/
  @Override
  public void getDailyFortune() {
    System.out.println("Do 15 jumps");
  }

  @Override
  public void getDailyWorkout() {
    fortune.getDailyFortune();
  }
}
