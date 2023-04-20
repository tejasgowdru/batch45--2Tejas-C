package daysix;

public class Student extends Person {
	private String clas;
	private float Per;
	public Student(){
		System.out.println("Student class default constructor");
		clas="Fy";
		per=70;
	}
	public Student(String clas, float per ){
		this.clas=clas;
		this.Per=per;
	}
	public String getClas() {
		return clas;
	}
	public void setClas(String clas) {
		this.clas = clas;
	}
	public float getPer() {
		return Per;
	}
	public void setPer(float per) {
		Per = per;
	}
	public Student(String name, String city, String clas, float per){
		//super.name=name;
		//super.city=city// privaye member cant inherite in child class
		super(name,city);
		this.clas=clas;
		this.Per=per;
	}
	public String toString(){
		return"Student[clas" + clas+ ",per=" + per+ " , getName()="+ getName() + ", getCity()=" + getCity()+"]";
	}

}
