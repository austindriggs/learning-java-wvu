/*
 * 2/6/23
 * 
 * 
 * 
 */

public class Commission extends Employee {
	
	private float salary;
	private float commissionRate;
	private float currentSales; // sales during the current pay period
	
// CONSTRUCTORS
	
	public Commission() {
		super();
		
		this.salary = 0;
		this.commissionRate = 0;
		this.currentSales = 0;
		
	}
	
	public Commission(String first, String last, String date, String position, float sal, float commission, float sales) {
		super(first, last, date, position); 
		
		this.salary = sal;
		this.commissionRate = commission;
		this.currentSales = sales;
		
	}
	
	
	
// GETTERS
	
	
	
// SETTERS
	
	
	
// MUTATORS
	
	public float calcPay() {
		
		float pay = (this.salary / 26) + (this.commissionRate * this.currentSales);
		
		return pay;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("The employee earns $" + this.salary + " per year, " +
		"earns " + this.commissionRate + " of commission per sale, had $" + this.currentSales + " sales this pay period, "
				+ "and earned $" + this.calcPay() + " this pay period.");
	}
	
	
	
	
	
	
	
	
	

}
