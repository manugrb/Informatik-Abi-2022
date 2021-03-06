package formalLanguage;

public class LicensePlateFiniteMachine {
	
	private char[] letters;
	private int nLetters;
	private char[] numbers;
	private int nNumbers;
	private char space = ' ';
	private int[] endStates;
	private int nEndStates;
	
	public LicensePlateFiniteMachine() {
		
		nLetters = 26;
		nNumbers = 10;
		nEndStates = 4;
		
		letters = new char[nLetters];
		numbers = new char[nNumbers];
		endStates = new int[nEndStates];
		
		setLetters();
		setNumbers();
		setEndStates();
		
	}
	
	public boolean checkString(String input) {
		
		int currentState = 0;
		
		for(int i = 0; i < input.length(); i++) {
			currentState = switchState(currentState, input.charAt(i));
		}
		
		return (isInEndStates(currentState));
		
	}
	
	
	private int switchState(int currentState, char character) {
		
		switch(currentState) {
		
		case(0):
			for(int i = 0; i< letters.length; i++) {
				if(character == letters[i]) {
					return 1;
				}
			}
			return -1;
			
		
		case(1):
			if(isInLetters(character)) {
				return 2;
			}
			if(isSpace(character)) {
				return 4;
			}
			
			
		case(2):
			if(isInLetters(character)) {
				return 3;
			}
			if(isSpace(character)) {
				return 4;
			}
			return -1;
		
		
		case(3):
			if(isSpace(character)) {
				return 4;
			}
			return -1;
			
		case(4):
			if(isInLetters(character)) {
				return 5;
			}
			return -1;
		
		case(5):
			if(isInLetters(character)) {
				return 6;
			}
			if(isSpace(character)) {
				return 7;
			}
			return -1;
			
		
		case(6):
			if(isSpace(character)) {
				return 7;
			}
			return -1;

		
		case(7):
			if(isInNumbers(character)) {
				return 8;
			}
			return -1;
		
			
		case(8):
			if(isInNumbers(character)) {
				return 9;
			}
			return -1;
			
		
		case(9):
			if(isInNumbers(character)) {
				return 10;
			}
			return -1;
			
		case(10):
			if(isInNumbers(character)) {
				return 11;
			}
			return -1;
		
		
		case(11):
			return -1;
		
		default:
			return -1;
		
		}
		
		
			
			
		
	}
	
	private boolean isInLetters(char character) {
		for(int i = 0; i < letters.length; i++) {
			if(character == letters[i]) {
				return true;
			}
		}
		return false;
	}
	
	private boolean isInNumbers(char character) {
		for(int i = 0; i < numbers.length; i++) {
			if(character == numbers[i]) {
				return true;
			}
		}
		return false;
	}
	
	private boolean isSpace(char character) {
		return (character == space);
	}
	
	private boolean isInEndStates(int state) {
		for(int i = 0; i < endStates.length; i++) {
			if(endStates[i] == state) {
				return true;
			}
		}
		return false;
	}
	
	private void setLetters() {
		int startChar = (int) 'A';
		
		for(int i = 0; i < nLetters; i++) {
			letters[i] = (char) (i + startChar);
		}
	}
	
	private void setNumbers() {
		int startChar = (int) '0';
		
		for(int i = 0; i < nNumbers; i++) {
			numbers[i] = (char) (i + startChar);
		}
		
	}
	
	private void setEndStates() {
		int firstEndState = 8;
		
		for(int i = 0; i < 4; i++) {
			endStates[i] = i + firstEndState;
		}
		
		
	}
	

}
