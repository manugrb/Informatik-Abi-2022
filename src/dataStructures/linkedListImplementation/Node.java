package dataStructures.linkedListImplementation;

import dataStructures.DataElement;

public class Node {

	private DataElement data;
	private Node successor;
	
	public Node(DataElement data) {
		
		this.data = data;
		this.successor = null;
		
	}
	
	public void setSuccessor(Node successor) {
		this.successor = successor;
	}
	
	public void add(DataElement dataElement) {
		
		if(successor == null) {
			
			Node newSuccessor = new Node(dataElement);
			setSuccessor(newSuccessor);
			
		}else {
			successor.add(dataElement);
		}

	}
	
	public void recursivePrint() {
		
		data.print();
		successor.recursivePrint();
		
	}
	
	public int getNSuccessors() {
		
		if(successor == null) {
			return 0;
		}
		return successor.getNSuccessors() + 1;
		
	}
	
	public Node getSuccessor() {
		return successor;
	}
	
	public DataElement getData() {
		return data;
	}

	
}
