package day12;

import java.util.HashSet;
import java.util.Set;

public class Hasheet {

	public static void main(String[] args) {
		Set<String> obj= new HashSet<>();
		obj.add("Vikas");
	    obj.add("Sagar");
	    obj.add("pranav");
	    obj.add("Nikhil");
	    obj.add("Nikhil");//it will not show the duplicate value that is set method  try  this line System.out.println(obj);
	    
	    System.out.println(obj.contains("shital"));//to search or contains ttrue /false
	    

	}

}
