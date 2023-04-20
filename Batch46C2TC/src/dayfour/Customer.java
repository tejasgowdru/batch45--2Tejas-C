package dayfour;

public class Customer {
	private String customerName;
	private int customerId;
	private String customerCity;
	

//default constructor
public Customer(){
	System.out.println("Default Constructor");
}
//Parameterised constructor
public Customer(String customerName,int customerId,String customerCity){
	this();
	System.out.println("parameterized Constructor");
	this.customerName= customerName;
	this.customerId= customerCity;
	this.customerCity = customerCity;
			
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getCustomerCity() {
	return customerCity;
}
public void setCustomerCity(String customerCity) {
	this.customerCity = customerCity;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public String toString(){
	return "Customer [customer=" + customerName + ",customerId"
}


