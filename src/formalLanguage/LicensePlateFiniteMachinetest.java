package formalLanguage;

public class LicensePlateFiniteMachinetest {
	
	private LicensePlateFiniteMachine testObject;
	
	public LicensePlateFiniteMachinetest() {
		
		testObject = new LicensePlateFiniteMachine();
		
	}
	
	public boolean testCorrectLicensePlate() {
		
		boolean testPassed = true;
		
		testPassed = testPassed && testObject.checkString("AAA AA 0000");
		testPassed = testPassed && testObject.checkString("ZZZ ZZ 9999");
		testPassed = testPassed && testObject.checkString("A AA 1111");
		testPassed = testPassed && testObject.checkString("AA AA 1111");
		testPassed = testPassed && testObject.checkString("AAA A 1111");
		testPassed = testPassed && testObject.checkString("AAA AA 1");
		testPassed = testPassed && testObject.checkString("AAA AA 11");
		testPassed = testPassed && testObject.checkString("AAA AA 111");
		
		return testPassed;
		
		
	}

}
