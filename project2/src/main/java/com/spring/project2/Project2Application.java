package com.spring.project2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Project2Application {

  public static void main(String[] args) {
    SpringApplication.run(Project2Application.class, args);

    ApplicationContext coach = new ClassPathXmlApplicationContext("auto.xml");

    Coach theCoach = coach.getBean("runningCoach", Coach.class);
    theCoach.getDailyWorkout();
  }
}
