package formalLanguage;

public class Main {
	
	public static void main(String[] args) {
		
		LicensePlateFiniteMachinetest test = new LicensePlateFiniteMachinetest();
		boolean allTestsPassed = true;
		
		allTestsPassed = allTestsPassed && test.testCorrectLicensePlate();
		
		if(allTestsPassed) {
			System.out.println("all tests passed");
		}
		
	}

}
