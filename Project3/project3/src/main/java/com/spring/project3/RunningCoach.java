package com.spring.project3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RunningCoach implements Coach {

    //FIELD INJECTION

    @Autowired
  protected FortuneService fortune;

  @Override
  public void getDailyFortune() {
    System.out.println("Do 15 jumps");
  }

  @Override
  public void getDailyWorkout() {
    fortune.getDailyFortune();
  }
}
