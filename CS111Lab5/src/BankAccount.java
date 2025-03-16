/*
* @author Austin Driggs
* CS 111 Section 002
* Lab Assignment 5
* Jakob Kaivo
* 2/6/23
* Purpose: To learn about abstract classes and methods as well as parent and child classes.
* 
*/



public abstract class BankAccount {
	
	/*
	 * Class Name: BankAccount
	 * Purpose: Allow for the creation of either a checking and/or savings account for the user
	 * Exceptions: None
	 * 
	 */
	
// Instance Variables
	
	private String accountName;
	protected double accountBalance;
	
	
	
// Setters
	
	public void setName(String name) {
		
		/*
		 * Method Name: setName
		 * Purpose: Takes a String parameter, which becomes the name associated with the account.
		 * Parameters: String name
		 * Preconditions: None
		 * Postconditions: Changing the accountName to the new name provided
		 * Exceptions: None
		 */
		
		this.accountName = name;
		
	}

	
	
// Getters
	
	public String getName() {
		
		/*
		 * Method Name: getName
		 * Purpose: Return the name associated with the account as a String.
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: None
		 * Exceptions: None
		 */
		
		return this.accountName;
	}

	public double getBalance() {
		
		/*
		 * Method Name: getBalance
		 * Purpose: Returns the current balance of the account as a double.
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: None
		 * Exceptions: None
		 */
		
		return this.accountBalance;
		
	}
	

	
// Mutators

	public void deposit(double amount) {
		
		/*
		 * Method Name: deposit
		 * Purpose: Takes a double parameter, and adds that amount to the current balance.
		 * Parameters: double amount
		 * Preconditions: None
		 * Postconditions: a greater account balance
		 * Exceptions: None
		 */
		
		this.accountBalance += amount;
	}

	public abstract void withdraw(double amount);
	
	/*
	 * Method Name: withdraw
	 * Purpose: Takes a double parameter, and subtracts that amount plus the withdraw fee from the current balance.
	 * Parameters: double amount
	 * Preconditions: None
	 * Postconditions: a lesser account balance
	 * Exceptions: None
	 */
	
	

	public abstract void accrueInterest();
	
	/*
	 * Method Name: accrueInterest
	 * Purpose: Adds interest to the current account balance.
	 * Parameters: None
	 * Preconditions: None
	 * Postconditions: a greater account balance
	 * Exceptions: None
	 */
	
	
	
}