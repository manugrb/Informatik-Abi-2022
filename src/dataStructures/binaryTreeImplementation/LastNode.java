package dataStructures.binaryTreeImplementation;

import dataStructures.DataElement;

public class LastNode extends TreeElement{

	@Override
	public Node add(DataElement dataElement) {
		
		Node newNode = new Node(dataElement);
		newNode.seal();
		return newNode;
		
	}
	
	@Override
	public Node addNode(Node node) {
		return node;
	}
	
	@Override
	public TreeElement remove(DataElement dataElement) {
		return this;
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
		return 0;
	}

	@Override
	public int setElementsArrayInOrder(DataElement[] elements, int nElements, int currentIndex) {
		return currentIndex;
	}

}
