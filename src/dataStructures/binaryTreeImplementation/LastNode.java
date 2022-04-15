package dataStructures.binaryTreeImplementation;

import dataStructures.DataElement;

public class LastNode extends TreeElement{

	@Override
	public void add(DataElement dataElement, Node precessor, boolean smaller) {
		
		Node newNode = new Node(dataElement);
		if(smaller) {	
			precessor.setSmallerSuccessor(newNode);
		}else {
			precessor.setBiggerSuccessor(newNode);
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

}
