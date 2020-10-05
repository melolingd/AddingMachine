package cse360assignment02;

public class AddingMachine {
	 private int total;			// Declare private variable total
	 private String history;	// Declare private variable history
	  
	  // Method to set values to private data
	  public AddingMachine () {
	    total = 0;  		// set total to base case
	    history = "0 ";		// set history to base case
	  }
	  
	  // Returns variable total
	  public int getTotal () {
	    return total;	// Returns total to method call
	  }
	  
	  // Adds parameter value to total
	  public void add (int value) {
		  total = total + value;			// Adds value to total and save change in total
		  history += "+ " + value + " ";	// Updates history of known addition
	  }
	  
	  // Subtracts parameter value from total
	  public void subtract (int value) {
		  total = total - value;			// Subtracts value from total and stores change in total
		  history += "- " + value + " ";	// Updates history of known subtraction
	  }
	  
	  // Returns value of changes to total
	  public String toString () {
	    return history;		// returns variable history to method call
	  }
	  
	  // Clears your "memory" values
	  public void clear() {
		  history = "0 ";	// Sets history value to base case "0 "
		  total = 0;		// Sets total to base case 0
	  }
}
