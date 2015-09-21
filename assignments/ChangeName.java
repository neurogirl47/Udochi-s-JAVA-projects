package com.weekone.assignments;

//Question four

public class ChangeName extends NameManip {
	
	
	public static void main(String[] args) {

		String myName = "Udochi Okeke";
		String age = "31";
		
		NameManip nameCheck = new ChangeName();
		
		boolean value = nameCheck.checkName(myName);
		System.out.println(value);
		
		String nametoUpper = nameCheck.convertLowerCase(myName);
		System.out.println(nametoUpper);	
		
		int intParsed = nameCheck.stringToInt(age);
		System.out.println(intParsed);
		


	}

	public boolean checkName(String name){

		char [] nameArray = name.toCharArray();
		
		for(int i=0;i<nameArray.length;i++){

			 if (nameArray[i] == Character.toUpperCase(nameArray[i]))
			{
				return true;
			}	
			 System.out.println(nameArray[i]);
		}
				return false;
			
		
		
	
		}
	

	

	public String convertLowerCase(String firstName){

		String nameUpperCase = firstName.toUpperCase();
		return nameUpperCase;
		
}

	public int stringToInt(String name) {

		int nameNum = Integer.parseInt(name) + 10;
		return nameNum;
}	





}