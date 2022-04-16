package dataStructures.binaryTreeImplementation;

import dataStructures.DataElement;
import dataStructures.ListImplementation;

public class BinaryTree extends ListImplementation{
	
	TreeElement firstElement;

	//for testing
	int arraySize;
	
	public BinaryTree(int arraySize) {
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
		
		if(!(firstElement instanceof LastNode)) {
			
			DataElement elementToRemove = ((Node) firstElement).getData();
			Node temp = ((Node) firstElement).remove(elementToRemove);
			firstElement = (temp != null) ? temp : firstElement;
			
		}
		
		
		return null;
	}

	@Override
	public void printAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getNElements() {
		int nElements = firstElement.count();
		return nElements;
	}

	@Override
	public DataElement[] getElements() {
		DataElement[] elements = new DataElement[arraySize];
		firstElement.setElementsArrayInOrder(elements, arraySize, -1);
		
		return elements;
	}
	
	
}
