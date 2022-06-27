/*
* ItemChecker.java
* @author Maxwell Lyra
* 15/05/2022
*/

public class ItemChecker{


	// Variables
	private String eircode; // variable used to hold user input "eircode"
	private boolean isLet1; // variable used to check if first character is a letter
	private boolean isDigit; // variable used to check if second and third characters are numbers
	private boolean isSpace; // variable used to check if fourth character is a space
	private boolean isChar; // variable used to check if the four last characters are numbers or letters
	private boolean isValid; // variable used to check if eircode passed through all 4 parameters

	// Constructor
	public ItemChecker (){
		//Initializing variables
		String eircode = " ";
		boolean isLet1 = false;
		boolean isDigit = false;
		boolean isSpace = false;
		boolean isChar = false;
		boolean isValid = false;
		}


	// Method - validating eircode

	public void compute (){ // method used to check all charcater of "eircode" and indicates if it's valid or not;

		isLet1 = (eircode.charAt(0) >= 'A' && eircode.charAt(0) <= 'Z'); // checking if character is between letters A and Z (already in upper case);

		isDigit = (eircode.charAt(1) >= '0' && eircode.charAt(2) <= '9'); // checking if character is between numbers 0 and 9;

		isSpace = (eircode.charAt(3) == ' '); // checking if there's a space in index 3 of "eircode";

		for (int i = 4; i < 8; i++){ // for loop to check if all four last characters are letters or numbers between 0-9 or A-Z;
			isChar = (eircode.charAt(i) >= '0' && eircode.charAt(i) <= '9' || eircode.charAt(i) >= 'A' && eircode.charAt(i) <= 'Z');
			}

		isValid = (isLet1 && isDigit && isSpace && isChar); // boolean indicating if eircode is valid in case of all parameters were met.

		}


	// Getters and Setters
	public void setEircode (String eircode){
		this.eircode = eircode;
		}

	public String getEircode (){
		return eircode;
		}

	public void setIsLet1 (boolean isLet1){
		this.isLet1 = isLet1;
		}

	public boolean isIsLet1 (){
		return isLet1;
		}

	public void setIsDigit (boolean isDigit){
		this.isDigit = isDigit;
		}

	public boolean isIsDigit (){
		return isDigit;
		}

	public void setIsSpace (boolean isSpace){
		this.isSpace = isSpace;
		}

	public boolean isIsSpace (){
		return isSpace;
		}

	public void setIsChar (boolean isChar){
		this.isChar = isChar;
		}

	public boolean isIsChar (){
		return isChar;
		}

	public void setIsValid (boolean isValid){
		this.isLet1 = isLet1;
		}

	public boolean isIsValid (){
		return isValid;
		}

}



