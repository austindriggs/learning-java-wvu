import java.util.Arrays;

public class TestEmployee{

	public static void main(String[] args){
	
// TEST 1
		
	/**
	 * WHAT WE REMOVED WHEN MAKING EMPLOYEE ABSTRACT
	 * 
	 * Employee john = new Employee("John", "Adams", "Janitor", "2/18/2008");
	 * 
	 * Employee unknown = new Employee();
	 * 
	 * john.print();  // print the contents of John
	 * unknown.print();  // print the contents of unknown
	 * // change unknown’s first name, and print again
	 * unknown.setFirst("Sandy");
	 * unknown.print();
	 * 
	 * System.out.println("\n\n");
	 * 
	 * john.print("Great Employee");
	 * 
	 */
	

		
// SALARIED
	Salaried sue = new Salaried();
	sue.print();
	
	System.out.println("\n\n");
	
	sue = new Salaried("Susie", "Duck", "Decorator", "4/23/2000", 65000.00f);
	sue.print();

	System.out.println("\n\n");
	
	System.out.println("Sue's salary is: " + sue.getSalary());
	// OUTPUT: Sue's salary is: 65000.0
	
	
	
// 2/3/23
	
	System.out.println("Sue's first name is: " + sue.getFirst());
	// Output: Sue's first name is: Susie
	System.out.println("Sue's last name is: " + sue.getLast());
	// Output: Sue's last name is: Duck
	
	System.out.println("\n\n");
	
	
	
	// What if we do this?
	System.out.println("Sue: " + sue);
	// Output: Sue: Salaried@1175e2db
	// Why?	There is no print method for Salaried, so it skips it, goes to Employee, doesn't see a print method for Salaried,
	// 		skips it, and goes to class Object to print out the address of the variable sue. 
	
	System.out.println("\n\n");
	
	
	
	
// Connecting the three child classes
	
	Employee x = new Salaried("Xfirst", "Xlast", "Xposition", "6/26/2004", 34000.00f);
	
	// This is called upcasting
	// Every object has two types: Apparent (Employee) and Actual (Salaried)
	// Why? To create an array of employees with childs in the indexes
	
	x.print();
	
	System.out.println("\n\n");
	
	Employee c = new Hourly("Cfirst", "Clast", "Cposition", "8/18/2007", 17.38f, 20f);
	c.print();
	
	System.out.println("\n\n");
	
	Employee r = new Salaried("Rfirst", "Rlast", "Rposition", "6/26/2004", 34000.00f);
	Employee k = new Hourly("Kfirst", "Klast", "Kposition", "6/26/2004", 17.38f, 20f);
	Employee l = new Commission("Lfirst", "Llast", "Lposition", "6/26/2004", 34000.00f, 5000f, 6);
	l.print();
	
	System.out.println("\n\n");
	
	Employee[] empList = new Employee[10];
	
	empList[0] = new Hourly("Efirst", "Elast", "Eposition", "6/26/2004", 17.38f, 20f);
	empList[1] = sue;
	empList[2] = x;
	empList[3] = r;
	empList[4] = k;
	empList[5] = l;
	
	System.out.println(Arrays.toString(empList));
	
	System.out.println("\n\n");
	
	for (int i = 0; i < empList.length; i++) {
		if (empList[i] != null) {
			empList[i].print();
			System.out.println("");
		}
	}
	
	System.out.println("\n\n");
	
	
	
	// You can cast it back to the child type but this is generally "unsafe"
	Salaried x2 = (Salaried) x;
	x2.print();
	x.print();
	
	System.out.println("\n\n");
	
	
	
	
	// Instance of operator
	
	
	
	
	
	// Can we create an array of literally anything? Yes: Object array
	
	Object[] objs = new Object[5];
	objs[0] = "String";
	objs[1] = 5;
	int[] vals = {1, 2, 3};
	objs[2] = vals;
	
	for (int i = 0; i < objs.length; i++) {
		if (objs[i] != null) {
			System.out.println(objs[i] + " and its class is " + objs[i].getClass());
		}
	}
	
	System.out.println("\n\n");
	
	// BUT now we can't do this:
	// int num = objs[1];
	// and have to do this: casting in order to auto-unbox
	int num = (int) objs[1];
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}// main
}// end testemployee
