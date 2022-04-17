package dataStructures;

import dataStructures.binaryTreeImplementation.BinaryTree;
import dataStructures.fieldImplementation.FieldStructure;
import dataStructures.linkedListImplementation.LinkedList;

public class ListImplementationTest extends ImplementationTest{
	
	@Override
	public boolean testInsert(boolean print) {
		boolean testPassed = true;
		ListImplementation[] testObjects = createTestObjects(true, true, true, 1, 0);
		
		for(ListImplementation testObject : testObjects) {
		
			if(testObject.getElements().length == 1 && testObject.getElements()[0] == null) {
				
				testObject.insert(new User());
				if(testObject.getElements().length == 1  && testObject.getElements()[0] != null) {
					
					if(print) {
						System.out.println("insert test passed.");
					}
					continue;
					
				}
				
				if(print) {
					System.out.println(testObject.getElements().length + " length");
					System.out.println(testObject.getNElements() + " nElements");
					System.out.println("insert test failed.");
				}
				
				testPassed = false;
				continue;
				
			}
			if(print) {
				System.out.println("unexpected error in insert test... Test Failed :(");
			}
			testPassed = false;
			continue;
			
		}
		return testPassed;
		
		
	}
	
	@Override
	public boolean testRemove(boolean print) {
		boolean testPassed = true;
		
		ListImplementation[] testObjects = createTestObjects(true, true, true, 5, 5);
		
		for(ListImplementation testObject : testObjects) {
			
			if(testObject.getElements().length == 5 && testObject.getElements()[4] != null) {
				
				testObject.remove();
				
				if(testObject.getElements().length == 5 && testObject.getElements()[4] == null) {
					
					if(print) {
						System.out.println("remove test passed.");
					}
					continue;
					
				}
				
				if(print) {
					System.out.println("remove test failed.");
				}
				testPassed = false;
				continue;
				
			}
			
			if(print) {
				System.out.println("unexpected error in remove test... Test Failed :(");
			}
			testPassed = false;
			continue;
			
		}
		return testPassed;
		
		
	}
	
	@Override
	public boolean testIsEmpty(boolean print) {
		boolean testPassed = true;
		
		ListImplementation[] testObjects = createTestObjects(true, true, true, 2, 0);
		
		for(ListImplementation testObject : testObjects) {
			
			if(testObject.isEmpty()) {
				
				testObject.insert(new User());
				if(!testObject.isEmpty()) {
					
					if(print) {
						System.out.println("isEmpty test passed.");
					}
					
					continue;
					
				}
				
				if(print) {
					System.out.println("isEmpty test failed.");
				}
				testPassed = false;
				continue;
			}
			
			if(print) {
				System.out.println("unexpected error in isEmptyTest... Test Failed :(");
			}
			testPassed = false;
			continue;
		}
		
		return testPassed;
	}
	
	@Override
	public boolean testInsertOrder(boolean print) {
		
		boolean testPassed = true;
		
		ListImplementation[] testObjects = createTestObjects(true, true, false, 2, 0);
		
		for(ListImplementation testObject : testObjects) {
		
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
				continue;
				
			}
			
			if(print) {
				System.out.println("insert order test failed.");		
			}
			testPassed = false;
			continue;
		}
		
		return testPassed;
		
	}
	
	@Override
	public boolean testRemoveOrder(boolean print) {
		
		boolean testPassed = true;
		
		ListImplementation[] testObjects = createTestObjects(true, true, false, 2, 1);
		
		for(ListImplementation testObject : testObjects) {

			User testData = new User();
			testObject.insert(testData);
			
			testObject.remove();
			
			DataElement[] elements = testObject.getElements();
			
			if(elements[0] == testData && elements[1] == null) {
				
				if(print) {
					System.out.println("remove order test passed.");
				}
				continue;
				
			}
			
			if(print) {
				System.out.println("remove order test failed.");
			}
			testPassed = false;
			continue;
		}
		
		return testPassed;
		
	}
	
	@Override
	public boolean testGetNElements(boolean print) {
		
		boolean testPassed = true;
		
		ListImplementation[] testObjects = createTestObjects(true, true, true, 2, 0);
		
		for(ListImplementation testObject : testObjects) {
			boolean thisTestPassed = true;
			
			User testData = new User();
			
			testPassed = (testObject.getNElements() == 0);
			
			fillTestObject(testObject, 2);
			testPassed = thisTestPassed && (testObject.getNElements() == 2);
			
			testObject.insert(testData);
			testPassed = thisTestPassed && (testObject.getNElements() == 2);
			
			testObject.remove();
			testPassed = thisTestPassed && (testObject.getNElements() == 1);
			
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
		
		return testPassed;
		
	}
	
	@Override
	public void testPrintAll() {
		
		ListImplementation[] testObjects = createTestObjects(true, true, true, 5, 5);
		
		for(ListImplementation testObject : testObjects) {
			testObject.printAll();
		}
		
		
		
	}
	
	private ListImplementation[] createTestObjects(boolean field, boolean linkedList, boolean binaryTree, int listSize, int nTestElements) {
		
		ListImplementation[] testObjects = null;
		
		if(field && linkedList && binaryTree) {
			testObjects = new ListImplementation[3];
			testObjects[0] = createTestLinkedListObject(listSize, nTestElements);
			testObjects[1] = createFieldTestObject(listSize, nTestElements);
			testObjects[2] = createBinaryTreeObject(listSize, nTestElements);
		}else if(field && linkedList ^ field && binaryTree ^ linkedList && binaryTree) {
			testObjects = new ListImplementation[2];
			if(linkedList) testObjects[0] = createTestLinkedListObject(listSize, nTestElements);
			if(linkedList && field) testObjects[1] = createFieldTestObject(listSize, nTestElements);
			if(!linkedList && field) testObjects[0] = createFieldTestObject(listSize, nTestElements);
			if(binaryTree) createBinaryTreeObject(listSize, nTestElements);
		}else if(field ^ linkedList ^ binaryTree) {
			testObjects = new ListImplementation[1];
			if(field) testObjects[0] = createFieldTestObject(listSize, nTestElements);
			else if(linkedList) testObjects[0] = createTestLinkedListObject(listSize, nTestElements);
			else if(binaryTree) testObjects[0] = createBinaryTreeObject(listSize, nTestElements);
		}else {
			testObjects = new ListImplementation[0];
		}
	
		
		return testObjects;
		
	}
	
	private FieldStructure createFieldTestObject(int listSize, int nTestElements) {
		
		FieldStructure testObject = new FieldStructure(listSize);
		fillTestObject(testObject, nTestElements);
		
		return testObject;
		
	}
	
	private void fillTestObject(ListImplementation testObject, int nTestElements) {
		
		DataElement[] testElements =  createTestData(nTestElements);
		
		for(DataElement testElement: testElements) {
			
			testObject.insert(testElement);
			
		}
		
	}
	
	private User[] createTestData(int nTestElements) {
		
		User[] testElements = new User[nTestElements];
		
		for(int i = 0; i < nTestElements; i++) {
			
			testElements[i] = new User(i, i * 2, "Mark Zuck");
			
		}
		
		return testElements;
		
	}
	
	private LinkedList createTestLinkedListObject(int listSize, int nTestElements) {
		
		LinkedList testObject = new LinkedList(listSize);
		
		if(nTestElements > 0) {
			fillTestObject(testObject, nTestElements);
		}
		
		return testObject;
		
	}
	
	private BinaryTree createBinaryTreeObject(int listSize, int nTestElements) {
		
		BinaryTree testObject = new BinaryTree(listSize);
		
		if(nTestElements > 0) {
			fillTestObject(testObject, nTestElements);
		}
		
		return testObject;
		
	}
	
}
