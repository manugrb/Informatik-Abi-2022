package dataStructures;

public abstract class ListImplementation {
	
	public abstract void insert(DataElement newElement);	
	public abstract DataElement remove();	
	public abstract void printAll();
	public abstract boolean isEmpty();	
	public abstract int getNElements();
	public abstract DataElement[] getElements();

}
