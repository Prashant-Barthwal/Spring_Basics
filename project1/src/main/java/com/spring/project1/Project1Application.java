package com.spring.project1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Project1Application {

	public static void main(String[] args) {
		SpringApplication.run(Project1Application.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext(
      "cond.xml"
    );
    Coach theCoach = context.getBean("myCoach", Coach.class);
    theCoach.getDailyWorkout();
	}

}
