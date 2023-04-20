package com.tns.day3;

public class KIA_Motors {
	int noCar;
	String Model;
	String engine;
	int speed;
    
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	void display()
	{
		System.out.println("welcome to kia bengaluru");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        KIA_Motors object = new KIA_Motors();
		object.display();
		object.getSpeed(60);
		System.out.println(object.getSpeed());
		
		
	}

}
