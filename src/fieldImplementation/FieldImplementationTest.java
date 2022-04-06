package fieldImplementation;

public class FieldImplementationTest {
	
	public boolean testInsert(boolean print) {
		
		FieldStructure testObject = new FieldStructure(1);
		
		if(testObject.getElements().length == 1 && testObject.getElements()[0] == null) {
			
			testObject.insert(new User());
			
			if(testObject.getElements().length == 1  && testObject.getElements()[0] != null) {
				
				if(print) {
					System.out.println("insert test passed.");
				}
				
				return true;
				
			}
			
			if(print) {
				System.out.println("insert test failed.");
			}
			
			return false;
			
		}
		if(print) {
			System.out.println("unexpected error in insert test... Test Failed :(");
		}
		return false;
		
		
	}
	
	public boolean testRemove(boolean print) {
		
		FieldStructure testObject = new FieldStructure(1);
		testObject.insert(new User());
		
		if(testObject.getElements().length == 1 && testObject.getElements()[0] != null) {
			
			testObject.remove();
			
			if(testObject.getElements().length == 1 && testObject.getElements()[0] == null) {
				
				if(print) {
					System.out.println("remove test passed.");
				}
				
				return true;
				
			}
			
			if(print) {
				System.out.println("remove test failed.");
			}
			
			return false;
			
		}
		
		if(print) {
			System.out.println("unexpected error in remove test... Test Failed :(");
		}
		return false;
		
	}
	
	public boolean testIsEmpty(boolean print) {
		
		FieldStructure testObject = new FieldStructure(1);
		
		if(testObject.isEmpty()) {
			
			testObject.insert(new User());
			if(!testObject.isEmpty()) {
				
				if(print) {
					System.out.println("isEmpty test passed.");
				}
				
				return true;
				
			}
			
			if(print) {
				System.out.println("test failed.");
			}
			
			return false;
		}
		
		if(print) {
			System.out.println("unexpected error in isEmptyTest... Test Failed :(");
		}
		
		return false;
	}
	
	public boolean testInsertOrder(boolean print) {
		
		FieldStructure testObject = new FieldStructure(2);
		
		User testData1 = new User();
		User testData2 = new User();
		
		testObject.insert(testData1);
		testObject.insert(testData2);
		
		testObject.insert(testData2);
		
		DataElement[] elements = testObject.getElements();
		
		if(elements[0] == testData1 && elements[1] == testData2) {
			
			if(print) {
				System.out.println("insert order test passed.");	
			}
			return true;
			
		}
		
		if(print) {
			System.out.println("insert order test failed.");		
		}
		return false;
		
	}
	
	public boolean testRemoveOrder(boolean print) {
		
		FieldStructure testObject = new FieldStructure(2);
		
		User testData1 = new User();
		User testData2 = new User();
		
		testObject.insert(testData1);
		testObject.insert(testData2);
		
		testObject.insert(testData2);
		
		testObject.remove();
		
		DataElement[] elements = testObject.getElements();
		
		if(elements[0] == testData2 && elements[1] == null) {
			
			if(print) {
				System.out.println("remove order test passed.");
			}
			return true;
			
		}
		
		if(print) {
			System.out.println("remove order test failed.");
		}
		return false;
		
	}
	
	public boolean testGetNElements(boolean print) {
		
		FieldStructure testObject = new FieldStructure(2);
		boolean testPassed = true;
		
		User testData1 = new User();
		User testData2 = new User();
		
		testPassed = (testObject.getNElements() == 0);
		
		testObject.insert(testData1);
		testObject.insert(testData2);
		testPassed = testPassed && (testObject.getNElements() == 2);
		
		testObject.insert(testData2);
		testPassed = testPassed && (testObject.getNElements() == 2);
		
		testObject.remove();
		testPassed = testPassed && (testObject.getNElements() == 1);
		
		if(testPassed) {
			
			if(print) {
				System.out.println("getNElements test passed.");
			}
			
			return true;
			
		}
		
		if(print) {
			System.out.println("getNElements test failed.");
		}
		
		return false;
		
	}
	
	public void testPrintAll() {
		
		FieldStructure testObject = new FieldStructure(3);
		
		User testData1 = new User();
		User testData2 = new User();
		
		testObject.insert(testData1);
		testObject.insert(testData2);
		
		testObject.printAll();
		
	}

}
