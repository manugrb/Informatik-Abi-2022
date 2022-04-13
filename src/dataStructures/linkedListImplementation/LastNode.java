package dataStructures.linkedListImplementation;

import dataStructures.DataElement;
import dataStructures.User;

public class LastNode extends ListElement{

	@Override
	public void add(DataElement dataElement, Node precessor) {
		
		Node newElement = new Node(dataElement);
		newElement.setSuccessor(this);
		precessor.setSuccessor(newElement);
		
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
