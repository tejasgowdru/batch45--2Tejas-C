package day12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaCollectionIndex {

	public static void main(String[] args) {
		List<String> obj1= new LinkedList<>(); //Array instead of linked
		obj1.add("Amit");
		obj1.add("Akash");
		obj1.add("trupti");
		obj1.add("Guru");
		//search by string (name) and find out positions
		System.out.println(obj1);
		System.out.println(obj1.indexOf("Guru"));//this is for index of names it will start from 0 to 1234...
		System.out.println(obj1.indexOf("Akash"));//wrong letter searching

	}

}
