package dataStructures.GraphImplementation;

import java.util.Random;

public class GraphImplementationTest {
	
	public boolean testGetConnection() {
		
		//just some random values...
		int firstNodeIndex = 2;
		int lastNodeIndex = 7;
		int connectionValue = 69;
		
		Graph testObject = createTestObject(8);
		Node firstNode = testObject.getNode(firstNodeIndex);
		Node lastNode = testObject.getNode(lastNodeIndex);
		
		testObject.addConnection(firstNode, lastNode, connectionValue);
		testObject.addConnection(lastNode, firstNode, 0);
		
		boolean testPassed = (testObject.getConnection(firstNode, lastNode) == connectionValue);
		if(testPassed) {
			System.out.println("get Connection test passed!");
		}
		
		return testPassed;
		
	}
	
	public boolean testRemove() {
		
		int firstNodeIndex = 1;
		int lastNodeIndex = 5;
		int connectionValue = 420;
		
		Graph testObject = createTestObject(7);
		Node firstNode = testObject.getNode(firstNodeIndex);
		Node lastNode = testObject.getNode(lastNodeIndex);
		
		testObject.addConnection(firstNode, lastNode, connectionValue);
		
		boolean testPassed = (testObject.getConnection(firstNode, lastNode) == connectionValue);
		if(testPassed) {
			testObject.removeNode(lastNode);
			testPassed = (testObject.getNode(lastNodeIndex) == null);
			testPassed = testPassed && (testObject.getConnection(firstNode, lastNode) < 0);
			if(testPassed) {
				System.out.println("remove test passed!");
			}
			return testPassed;
		}
		
		return false;
	}
	
	public void testPrintAll() {
		
		Graph testObject = createTestObject(10);
		makeRandomConnections(testObject);
		
		System.out.println("\n");
		testObject.printAllFromNode(testObject.getNode(0));
		System.out.println("\n2nd iteration");
		testObject.printAllFromNode(testObject.getNode(9));
		
	}
	
	private Graph createTestObject(int nNodes) {
		
		Graph testObject = new Graph(nNodes);
		
		City[] testData = createTestData(nNodes);
		for(int i = 0; i < nNodes; i++) {
			testObject.addNode(testData[i]);
		}
		
		return testObject;
		
	}
	
	private City[] createTestData(int nObjects) {
		
		City[] testData = new City[nObjects];
		
		for(int i = 0; i < nObjects; i++) {
			
			City testObject = new City("Bikini Bottom", i, nObjects - i, i % 5);
			testData[i] = testObject;
			
		}
		
		return testData;
		
	}
	
	private void makeRandomConnections(Graph graph) {
		
		int nNodes = graph.getNNodes();
		Random rand = new Random();
		
		for(int i = 0; i < nNodes * 3; i++) {
			
			int firstRandom = rand.nextInt(nNodes);
			int secondRandom = rand.nextInt(nNodes);
			int connectionValue = rand.nextInt(100);
			
			graph.addConnection(graph.getNode(firstRandom), graph.getNode(secondRandom), connectionValue);
			
		}
		
	}

}
