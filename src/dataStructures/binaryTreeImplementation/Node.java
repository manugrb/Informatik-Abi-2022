package dataStructures.binaryTreeImplementation;

import dataStructures.DataElement;

public class Node extends TreeElement{
	
	private DataElement data;
	private TreeElement smallerSuccessor;
	private TreeElement biggerSuccessor;
	
	public Node(DataElement data) {
		this.data = data;
		this.smallerSuccessor = null;
		this.biggerSuccessor = null;
	}

	@Override
	public void add(DataElement dataElement, Node precessor, boolean smaller) {
		
		if(dataElement.compare(data) > 0) {
			biggerSuccessor.add(dataElement, precessor, false);
		}
		else {
			smallerSuccessor.add(dataElement, precessor, true);
		}
		
	}

	@Override
	public void printPreOrder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printInOrder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printPostOrder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setElementsArrayInOrder(DataElement[] elements, int nElements) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//this method is used to seal the element by adding an instance of lastNode on each free successor attribute.
	public void seal() {
		
		sealSmaller();
		sealBigger();
		
	}
	
	public void sealSmaller() {
		this.smallerSuccessor = new LastNode();
	}
	
	public void sealBigger() {
		this.biggerSuccessor = new LastNode();
	}
	
	public void setSmallerSuccessor(Node newSucessor) {
		this.smallerSuccessor = newSucessor;
	}
	
	public void setBiggerSuccessor(Node newSucessor) {
		this.biggerSuccessor = newSucessor;
	}

}
