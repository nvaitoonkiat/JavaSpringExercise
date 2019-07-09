package com.luv2code.springdemo;

import org.springframework.stereotype.Component;
import java.util.Random;

@Component
public class HappyFortuneService implements FortuneService {
	private Random rand;
	private int randInt;

	public HappyFortuneService() {
		this.rand = new Random();
		this.randInt = rand.nextInt(3) + 1;
	}

	@Override
	public String getFortune() {
		switch(this.randInt){
			case(1):
				return "Case 1: Today is your lucky day!";

			case(2):
				return "Case 2: Today is your lucky day!";

			case(3):
				return "Case 3: Today is your lucky day!";

			default:
				return "Case default: Today is your lucky day!";
		}
	}

}
