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

	
}
