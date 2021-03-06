package com.spring.project4;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Configuration
@PropertySource("classpath:application.properties")
public class Config {
    

    @Bean
    public FortuneService  goodFortune()
    {
        return new  GoodFortune();
    }

    @Bean
    public Coach runningCoach()
    {
        Coach coach = new RunningCoach( goodFortune()) ;

        return coach;
    }


}
