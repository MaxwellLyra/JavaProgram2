/*
* ItemCheckerApp.java
* @author Maxwell Lyra  20246943
* 15/05/2022
*/
import javax.swing.JOptionPane;

public class ItemCheckerApp{
	public static void main (String args []){


	// Variables
	String eircode = " "; // variable used to hold user input "eircode"
	String answer; // variable used to check if user wants to exit the application or not
	boolean isValid = false; // boolean to check if eircode is valid or not


	// Object
	ItemChecker myIC = new ItemChecker ();


	// IPO

		do { // do while loop used to exit the application only if user enter "yes"

			do { // EXTRA FEAT - do while loop used to accept ONLY eircodes of length "8" (used to avoid "null pointers").
				eircode = JOptionPane.showInputDialog(null, "Please enter an eircode");

				if (eircode.length() != 8){ // if statement used to display message in case of eircode with different length if entered.
					JOptionPane.showMessageDialog(null, "Please enter an eircode in the format: XXX XXXX");
				}
			} while (eircode.length() != 8);

		// Process
		myIC.setEircode(eircode.toUpperCase()); // convert characters of "eircode" to Upper Case and send to instantiable class
		myIC.compute(); // calling compute method

		// Output
		eircode = myIC.getEircode(); // get Eircode (now all in Upper case)
		isValid = myIC.isIsValid(); // getting back result if "eircode" is valid or not

		if (isValid) { // if "eircode" is valid this message is displayed
			JOptionPane.showMessageDialog(null, "The eircode " + eircode + " is valid");
			}

		else {// if "eircode" is NOT valid this message is displayed
			JOptionPane.showMessageDialog(null, "The eircode " + eircode + " is NOT valid");
			}

		// Last question to the user if they want to continue or not
		answer = JOptionPane.showInputDialog(null, "Would you like to check another eircode?\nEnter yes if you want to");


		} while (answer.equals("yes")); // enf of do while loop


	} // MAIN

} // CLASS