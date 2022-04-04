package fieldImplementation;

public class FieldStructure {
	
	private DataElement[] elements;
	private int bookMark;
	
	public FieldStructure(int maxAmount) {
		
		this.elements = new DataElement[maxAmount];
		this.bookMark = 0;
		
	}
	
	public void insert(DataElement newElement) {
		
		if(bookMark <= elements.length && bookMark != -1) {
			//enough space
			
			elements[bookMark] = newElement;
			
			if(bookMark < elements.length) {
				bookMark++;
			}else {
				//the array is full
				bookMark = -1;
			}
			
		}else {
			
			System.out.println("Sorry, the List is full! Unable to add new element!");
			
		}
		
	}
	
	public DataElement remove() {
		
		DataElement returnElement = elements[0];
		
		for(int i = 0; i < bookMark; i++) {
			
			elements[i] = elements[i + 1];
			
		}
		
		bookMark--;
		return returnElement;
		
	}
	
	public void printAll() {
		
		for(DataElement element : elements) {
			
			element.print();
			
		}
		
	}
	
	public boolean isEmpty() {
		
		return (bookMark == 0);
		
	}
	
	//this method is only for testing...
	public DataElement[] getElements() {
		
		return elements;
		
	}

}
