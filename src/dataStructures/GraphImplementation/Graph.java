package dataStructures.GraphImplementation;

public class Graph {
	
	private int[][] adjacencyMatrix;
	Node[] nodes;
	
	public Graph(int maxNNodes) {
		nodes = new Node[maxNNodes];
		adjacencyMatrix = new int[maxNNodes][maxNNodes];
		
		prepareGraph();
	}
	
	private void prepareGraph() {
		
		for(int i = 0; i < adjacencyMatrix.length; i++) {
			
			for(int j = 0; i < adjacencyMatrix[i].length; j++) {
				adjacencyMatrix[i][j] = -1;
			}
			
			//The effort to go nowhere at all (same city) is always 0...
			adjacencyMatrix[i][i] = 0;
			
		}
		
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
	
	public boolean addNode(City newNodeData) {
		
		for(int i = 0; i < nodes.length; i++) {
			
			if(!(nodes[i] instanceof Node)) {
				
				nodes[i] = new Node(newNodeData);
				return true;
				
			}
			
		}
		
		return false;
		
	}
	
	public Node getNode(int index) {
		
		if(index > 0 && index < nodes.length) {
			return nodes[index];
		}
		
		return null;
		
	}
	
	public void printAllFromNode(Node start) {
		
		int nodeId = getNodeId(start);
		
		if(nodeId != 0) {
			resetNodesVisited();
			
			recursivePrintAll(nodeId);
		}
		
	}
	
	private void recursivePrintAll(int id) {
		
		nodes[id].setVisited(true);
		
		for(int i = 0; i < adjacencyMatrix[id].length; i++) {
			if(adjacencyMatrix[id][i] != -1) {
				recursivePrintAll(i);
			}
		}
		
	}
	
	private void resetNodesVisited() {
		
		for(Node node : nodes) {
			node.setVisited(false);
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
