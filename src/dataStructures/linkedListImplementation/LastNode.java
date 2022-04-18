package dataStructures.linkedListImplementation;

import dataStructures.DataElement;

public class LastNode extends ListElement{

	@Override
	public Node add(DataElement dataElement) {
		
		Node newElement = new Node(dataElement);
		newElement.setSuccessor(this);
		return newElement;
		
	}

	@Override
	public void recursivePrint() {
		
		System.out.println("End of list reached!");
		
	}

	@Override
	public int getNSuccessors() {
		return -1;
	}

	@Override
	public int setElementsArray(DataElement[] elements, int nElements) {
		return -1;
	}

}
