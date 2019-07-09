package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class TestFortuneService implements FortuneService {
	private Random rand;
	private int randInt;

	public TestFortuneService() {
		this.rand = new Random();
		this.randInt = rand.nextInt(3) + 1;
	}

	@Override
	public String getFortune() {
		switch(this.randInt){
			case(1):
				return "TEST Case 1: Today is your lucky day!";

			case(2):
				return "TEST Case 2: Today is your lucky day!";

			case(3):
				return "TEST Case 3: Today is your lucky day!";

			default:
				return "TEST Case default: Today is your lucky day!";
		}
	}

}
