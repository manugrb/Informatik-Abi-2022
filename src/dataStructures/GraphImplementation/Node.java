package dataStructures.GraphImplementation;

public class Node {
	
	private boolean visited;
	private DataElement data;
	
	public Node(DataElement data) {
		this.visited = false;
		this.data = data;
	}
	
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	
	public boolean getVisited() {
		return visited;
	}
	
	public DataElement getData() {
		return data;
	}
	
	public void print() {
		data.print();
	}

}
