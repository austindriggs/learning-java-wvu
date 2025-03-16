
public class Salaried extends Employee {
	
	// The "extends" says that Salaried is a child of Employee. This is inheritance.
	
	private float salary;
	
	
	
// Default Constructor
	public Salaried() {
		super(); // super is a reference to the class's direct parent (1 level up)
	    this.salary =  0.0f;
	}
	
	
	
// Constructor
	public Salaried(String first, String last, String date, String position, float sal) {
		super(first, last, date, position); // super is a reference to the class's direct parent (1 level up)
		
		// If you didn't want to use super, you could do this:
		// this.setFirst(first);
		
		this.salary = sal;
		
	}
	
	
	
// Setters
	public void setSalary(float newSal) {
		this.salary = newSal;
	}
	
	
	
// Getters
	public float getSalary() {
		return this.salary;
	}

	
	
// Mutators
	
	@Override
	// Override is used so that we aren't using the print method from class Object that just prints out the address of the variable.
	// In this child class Salaried it is also used so that we don't use the print method from Employee.
	public void print() {
		super.print();
		System.out.println("The employee earns $" + this.salary + " per year " +
		"and earned $" + this.calcPay() + " this pay period.");
		
	}
	
	@Override
	public float calcPay() {
		float currentPay = this.salary / 26;
		return currentPay;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
