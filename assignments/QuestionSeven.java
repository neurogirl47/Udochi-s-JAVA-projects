package com.weekone.assignments;

public class QuestionSeven {
	
	public static void main(String[] args){
		
		createArray arrayNew = new createArray();
		int [] createdArray = createArray.fillArray(100);
		arrayNew.printEvens(createdArray);
		
	}

  static class createArray {
	public static int[] fillArray(int k){
	int numberStorage [] = new int [k];
	
	for (int i=0; i<k; i++){
		numberStorage[i] = i+1;
	}
		return numberStorage;
	}

	public void printEvens(int [] createdArray){
		
	for(int j : createdArray){
		if (j%2==0){
		System.out.println(j);
	
	}
	
	}
	}
}
}	
		
	

