package com.tns.day2;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char x='1';
		switch(x)
		{
		case 'l':
		case 'L':
			System.out.println(x+" is a Letter");
			break;
			
		case 'd':
		case 'D':
		System.out.println(x+" is a Digit");
		break;
		
		case 'w':
		case 'W':
		System.out.println(x+" is a White space");
		break;
		
		case 's':
		case 'S';
		System.out.println(x+" is a Special symbol");
		break;
		default;
		
		
		}

	}

}
