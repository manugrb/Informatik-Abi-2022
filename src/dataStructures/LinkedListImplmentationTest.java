package dataStructures;

import dataStructures.linkedListImplementation.LinkedList;

public class LinkedListImplmentationTest extends ImplementationTest{

	@Override
	boolean testInsert(boolean print) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	boolean testRemove(boolean print) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	boolean testIsEmpty(boolean print) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	boolean testInsertOrder(boolean print) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	boolean testRemoveOrder(boolean print) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	boolean testGetNElements(boolean print) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	void testPrintAll() {
		// TODO Auto-generated method stub
		
	}
	
	private LinkedList createTestObject(int nTestElements) {
		
		LinkedList testObject = new LinkedList();
		
		
		return testObject;
		
	}
	
	private void addTestDataElements(LinkedList testObject, int nTestElements) {
		
		for(int i = 0; i < nTestElements; i++) {
			testObject.insert(new User());
		}
		
	}
	

}
