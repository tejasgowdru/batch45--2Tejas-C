package com.tns.day3;

public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50};
		//for integer array
		for(int i :a)
		{
			System.out.println(i);
		}
		char ch[]= {'p','e','s','c','s','e'};
		for(char c:ch)
		{
			System.out.println(c);
		}
		System.out.println( " ");
		String s1[]= {"pes","svit","msce","tnsif"};
		//for sring array
		for(String s:s1)
		{
			System.out.println(s+ " ");
		}

	}

}
