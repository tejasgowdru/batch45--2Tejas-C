package dayfive;

public class Base {
	//Declaring default, public, pvt and proteced types;
	int varDefault=10;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	//Declaring method for default, public, pvt , protected;
	void methodDefault(){
		System.out.println("Default access Base class");
		System.out.println("Default Variable : "+varDefault);
	}
	public void methodPublic() {
		System.out.println("Public access Base Class");
		System.out.println("Public Variable: "+ varPublic);
	}
	private void methodPrivate(){
		System.out.println("Public access Base Class");
		System.out.println("Public Variable: "+varPrivate);
		
	}
	protected void methodProtected(){
		System.out.println("Public access Base Class");
		System.out.println("Protected Variable :"+varProtected);
	}

	
}
