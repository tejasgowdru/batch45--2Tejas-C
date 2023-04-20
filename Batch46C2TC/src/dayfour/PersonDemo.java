package dayfour;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		// sacnner class/object to acess user input
		Scanner ob = new Scanner(System.in);
		String name;
		System.out.println("Enter Person Name");
		name= ob.next();
		System.out.println("Enter age: ");
		int age= ob.nextInt();
		System.out.println("Enter Gender: ");
		String gender =ob.next();
		System.out.println("Enter taxable income");
		int income= ob.nextInt();
		//person obejct and getter setter
		Person person =new Person();
		person.setName(name);
		person.setAge(age);
		person.setgender(gender);
		person.setincome(income);
		System.out.println(person);
		TaxCalculation calc = new TaxCAlculation();
		calc.calculateTax(person);
		System.out.println("After calculation tax: ");
		ob.close();
		
	

	}

}
