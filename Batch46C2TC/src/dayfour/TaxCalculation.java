package dayfour;

public class TaxCalculation {
	//function to calculating tax
	public void calculate tax(Person person){
		if (person.getAge() > 65 || person.getGender().equalsIgnoreCase("female")){
			System.out.println("Tax not applicable");
		}
		else {
			if(person.getincome()<160000){
				person.setTax(0);
			}
		}
	}

}
