package day12;

import java.util.Set;
import java.util.TreeSet;

public class TreeSset {

	public static void main(String[] args) {
		Set<String> obj = new TreeSet<>();
		for (int i=100; i>0; i--){
			obj.add("A"+ i);
			
		}
		for (String i:obj){
			System.out.println(i);
		}
		

	}

}
