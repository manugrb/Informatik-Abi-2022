package dataStructures.linkedListImplementation;

import dataStructures.DataElement;

public class Node extends ListElement{

	private DataElement data;
	private ListElement successor;
	
	public Node(DataElement data) {
		
		this.data = data;
		this.successor = null;
		
	}
	
	public void setSuccessor(ListElement successor) {
		this.successor = successor;
	}
	
	@Override
	public void add(DataElement dataElement, Node precessor) {
		
		successor.add(dataElement, this);

	}
	
	@Override
	public void recursivePrint() {
		
		data.print();
		successor.recursivePrint();
		
	}
	
	@Override
	public int getNSuccessors() {
		
		if(successor == null) {
			return 0;
		}
		return successor.getNSuccessors() + 1;
		
	}
	
	@Override
	public int setElementsArray(DataElement[] elements, int nElements) {
				
		int backwardsIndex = 0;
		if(successor != null) {
			backwardsIndex = successor.setElementsArray(elements, nElements) + 1;
		}
		int elementsMaxIndex = nElements - 1;
		int index = elementsMaxIndex - backwardsIndex;
		
		System.out.println(elementsMaxIndex + "max");
		System.out.println(backwardsIndex + "back");
		
		System.out.println(backwardsIndex + " backwards Index");
		elements[index] = data;
		return backwardsIndex;
		
	}
	
	public ListElement getSuccessor() {
		return successor;
	}
	
	public DataElement getData() {
		return data;
	}

	
}
