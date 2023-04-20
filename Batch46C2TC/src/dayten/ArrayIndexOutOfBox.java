package dayten;

public class ArrayIndexOutOfBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = new int [4];
		
		System.out.println("welcone to B45 batch");//it give both results
		
		try {	
		int i=arr[6];///lessthen 4 kotre error barolla
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{//it doesnot matter errors comes or not fnaly will print
			System.out.println("whatever happens this line will be executed");
		};
		System.out.println("next line shouuld be execute");

	}

}
