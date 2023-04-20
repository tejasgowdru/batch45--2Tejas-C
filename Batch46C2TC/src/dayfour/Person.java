package dayfour;

public class Person {
	private String name;
	private int income;
	private String gender;
	private int age;
	private int tax;
	
	public int getTax()
	{
		return tax;
	}
	public void setTax(int tax)
	{
		this.tax = tax;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int  getincome()
	{
		return income;
	}
	public void setincome(int income){
		this.income= income;
	}
	public String getGender()
	{
		return gender;
	}
	public void setgender( String gender){
		this.gender= gender;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
	public String toString(){
		return "person [name=" + name + ",income=" + income + ", gender=" + gender +",age=" + age + ", tax=" + tax "]";
	}

}
