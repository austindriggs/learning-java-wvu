/*
* @author Austin Driggs
* CS 111 Section 002
* 2/1/23
* Purpose: See notes and inheritance doc
*/



public abstract class Employee {
	
	private String firstName;
	private String lastName;
	private String title;
	private String hireDate;
	// A member that is protected is directly visable in its own class and all sub classes. 
	
	
	
// CONSTRUCTORS
	public Employee(){
	
		this.firstName = new String("unknown");
		this.lastName = new String("unknown");
		this.title = new String("unknown");
		this.hireDate = new String("unknown");

	}// end default constructor
	
	public Employee(String first, String last, String position, String date) {

		this.firstName = first;
		this.lastName = last;
		this.title = position;
		this.hireDate = date;
		
	}// end non default constructor
	
	

// SETTERS
	
	public void setFirst(String name) {
		this.firstName = new String(name);
	}
	
	public void setLast(String name) {
		this.lastName = name;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setDate(String date) {
		this.hireDate = date;
	}
	
	
	
// GETTERS	
	
	public String getFirst() {
		return this.firstName;
	}
	
	public String getLast() {
		return this.lastName;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getDate() {
		return this.hireDate;
	}
	
	
		
// MUTATORS
	
	public void print() {
		// this method prints out the data stored in all 
		// data members for a specific instance

		System.out.println("The employee is " + this.firstName + " " + this.lastName + ", and was hired on " 
				+ this.hireDate + ", for the position of " + this.title + ".");
		
	}// end print
	
	// overloaded print method
	public void print(String extra) {
		System.out.println("The employee is " + this.firstName + " " + this.lastName + ", and was hired on " 
				+ this.hireDate + ", for the position of " + this.title + "."
				+ "\nExtra: " + extra);
	}// end print
	
	
	
	public abstract float calcPay();
	// This says that every child class HAS TO HAVE a method that calculates pay
	
	

}
