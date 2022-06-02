package com.syntax.class03;

public class IfConditionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp=60;
		
		if(temp>=60 ) {
			System.out.println("I am going to the beach");
		} else {
			System.out.println("I will go for a walk");
		}
			
		String userName="Hormat";
		
		if(userName.equals("Hormat")) {
	     System.out.println("Hi Hormat");
		
		}else  {
			
			System.out.println("I dont know you");
		}
		
		if (userName != "Hormat") {
			//for strings only == and != are allowed
			//but not recommended to use
			System.out.println("Hi Hormat");
		}else {
			System.out.println("I dont know you");
		}
		
	}

}
//string is a non primitive datatype