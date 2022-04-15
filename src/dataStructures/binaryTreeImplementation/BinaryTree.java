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
		// TODO Auto-generated method stub
		
	}

	@Override
	public DataElement remove() {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public DataElement[] getElements() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
