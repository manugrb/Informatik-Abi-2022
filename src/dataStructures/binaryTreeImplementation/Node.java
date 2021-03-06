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
	public Node add(DataElement dataElement) {
		
		if(dataElement.compare(data) < 0) {
			biggerSuccessor = biggerSuccessor.add(dataElement);
		}
		else {
			smallerSuccessor = smallerSuccessor.add(dataElement);
		}
		
		return this;
		
	}
	
	@Override
	public Node addNode(Node node) {
		
		boolean bigger = (node.getData().compare(data) < 0);
		if(bigger) {
			biggerSuccessor = biggerSuccessor.addNode(node);
		}else {
			smallerSuccessor = smallerSuccessor.addNode(node);
		}
		
		return this;
	}
	
	@Override
	public TreeElement remove(DataElement dataElement) {
		
		if(this.data == dataElement) {
			
			
			if(biggerSuccessor instanceof Node) {
				smallerSuccessor = smallerSuccessor.addNode((Node) biggerSuccessor);
			}
			if(smallerSuccessor instanceof Node) {
				return (Node) smallerSuccessor;
			}else {
				return new LastNode();
			}
				
		}else {
		
			TreeElement replacement = smallerSuccessor.remove(dataElement);
			if(replacement != null) {
				smallerSuccessor = replacement;
			}else {
				
				replacement = biggerSuccessor.remove(dataElement);
				if(replacement!= null) {
					biggerSuccessor = replacement;
				}
				
			}
			
			return null;
			
		}
	}

	@Override
	public void printPreOrder() {
		
		this.data.print();
		smallerSuccessor.printPreOrder();
		biggerSuccessor.printPreOrder();
		
	}

	@Override
	public void printInOrder() {
		
		smallerSuccessor.printInOrder();
		this.data.print();
		biggerSuccessor.printInOrder();
		
	}

	@Override
	public void printPostOrder() {
		
		smallerSuccessor.printPostOrder();
		biggerSuccessor.printPostOrder();
		this.data.print();
		
	}

	@Override
	public int count() {
		int smallerSuccessors = smallerSuccessor.count();
		int biggerSuccessors = biggerSuccessor.count();
		int total = smallerSuccessors + biggerSuccessors;
		return (total + 1);
	}

	@Override
	public int setElementsArrayInOrder(DataElement[] elements, int nElements, int currentIndex) {
		int index = smallerSuccessor.setElementsArrayInOrder(elements, nElements, currentIndex) + 1;
		elements[index] = this.data;
		int continueWithIndex = biggerSuccessor.setElementsArrayInOrder(elements, nElements, index);	
		return continueWithIndex;
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
	
	public DataElement getData() {
		return data;
	}

}
