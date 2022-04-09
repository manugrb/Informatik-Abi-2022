package dataStructures.linkedListImplementation;

import dataStructures.DataElement;
import dataStructures.ListImplementation;

public class LinkedList extends ListImplementation{
	
	Node firstElement;
	
	public LinkedList() {
		
		firstElement = null;
		
	}

	@Override
	public void insert(DataElement newElement) {
		
		if(firstElement == null) {
			Node firstNode = new Node(newElement);
			firstElement = firstNode;
		}else {
			firstElement.add(newElement);
		}
		
	}

	@Override
	public DataElement remove() {
		
		DataElement returnElement = firstElement.getData();
		
		Node newFirstElement = firstElement.getSuccessor();
		firstElement = newFirstElement;
		
		return returnElement;
	}

	@Override
	public void printAll() {
		
		if(firstElement != null) {
			firstElement.recursivePrint();
		}
		
	}

	@Override
	public boolean isEmpty() {
		return firstElement == null;
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
		
		int nElements = getNElements();
		DataElement[] elements = new DataElement[nElements];
		
		firstElement.setElementsArray(elements);
		return elements;
	}

}
