package com.weekone.assignments;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;



public class QuestionTwelve{

	public static void main (String[] args){
		
		try {
			
			   Scanner scanner = new Scanner(new File ("C:\\Users\\Owner\\Desktop\\Data.txt"));
			    while (scanner.hasNextLine())      
			    { 
			    	int i=0;
			         String [] tokens = scanner.nextLine().split(":");
			         System.out.print("Name: " + tokens[i]);
						i=i+1;
						System.out.println(" " +tokens[i]);
						i=i+1;
						System.out.println("Age: " + tokens[i] + " years");
						i=i+1;
						System.out.println("State: " + tokens[i] + " State");
			         
			     } 
			     scanner.close();
			     
			} catch (IOException e) {
			    e.printStackTrace();
			}
	
	}
}

		
	
		