package com.spring.project1;

public class CricketCoach implements Coach {
    

    private FortuneService fortune;
  private String teamName;
  private String emailAddress;
    public void setFortuneService(FortuneService fortune)
    {
        this.fortune=fortune;
    }
    public void setTeamName(String teamName)
    {
        this.teamName=teamName;
         System.out.println(this.teamName);
    }
    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress=emailAddress;
        System.out.println(this.emailAddress);
    }
    @Override
    public void getDailyWorkout()
    {
        System.out.println("Practice of bowling for 15 Minsutes");
    }


    @Override
    public void getDailyFortune()
    {
        System.out.println("Luck Day oof bowling");
    }
}
