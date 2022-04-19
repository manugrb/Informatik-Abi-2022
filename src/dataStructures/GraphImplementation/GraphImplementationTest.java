package dataStructures.GraphImplementation;

public class GraphImplementationTest {
	
	public boolean checkGetConnection() {
		
		//just some random values...
		int firstNodeIndex = 2;
		int lastNodeIndex = 7;
		int connectionValue = 69;
		
		Graph testObject = createTestObject(8);
		Node firstNode = testObject.getNode(firstNodeIndex);
		Node lastNode = testObject.getNode(lastNodeIndex);
		
		testObject.addConnection(firstNode, lastNode, connectionValue);
		testObject.addConnection(lastNode, firstNode, 0);
		
		return (testObject.getConnection(firstNode, lastNode) == connectionValue);
		
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
			
			City testObject = new City("Bikini Bottom", i, nObjects - i, (int) (i / nObjects));
			testData[i] = testObject;
			
		}
		
		return testData;
		
	}

}
