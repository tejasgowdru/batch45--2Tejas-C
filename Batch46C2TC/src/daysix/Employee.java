package daysix;

public class Employee extends Person{
	private int empid;
	private float salary;
	private String dept;
	
	
	public Employee(){
		System.out.println("Employee Class Default Constructor");
	}
	
	public Employee(int emId, float salary, String dept){
		this.empid=empId;
		this.salary=salary;
	    this.dept=dept;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String toString(){
		return "Employee [ empId=" + empId + ", salary=" + salary + " , dept="+ dept + ", getName()=" + getName()+ ", getCity()="+ getCity()+"]";
	}
	

}
