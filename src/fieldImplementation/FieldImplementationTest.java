package fieldImplementation;

public class FieldImplementationTest {
	
	public boolean testAdd(boolean print) {
		
		FieldStructure testObject = new FieldStructure(1);
		
		if(testObject.getElements().length == 0) {
			
			testObject.insert(new User());
			
			if(testObject.getElements().length == 1) {
				
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
		
		if(testObject.getElements().length == 1) {
			
			testObject.remove();
			
			if(testObject.getElements().length == 0) {
				
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

}
