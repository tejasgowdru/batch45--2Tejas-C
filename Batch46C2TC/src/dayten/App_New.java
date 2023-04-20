package dayten;

public class App_New {
	void validate (int age)
	{
		if(age <18){
			throw new ArithmeticException("they are not eligible");
		}
		else{
			System.out.println("they are eligible");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App_New obj= new App_New();
		obj.validate(4);

	}

}
