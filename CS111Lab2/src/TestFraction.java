
public class TestFraction {
	
	public static void main(String[] args) {
		
		Fraction one = new Fraction(1, 3);
		
		System.out.println("defaultNumerator: " + Fraction.defaultNumerator + " defaultDenominator: " + Fraction.defaultDenominator); 
			// the . in one.numerator is called the member access operator.
		System.out.println("\n\n");

	// It would be nice to be able to print it out
		
		System.out.println("one: " + one);
		System.out.println("\n\n");
		
	// Getters
		
		System.out.println("One's Numerator: " + one.getNumerator());
		System.out.println("One's Denominator: " + one.getDenominator());
		
		System.out.println("\n\n");
		
	// Setters
		
		one.setNumerator(2);
		// one.setDenominator(0);
			
			/*
			 * If you uncomment one.setDenominator(0); you get this message
			 * 
			 * Exception in thread "main" java.lang.RuntimeException: The denominator of a Fraction cannot be equal to zero.
			 * 		at Fraction.setDenominator(Fraction.java:185)
			 * 		at TestFraction.main(TestFraction.java:27)
			 */
			
		System.out.println("One's Numerator: " + one.getNumerator());
		System.out.println("One's Denominator: " + one.getDenominator());
		
		System.out.println("\n\n");
		
		one.setNumerator(2);
		one.setDenominator(6);
		System.out.println("One's Numerator: " + one.getNumerator());
		System.out.println("One's Denominator: " + one.getDenominator());
		
		System.out.println("\n\n");
		
	// Copy
		
		Fraction two = new Fraction(one);
		System.out.println("two: " + two);
		
	// Copy testing
		
		Fraction four = two;
		System.out.println("four: " + four);
			// we can do this but when we do this it prints true
		System.out.print("four == 2: ");
		System.out.println(four == two);
		
			// compared to this which returns false
		Fraction five = new Fraction(two);
		System.out.println("five: " + five);
		System.out.print("five == two: ");
		System.out.println(five == two);
		
		// keywords: assignment, allius, 
		
		System.out.println("\n\n");
		
	// Add (uses simplify method)
		Fraction six = new Fraction(7,8);
		System.out.println("six: " + six + "\n");
		System.out.println("six + four = " + Fraction.add(five, four));
		
	// Subtract
		System.out.println("six - four = " + Fraction.subtract(six, four));
		
	// Multiply
		System.out.println("six * four = " + Fraction.multiply(six, four));
	
	// Divide
		System.out.println("six / four = " + Fraction.divide(six, four));
		
		System.out.println("\n\n");
		
	// equals
		Fraction seven = new Fraction(4,8);
		System.out.println("seven: " + seven);
		Fraction eight = new Fraction(1,2);
		System.out.println("eight: " + eight + "\n");
		
		System.out.println("seven == eight = " + seven.equals(eight));
		System.out.println("seven == six = " + seven.equals(six));
		
		System.out.println("\n\n");
		
	// 
		
		
	}

}
