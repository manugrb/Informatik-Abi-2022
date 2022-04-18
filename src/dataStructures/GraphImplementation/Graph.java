package dataStructures.GraphImplementation;

public class Graph {
	
	private int[][] adjacencyMatrix;
	Node[] nodes;
	
	public Graph(int maxNNodes) {
		nodes = new Node[maxNNodes];
		adjacencyMatrix = new int[maxNNodes][maxNNodes];
	}
	
	public void addConnection(Node start, Node end, int value) {
		
		int startId = getNodeId(start);
		int endId = getNodeId(end);
		boolean inputValid = (startId != -1) && (endId != -1);
		if(inputValid) {
			adjacencyMatrix[startId][endId] = value;
		}
		
	}
	
	public int getConnection(Node start, Node end) {
		
		return 0;
	}
	
	public void printAllFromNode(Node start) {
		
		int nodeId = getNodeId(start);
		
		int iterationNode = nodeId;
		for(int i = 0; i < adjacencyMatrix[nodeId].length; i++) {
			
			if(adjacencyMatrix[nodeId][i] > 0) {
				nodes[i].setVisited(true);
				iterationNode = i;
			}
			
		}
		
	}
	
	private int getNodeId(Node node) {
		for(int i = 0; i < nodes.length; i++) {
			
			if(nodes[i] == node){
				return i;
			}
			
		}
		
		return -1;
	}

}
