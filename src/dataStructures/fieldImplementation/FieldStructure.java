package dataStructures.fieldImplementation;

import dataStructures.DataElement;
import dataStructures.ListImplementation;

public class FieldStructure extends ListImplementation{
	
	private DataElement[] elements;
	private int bookMark;
	
	public FieldStructure(int maxAmount) {
		
		this.elements = new DataElement[maxAmount];
		this.bookMark = 0;
		
	}

	@Override
	public void insert(DataElement newElement) {
		
		if(bookMark < elements.length && bookMark != -1) {
			//enough space
			
			elements[bookMark] = newElement;
			bookMark++;
			
		}else {
			
			System.out.println("Sorry, the List is full! Unable to add new element!");
			
		}
		
	}
	
	@Override
	public DataElement remove() {
		
		DataElement returnElement = elements[0];
		
		for(int i = 0; i < bookMark - 1; i++) {
			
			elements[i] = elements[i + 1];
			
		}
		
		if(bookMark != -1) {
			
			elements[bookMark - 1] = null;
			
		}
		
		bookMark--;
		return returnElement;
		
	}
	
	@Override
	public void printAll() {
		
		for(int i = 0; i < bookMark; i++) {
			
			elements[i].print();
			
		}
		
	}
	
	@Override
	public boolean isEmpty() {
		
		return (bookMark == 0);
		
	}
	
	@Override
	public int getNElements() {
		
		return bookMark;
		
	}
	
	//this method is only for testing...
	@Override
	public DataElement[] getElements() {
		
		return elements;
		
	}

}
