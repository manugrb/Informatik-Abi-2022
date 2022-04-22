package formalLanguage;

public class LicensePlateFiniteMachine {
	
	private char[] letters;
	private char[] numbers;
	private char space = ' ';
	private int[] endStates;
	
	public LicensePlateFiniteMachine() {
		
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
	

}
