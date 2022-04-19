package dataStructures.GraphImplementation;

public class Graph {
	
	private int[][] adjacencyMatrix;
	Node[] nodes;
	int maxNNodes;
	int nNodes;
	
	public Graph(int maxNNodes) {
		nodes = new Node[maxNNodes];
		adjacencyMatrix = new int[maxNNodes][maxNNodes];
		this.maxNNodes = maxNNodes;
		nNodes = 0;
		
		prepareGraph();
	}
	
	private void prepareGraph() {
		
		for(int i = 0; i < maxNNodes; i++) {
			
			for(int j = 0; j < maxNNodes; j++) {
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
		
		int startIndex = getNodeId(start);
		int endIndex = getNodeId(end);
		
		if(isIndexInUse(startIndex) && isIndexInUse(endIndex)) {
			return adjacencyMatrix[startIndex][endIndex];
		}
		
		return -2;
	}
	
	public boolean addNode(City newNodeData) {
		
		if(isValidIndex(nNodes)) {
			nodes[nNodes] = new Node(newNodeData);
			nNodes++;
			return true;
		}
		
		return false;
		
	}
	
	public Node getNode(int index) {
		
		if(isIndexInUse(index)) {
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
		
		for(int i = 0; i < nNodes; i++) {
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
	
	private boolean isValidIndex(int index) {
		return (index >= 0 && index < maxNNodes);
	}
	
	private boolean isIndexInUse(int index) {
		return (index >= 0 && index < nNodes);
	}
	
	private int getNodeId(Node node) {
		for(int i = 0; i < nNodes; i++) {
			
			if(nodes[i] == node){
				return i;
			}
			
		}
		
		return -1;
	}

}
