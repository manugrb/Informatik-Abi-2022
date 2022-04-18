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
			
			
			
		}
		
	}
	
	public int getConnection(Node start, Node end) {
		
		return 0;
	}
	
	public void printAll() {
		
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
