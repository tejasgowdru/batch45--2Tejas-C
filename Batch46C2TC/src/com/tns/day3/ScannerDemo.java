package com.tns.day3;

import java.util.Scanner;

//how to print an integer entered by user by an user
public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input from strandard input means keyboard only
		Scanner reader = new Scanner (System.in);
		System.out.println(" enter a number: ");
		//nextInt() reads the next integer from the keyboard
		int number = reader.nextInt();
		// println() tp print the following output
		System.out.println("you entered number " + number);

	}

}
