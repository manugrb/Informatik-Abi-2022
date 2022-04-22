package dataStructures.linkedListImplementation;

import dataStructures.DataElement;

public abstract class ListElement {
	
	public abstract Node add(DataElement dataElement);
	public abstract void recursivePrint();
	public abstract int getNSuccessors();
	public abstract int setElementsArray(DataElement[] elements, int nElements);
	public abstract ListElement removeNode(DataElement dataElement);
	
	
}
