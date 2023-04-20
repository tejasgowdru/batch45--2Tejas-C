package dayten;

public class Hello_App {
	//sauabh
	void m1(){
		System.out.println("No exception in this method");
	}
	//abhishek
	void m2() throws IoException{//import madu ioexception na
		System.out.println("Device Error");
	}
	//nahvesh
	void m3() throws ArithmeticException{
		System.out.println("Arithmatic exception may be happen");
		int a=50/0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
