package daysix;

public class person {
	private String name;
	private String city;
	//default construcutor is here
	public Person() {
		System.out.println("Person class default constructor");
		name="Amit";
		city="pune";
	}
	public Person (String name, String city){
		this.name=name;
		this.city=city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		city = city;
	}
	@Override
	public String toString() {
		return "person [name=" + name + ", city=" + city + "]";
	}
	

}
