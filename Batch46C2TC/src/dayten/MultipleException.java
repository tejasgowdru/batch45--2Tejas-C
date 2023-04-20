package dayten;

public class MultipleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int brr[] = new int[4];
		
		try {
			brr[9]=50/0;//it has both arithmatic error and out of index error
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e ){//name gotila andre ange simple ago kodu exceptions anta 
			e.printStackTrace();
		}
		System.out.println("i am the last line");

	}
//use this for when their is two errors
}
