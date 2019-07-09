package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;
//    use constructor injection
//    @Autowired
//    public TennisCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    public TennisCoach() {
        System.out.println("Auto Constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice tennis serves";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }

    @PostConstruct
    public void postCon(){
        System.out.println("Post Construct");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Pre destroy");
    }

    //define setter injection / method injection
//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        System.out.println("Inside fortune setter method");
//        this.fortuneService = fortuneService;
//    }
}
