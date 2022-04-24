package com.spring.project4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Project4Application {

	public static void main(String[] args) {
		SpringApplication.run(Project4Application.class, args);
		AnnotationConfigApplicationContext coach = new AnnotationConfigApplicationContext(Config.class);

		Coach theCoach = coach.getBean("runningCoach", Coach.class);
		theCoach.getDailyWorkout();
	}

}
