package day12;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class App {
	
	void Display (List<String> list){
		ListIterator<String> obj = list.listIterator();
		while(obj.hasNext()){
			System.out.println("Elemnts is: "+ obj.next());
		}
	}

	public static void main(String[] args) {
		List<String> obj1 = new LinkedList<>();
		obj1.add("prine");
		obj1.add("komal");
		obj1.add("rahul");
		
		App obj3 = new App();
		obj3.Display(obj1);
	}

}
