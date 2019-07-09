package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public static void main(String args[]){
        //read spring config file
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);
        //get bean from spring container
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
        //use methods from bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        theCoach.printDetails();
        //close context
        context.close();
    }
}
