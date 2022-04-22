package dataStructures;

import dataStructures.GraphImplementation.GraphImplementationTest;

public class Main {

	public static void main(String[] args) {
		
		ListImplementationTest tester = new ListImplementationTest();
		
		boolean allTestsPassed = true;
		
		allTestsPassed = allTestsPassed && tester.testInsert(true);
		allTestsPassed = allTestsPassed && tester.testRemove(true);
		allTestsPassed = allTestsPassed && tester.testIsEmpty(true);
		allTestsPassed = allTestsPassed && tester.testInsertOrder(true);
		allTestsPassed = allTestsPassed && tester.testRemoveOrder(true);
		allTestsPassed = allTestsPassed && tester.testGetNElements(true);
		allTestsPassed = allTestsPassed && tester.testRemoveNode(true);
		
		if(allTestsPassed) {
			System.out.println("All tests passed!");
		}
		
		tester.testPrintAll();
		
		System.out.println("----------Graph test:-----------");
		GraphImplementationTest graphTester = new GraphImplementationTest();
		allTestsPassed = true;
		
		
		allTestsPassed = allTestsPassed && graphTester.testGetConnection();
		allTestsPassed = allTestsPassed && graphTester.testRemove();
		
		if(allTestsPassed) {
			System.out.println("All tests passed!");
		}
		
		graphTester.testPrintAll();

	}

}
