package com.weekone.assignments;

import java.util.Scanner;

public class QuestionTwo {

	public static void main(String[] args) {
		
		System.out.println("Enter your principal: ");
		Scanner scanner = new Scanner(System.in);
		double principle = scanner.nextDouble();
		
		
		System.out.println("Enter your rate: ");
		final double rate = scanner.nextDouble();
		

		System.out.println("Enter your time in years: ");
		double time = scanner.nextDouble();
		scanner.close();


		double total = principle * rate * time;
		System.out.println("Your Simple Interest is $" +total +".");
	}

}
