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
	
	public int setElementsArray(DataElement[] elements) {
				
		int backwardsIndex = 0;
		if(successor != null) {
			backwardsIndex = successor.setElementsArray(elements) + 1;
		}
		int elementsMaxIndex = elements.length - 1;
		int index = elementsMaxIndex - backwardsIndex;
		
		System.out.println(elementsMaxIndex + "max");
		System.out.println(backwardsIndex + "back");
		
		elements[index] = data;
		return backwardsIndex;
		
	}
	
	public Node getSuccessor() {
		return successor;
	}
	
	public DataElement getData() {
		return data;
	}

	
}
