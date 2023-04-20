package com.tns.day3;

public class ContineuDemo {

	public static void main(String[] args) {
		for(int k=5; k < 15; k++)
		{
			//odd numbers are skipped
			if(k%2 !=0)
				continue;
			//both odd and even are printed
			System.out.println(k+" ");
		}
	}

}
