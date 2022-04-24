package com.spring.project4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;


public class RunningCoach implements Coach {

 
 @Value("${foo.email}")
 protected String email;
  
 
 @Value("${foo.team}")
 protected String team;
 
 protected FortuneService fortune;

  public RunningCoach(FortuneService fortune) {
    this.fortune=fortune;
  }

  @Override
  public void getDailyFortune() {
    System.out.println("Do 15 jumps");
  }

  @Override
  public void getDailyWorkout() {
    fortune.getDailyFortune();
  }


  public void getDetails() {
    System.out.println(email+" "+team);
  }


}
