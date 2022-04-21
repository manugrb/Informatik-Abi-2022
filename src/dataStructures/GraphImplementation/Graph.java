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
	
	public boolean removeNode(Node node) {
		
		int index = getNodeId(node);
		if(isValidIndex(index)) {
			
			nodes[index] = null;
			clearNodeInMatrix(index);
			
		}
		
		return false;
	}
	
	private void clearNodeInMatrix(int index) {
		if(isValidIndex(index)) {
			for(int i = 0; i < nNodes; i++) {
				adjacencyMatrix[index][i] = -1;
				adjacencyMatrix[i][index] = -1;
			}
			//can't change nNodes because nNodes is more like the nodes max value...
			//No need to set the value of adjacencyMatrix[index][index] to 0, because this node does not exist and thus does not have a direct way to itself.
		}
	}
	
	public Node getNode(int index) {
		
		if(isIndexInUse(index)) {
			return nodes[index];
		}
		return null;
		
	}
	
	public void printAllFromNode(Node start) {
		
		int nodeId = getNodeId(start);
		
		if(nodeId != -1) {
			resetNodesVisited();
			
			recursivePrintAll(nodeId);
		}
		
	}
	
	public int getNNodes() {
		return nNodes;
	}
	
	private void recursivePrintAll(int id) {
		
		nodes[id].setVisited(true);
		nodes[id].print();
		
		for(int i = 0; i < nNodes; i++) {
			if(adjacencyMatrix[id][i] != -1) {
				if(!nodes[i].getVisited()) {
					recursivePrintAll(i);
				}
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
