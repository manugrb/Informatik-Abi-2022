package dataStructures.binaryTreeImplementation;

import dataStructures.DataElement;

public abstract class TreeElement {

	public abstract void add(DataElement dataElement);
	public abstract void printPreOrder();
	public abstract void printInOrder();
	public abstract void printPostOrder();
	public abstract int count();
	public abstract int setElementsArrayInOrder(DataElement[] elements, int nElements);

	
}
