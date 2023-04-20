package com.tns.day3;

public class SwapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNumber=10 , secondNumber=20;
		System.out.println("-- Before swapping ----");
		System.out.println("FirstNumber=" +firstNumber);
		System.out.println("SecondNumber=" +secondNumber);
		//temporaary variable
		int temp = firstNumber ;  //10
		firstNumber = secondNumber; //20
		secondNumber = temp; //10
		
		System.out.println("-- after swapping ----");
		System.out.println("FirstNumber=" +firstNumber);
		System.out.println("SecondNumber=" +secondNumber);

	}

}
