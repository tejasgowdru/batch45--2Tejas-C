package dayfour;

import java.util.Scanner;

public class ConstructorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name, city;
		int id;
		System.out.println("Enter Customer Id: ");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Customer Name");
		name=sc.nextLine();
		
		System.out.println("Enter Customer City");
		City=sc.nextLine();
		System.out.println(" ");
		Customer c1=new Customer(); //default constroctor invoked
		c1.getCustomerName(name);
		c1.setCustomerId(id);
		c1.setCustomerCity(city);
		
		System.out.println(c1);
		
		System.out.println("Enter Customer Id: ");
		id=sc.nextLine();
		
		System.out.println("Enter Customer Name: ");
		name=sc.nextLine();
		
		System.out.println("Enter Customer City: ");
		city=sc.nextLine();
		customer c1=new Cutomer(name , id ,city);
		System.out.println(c2);
		sc.close();
		

	}
	

}
