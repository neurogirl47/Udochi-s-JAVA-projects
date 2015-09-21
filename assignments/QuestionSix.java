package com.weekone.assignments;

public class QuestionSix {

	 public static void main(String args[]) {

		 int fib1 = 0;
		 int fib2 = 1;

		 System.out.println(fib1);
		 
		 System.out.println(fib2);
		 
		 int fibonacci = fib1 + fib2;
		 

		while (fibonacci<100){
			
			System.out.println(fibonacci);
			fib1 = fibonacci;
			fib2 = fibonacci + fib1;
			System.out.println(fib2);
			fibonacci = fib2 + fib1;
			System.out.println(fibonacci);
			fib1 = fib2 + fibonacci;
			System.out.println(fib1);
			fib2 = fib1 + fibonacci;
			System.out.println(fib2);
			fibonacci = fib1 + fib2;
}

	 }
}