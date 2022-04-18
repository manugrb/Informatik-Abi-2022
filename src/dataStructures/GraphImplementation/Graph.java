package dataStructures.GraphImplementation;

public class Graph {
	
	private int[][] adjacencyMatrix;
	Node[] nodes;
	
	public Graph(int maxNNodes) {
		nodes = new Node[maxNNodes];
		adjacencyMatrix = new int[maxNNodes][maxNNodes];
	}
	
	public void addConnection(Node start, Node end, int value) {
		
	}
	
	public int getConnection(Node start, Node end) {
		
		return 0;
	}
	
	public void printAll() {
		
	}
	
	private boolean ckeckIfInGraph(Node checkNode) {
		
		return false;
	}

}
