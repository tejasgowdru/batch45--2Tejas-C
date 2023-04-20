package day12;

import java.awt.List;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class StackAppp {
	void Display (List<String>list){
		Iterator<String> obj= list.iterator();
		while (obj.hasNext()){
			System.out.println("Elements are: "+ obj.next());
		}
	}

	public static void main(String[] args) {
		List <String> obj1 = new LinkedList<>();
		obj1.add("rahul");
		obj1.add("pranali");
		obj1.add("tejas");
		obj1.add("prince");
		
		Collections.reverse(obj1);//to make in reverse 
		StackAppp app = new StackAppp();
		app.Display(obj1);

	}

}
