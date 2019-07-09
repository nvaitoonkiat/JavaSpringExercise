package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String args[]){
        //read spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //get bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
        //use methods from bean
        boolean result = theCoach == alphaCoach;
        System.out.println("Pointing to same obj " + result);
        System.out.println("theCoach memory location " + theCoach);
        System.out.println("alphaCoach memory location " + alphaCoach);
        //close context
        context.close();
    }
}
