/*
* @author Austin Driggs
* CS 111 Section 002
* Lab Assignment 5
* Jakob Kaivo
* 2/6/23
* Purpose: To learn about abstract classes and methods as well as parent and child classes.
*/

public class CheckingAccount extends BankAccount {
	
	/*
	 * Class Name: CheckingAccount
	 * Purpose: Create a checking account for the user
	 * Exceptions: None
	 */
	
	private final double INTEREST_RATE = 0.0001;
	
	public CheckingAccount(String name, double amount) {
		
		/*
		 * Method Name: CheckingAccount
		 * Purpose: Constructor
		 * Parameters: String name and double amount
		 * Preconditions: None
		 * Postconditions: create a new checking account with the account name name and account balance amount
		 * Exceptions: None
		 */
		
		this.setName(name);
		this.deposit(amount);
	
	}

	public void withdraw(double amount) {
		
		/*
		 * Method Name: withdraw
		 * Purpose: Takes a double parameter, and subtracts that amount plus the withdraw fee from the current balance.
		 * Parameters: double amount
		 * Preconditions: None
		 * Postconditions: a lesser account balance
		 * Exceptions: None
		 */
		
		this.accountBalance -= amount;
		
	}

	public void accrueInterest() {
		
		/*
		 * Method Name: accrueInterest
		 * Purpose: Adds interest to the current account balance.
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: a greater account balance
		 * Exceptions: None
		 */
		
		this.accountBalance += (this.accountBalance * INTEREST_RATE);
		
	}
}