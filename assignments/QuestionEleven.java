package com.weekone.assignments;

import java.text.ParseException;
import java.util.Date;


public class QuestionEleven {
	
	public static void main(String[] args) throws ParseException {
		
	
	int num = 3;
	int squaredNum = 9;
	String fun = "I/ am /learning /core /java";
	
	switch (num){
	
	case 1:
		System.out.println((Math.sqrt(squaredNum)));
		break;
	case 2:
		Date date = new Date();
		System.out.println(date);
		break;
	case 3:
		String[] funTimes = fun.split("/");
		System.out.println(funTimes[0]);
	
	}

}
}