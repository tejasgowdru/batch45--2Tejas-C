package day12;

import java.util.Stack;

public class StackApp {

	public static void main(String[] args) {//string use madu interger badlu
		Stack<Integer> obj= new Stack<>();
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		obj.push(50);
		System.out.println(obj);
		
		obj.pop();
		obj.pop();//to delete  recent or ending ones
		obj.pop();
		System.out.println(obj);
		
		System.out.println(obj.peek());//it will give recent one no or largest value

	}

}
