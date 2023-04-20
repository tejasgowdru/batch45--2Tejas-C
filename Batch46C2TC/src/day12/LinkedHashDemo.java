package day12;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashDemo {

	public static void main(String[] args) {
		Set<Integer> obj = new LinkedHashSet<>();
		for (int i=30; i>0; i--);{
			obj.add(i);
		}
		for (int i:obj){
			System.out.println(i);
		}
		

	}

}
