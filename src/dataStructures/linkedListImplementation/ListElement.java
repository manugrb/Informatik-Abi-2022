package dataStructures.linkedListImplementation;

import dataStructures.DataElement;

public abstract class ListElement {
	
	public abstract void add(DataElement dataElement, Node precessor);
	public abstract void recursivePrint();
	public abstract int getNSuccessors();
	public abstract int setElementsArray(DataElement[] elements, int nElements);
	
	
}
