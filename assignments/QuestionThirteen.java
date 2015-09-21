package com.weekone.assignments;

import java.util.ArrayList;
import java.util.List;

public class QuestionThirteen {
	
	
public static void main (String args[]){



	//Remove all prime numbers from the ArrayList
	//Print out the remaining ArrayList
	
	//Step1. Create an ArrayList
	List<Integer> integerArray = new ArrayList<>();
	
	//Step2. Insert 10 consecutive integers (1 to 10)
	integerArray.add(1);
	integerArray.add(2);
	integerArray.add(3);
	integerArray.add(4);
	integerArray.add(5);
	integerArray.add(6);
	integerArray.add(7);
	integerArray.add(8);
	integerArray.add(9);
	integerArray.add(10);
	
	System.out.println(integerArray);
	
	//Add all even numbers up
	//Display the result
	ProcessArrayList sumEvenInts = new ProcessArrayList();
	Integer evenSum = integerArray.sumEvenInts();
	System.out.println(newSum);
	
	//Add all odd numbers up
	//Display the result
	ProcessArrayList sumOddInts = new sumOdds();
	Integer oddSum = integerArray.sumOddInts();
	System.out.println(newSum);
	
}
	
class ProcessArrayList {
	//Add all even numbers up
	
	public Integer sumEvens(List<Integer> integerArray){
		Integer sum = 0;
		for(Integer i : integerArray)
			sum =sum+2;
			return sum;

}

	public Integer sumOdds(List<Integer> integerArray){
		Integer sum = 0;
		for(Integer i : integerArray)
			sum =sum+2;
			return sum;

}
	
}


}


