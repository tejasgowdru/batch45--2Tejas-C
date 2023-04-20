package dayfive;

public class Executor {

	public static void main(String[] args) {
		// accesing same package class.// TODO Auto-generated method stub
		Base b1 = new Base();  ///for object
		b1.methodDefault();
		b1.methodProtected();
		b1.methodPublic();
		
		
		b1.varDefault=11;
		b1.methodDefault();
		
		//private members acessing
	//	b1.varPrivate=21;
		//private method cant be accessable and imteger also //b1.methodPrivate();
		b1.varProtected=31;
		b1.methodProtected();
		
		b1.varPublic=41;
		b1.methodPublic();
		
		//intance operator
		System.out.println(b1 instanceof Base);//true(booelan)
		

	}

}
