package dataStructures.binaryTreeImplementation;

import dataStructures.DataElement;

public abstract class TreeElement {

	public abstract Node add(DataElement dataElement);
	public abstract Node remove(DataElement dataElement);
	public abstract void printPreOrder();
	public abstract void printInOrder();
	public abstract void printPostOrder();
	public abstract int count();
	public abstract int setElementsArrayInOrder(DataElement[] elements, int nElements, int currentIndex);

	
}
