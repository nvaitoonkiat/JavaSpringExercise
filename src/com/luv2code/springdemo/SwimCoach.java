package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
public class SwimCoach implements Coach {
    @Value("${email}")
    private String email;
    @Value("${team}")
    private String team;
//    @Autowired
//    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;
//    use constructor injection
//    @Autowired
    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public SwimCoach() {
        System.out.println("Auto Constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice swimming strokes";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }

    public void printDetails(){
        System.out.println("email " + this.email + " team : " + this.team);
    }

//    @PostConstruct
//    public void postCon(){
//        System.out.println("Post Construct");
//    }
//
//    @PreDestroy
//    public void preDestroy(){
//        System.out.println("Pre destroy");
//    }

    //define setter injection / method injection
//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        System.out.println("Inside fortune setter method");
//        this.fortuneService = fortuneService;
//    }
}
