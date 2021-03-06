package dataStructures.linkedListImplementation;

import dataStructures.DataElement;
import dataStructures.ListImplementation;

public class LinkedList extends ListImplementation{
	
	ListElement firstElement;
	
	//for testing:
	int arraySize;
	
	public LinkedList() {
		
		firstElement = new LastNode();
		arraySize = 0;
		
	}
	
	public LinkedList(int arraySize) {
		
		this.firstElement = new LastNode();
		this.arraySize = arraySize;
		
	}

	@Override
	public void insert(DataElement newElement) {
		
		if(getNElements() < arraySize) {
			firstElement = firstElement.add(newElement);
		}
		
	}

	@Override
	public DataElement remove() {
		
		if(firstElement instanceof Node) {
			
			Node firstNode = (Node) firstElement;
			DataElement returnElement = firstNode.getData();
			
			ListElement newFirstElement = firstNode.getSuccessor();
			firstElement = newFirstElement;
			
			return returnElement;
			
		}else {
			
			System.out.println("no elements to remove...");
			return null;
			
		}
		
	}
	
	public void removeNode(DataElement data) {
		
		firstElement.removeNode(data);
		
	}

	@Override
	public void printAll() {
		
		if(firstElement != null) {
			firstElement.recursivePrint();
		}
		
	}

	@Override
	public boolean isEmpty() {
		return (firstElement instanceof LastNode);
	}

	@Override
	public int getNElements() {
		if(firstElement != null) {
			return firstElement.getNSuccessors() + 1;
		}
		return 0;
	}

	@Override
	public DataElement[] getElements() {

		DataElement[] elements = new DataElement[arraySize];
		
		if(firstElement != null) {
			firstElement.setElementsArray(elements, getNElements());
		}
		return elements;
	}
	
	public void setArraySize(int arraySize) {
		
		this.arraySize = arraySize;
		
	}

}
