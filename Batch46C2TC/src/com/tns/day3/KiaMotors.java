package com.tns.day3;

public class KiaMotors {
	int noCar;
	String Model;
	String engine="2.0L disel";
	int speed;
	

	
	void display()
	{
		for(int i=0;i<5;i++)
		
		System.out.println("welcome to kia bengaluru");
		
	}
	void displaylogo()
	{
		System.out.println("KIa logo");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KiaMotors object = new KiaMotors();
	
		object.display();
		System.out.println(object.speed);
		System.out.println(object.engine);
		
		object.displaylogo();
		
		

	}

}
