package com.tns.day3;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNumber=10 , secondNumber=20;
		System.out.println("-- Before swapping ----");
		System.out.println("FirstNumber=" +firstNumber);
		System.out.println("SecondNumber=" +secondNumber);
		
		firstNumber = firstNumber - secondNumber;
		secondNumber = firstNumber + secondNumber;
		firstNumber = secondNumber- firstNumber;
 		
		System.out.println("-- after swapping ----");
		System.out.println("FirstNumber=" +firstNumber);
		System.out.println("SecondNumber=" +secondNumber);

	}

}
