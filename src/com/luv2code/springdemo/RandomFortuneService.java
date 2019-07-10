package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {
    //create array of strings
    public String[] data = {
            "String 1",
            "String 2",
            "String 3"
    };

    private Random rand = new Random();
    @Override
    public String getFortune() {
        return "Random fortune " +  data[rand.nextInt(data.length)];
    }

    public String[] getData() {
        return data;
    }
}
