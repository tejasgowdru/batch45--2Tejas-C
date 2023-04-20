package com.generic;

class DataGener<T>{
	private T obj;

	public DataGener(T obj) {
		this.obj=obj;
	}

	public T getObj() {
		return obj;
	}

	@Override
	public String toString() {
		return "DataGener [obj=" + obj + "]";
	}
	
}

public class DataGeneric {

	public static void main(String[] args) {
		DataGener<String> obj1= new DataGener<String> ("tejas");//use integer integer
		String  out = obj1.getObj();
		
		System.out.println(out);

	}

}
