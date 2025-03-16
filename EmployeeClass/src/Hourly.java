/*
 * 2/6/23
 * 
 * 
 * 
 */

public class Hourly extends Employee{

	private float hourlyRate;
	private float hoursWorked;
	
	// KEEP IN MIND WE WOULD NEED TO DO ERROR CHECKING TO MAKE SURE THESE NUMBERS ARE POSITIVE
	
// CONSTRUCTORS
	
	public Hourly() {
		
		super();
		
		this.hourlyRate = 0.0f;
		this.hoursWorked = 0.0f;
		
	}
	
	public Hourly(String first, String last, String date, String position, float rate, float hours) {
		
		super(first, last, date, position); 
		
		this.setHourlyRate(rate);
		this.setHoursWorked(hours);
		
	}
	
// GETTERS
	
	public float getHourlyRate() {
		return this.hourlyRate;
	}
	
	public float getHoursWorked() {
		return this.hoursWorked;
	}
	
	
	
// SETTERS
	
	public void setHourlyRate(float newRate) {
		if (newRate > 0) {
			this.hourlyRate = newRate;
		}
		else {
			throw new RuntimeException("Illegal value for hourly rate: Cannot be less than zero.");
		}
	}
	
	public void setHoursWorked(float newHours) {
		if (newHours > 0) {
			this.hoursWorked = newHours;
		}
		else {
			throw new RuntimeException("Illegal value for hours worked: Cannot be less than zero.");
		}
	}
	
	
	
// MUTATORS
	
	@Override
	public float calcPay(){
		return (this.hourlyRate * this.hoursWorked);
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("The employee earns $" + this.hourlyRate + " per hour, " +
		"worked " + this.hoursWorked + " hours, and earned $" + this.calcPay() + " this pay period.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
