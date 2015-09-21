package com.weekone.assignments;

public class QuestionNine {

	public static void main (String[] args){
		int x = 5;
		int y = 7;
		
		
		//swapping x with z
		x = x + y;
		y = x-y;
		
		//swapping z with x;
		x=x-y;
		
		System.out.println("y is now " + y);
		System.out.println("x is now " + x);
	}
	
}
