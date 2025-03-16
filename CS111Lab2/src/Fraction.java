/*
	 *  For simplicity reasons: we are assuming all fractions are positive and they can be improper.
	 *  
	 *  What can we do with a fraction?
	 *  Create, simplify, add/subtract, 
	 *  
	 *  Data Items: numerator (>= 0) default = 1, denominator (> 0) default = 1, 
	 *  Operations: fraction() (constructor), add(), subtract(), multiply(), divide(), simplify(), getters / setters,
	 *  toString(), toDecimal(), equals() / compareTo()
	 *    
	 *  When we impliment our class, we want to encapsulate the numerator and denominator to ensure that the values
	 *  that the user gives us are legal. This is why we use getters and setters. To enforce the rules. 
	 *  
	 *  CONSIDER COHESION: each class should describe a single thing or perform a single type of task.
	 *  
	 *  
	 *  
	 *  We can document the design of our class using UML
	 * 
	 *  Class Diagrams: 3 sections
	 *  Class Name: Fraction
	 *  Data Members: Numerator and Denominator (data type: int, public/private, etc.)
	 *  Operations(): see above
	 *  
	 *  
	 *  
	 *  A public class member has a + and is directly accessable outside the class by any other program by name.
	 *  A private class member has a - and is can only be used in the code inside the class.
	 *  	Most often, most attributes are private because we want to control how they are used. 
	 *  # means protected. A protected data member is a cross between the two because its visable inside the
	 *  class and by direct children.
	 *  
	 *  - numerator: int = 1
	 *  - denominator: int = 1
	 *  
	 *  Every class needs a constructor to create an "instance" of the class. The constructor will set the value of
	 *  data members inside the instance.
	 *  
	 *  We can have default constructors which receive no parameters and set data members to default values:
	 *  + Fraction (): [constructor]
	 *  
	 *  We can have non-default constructors:
	 *  + Fraction ( in numerator: int, in denominator: int ): [constructor]
	 *  
	 *  We can even have a "copy" constructor:
	 *  + Fraction ( in fractionToCopy: Fraction ) : [constructor]
	 *  
	 *  
	 *  
	 *  For each operation, we further define the algorithm the method implements:
	 *  Description
	 *  Arguments
	 *  Return Values
	 *  Preconditions
	 *  Postconditions
	 *  Exceptions
	 *  
	 *  Organization of the class:
	 *  Class Variables
	 *  Instance Variables
	 *  Constructors
	 *  Accessors: getters
	 *  Mutators: setters
*/

// imports if needed

public class Fraction {
	
// Class Variables
	
	// we often use these for common values such as pi
	// these values never change and only ever occur once in the class - they are shared thoughout the class
	// a constructor creates an instance? of the class
	
	public static int defaultNumerator = 1;
	public static int defaultDenominator = 1;
	
// Instance Variables
	
	private int numerator;
	private int denominator;
	
// Constructors
	
	public Fraction() {
		
		/*
		 * Sets the denominator and numerator of the freaction the the specified default values.
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: numerator = 1, denominator = 1
		 * Exceptions: None
		 * 
		 */
		
		this.numerator = defaultNumerator; // "this" is the name of the object being created or used by this method
		this.denominator = defaultDenominator; // in this Fraction, set the value of the denominator equal to the default
		
	}
	
	public Fraction(int theNumerator, int theDenominator) {
		
		/*
		 * Stores the value theNumerator as the Numerator of the fraction and stores the value theDenominator as the Denominator of the fraction
		 * Parameters: theNumerator: numerator of the fraction, theDenominator: denominator of the fraction
		 * Preconditions: denominator != 0;
		 * Postconditions: None
		 * Exceptions: throw arithmetic exception if theDenominator = 0
		 * 
		 */
		
		this.setNumerator(theNumerator);
		this.setDenominator(theDenominator);
		
	}
	
	@Override
	public String toString() {
		return this.numerator + "/" + this.denominator;
	}
	
	public Fraction(Fraction other) {
		
		/* 
		 * Copy method
		 * 
		 */
		
		this.numerator = other.numerator;
		this.denominator = other.denominator;
		
	}
	
// Accessors: getters
	
	public int getNumerator() {
		
		/*
		 * Returns the value stored in the numerator of a fraction
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: numerator of the fraction to which the method is applied is r
		 * Exceptions: None
		 */
		
		return this.numerator;
		
	}
	
	public int getDenominator() {
		
		/*
		 * Returns the value stored in the denominator of a fraction
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: denominator of the fraction to which the method is applied is r
		 * Exceptions: None
		 */
		
		return this.denominator;
		
	}
	
// Mutators: setters
	
	public void setNumerator(int theNumerator) {
		
		/*
		 * 
		 */

		this.numerator = theNumerator;
		
	}
	
	public void setDenominator(int theDenominator) {
		
		/*
		 * 
		 */
		
		if (theDenominator == 0) {
			this.denominator = defaultDenominator;
			throw new RuntimeException("The denominator of a Fraction cannot be equal to zero.");
		}
		else {
			this.denominator = theDenominator;
		}
		
	}
	
	public static Fraction add(Fraction one, Fraction two) {
		
		/*
		 * There are two ways of creating this class
		 * 
		 * Static method:
		 * Fraction ans = Fraction.add(two, five);
		 * 
		 * Instance method
		 * Fraction ans = two.add(five);
		 * 
		 * These are design choices by us, the coder.
		 * 
		 */
		
		int newNumerator = (one.getNumerator() * two.getDenominator()) + (two.getNumerator() * one.getDenominator());
		int newDenominator = one.getDenominator() * two.getDenominator();
		
		Fraction answer = new Fraction(newNumerator, newDenominator);
		
		answer.simplify();
		
		return answer;
	}
	
	public static Fraction subtract(Fraction one, Fraction two) {
		
		int newNumerator = (one.getNumerator() * two.getDenominator()) - (two.getNumerator() * one.getDenominator());
		int newDenominator = one.getDenominator() * two.getDenominator();
		
		Fraction answer = new Fraction(newNumerator, newDenominator);
		
		answer.simplify();
		
		return answer;
	}
	
	public static Fraction multiply(Fraction a, Fraction b) {
		
		Fraction c = new Fraction((a.numerator * b.numerator), (a.denominator * b.denominator));
		
		c.simplify();
		
		return c;
		
	}
	
	public static Fraction divide(Fraction a, Fraction b) {
		
		Fraction c = new Fraction(a.denominator, a.numerator);
		
		return Fraction.multiply(c, b);
		
	}
	
	public void simplify() {
		
		int gcd = gcd(this.numerator, this.denominator);
		  this.numerator = this.numerator / gcd;
		  this.denominator = this.denominator/gcd;
		
	}
	
	private static int gcd(int a, int b) {
		
		int temp=0;

		while (b != 0) {
			temp = b;               
			b = a % b;
			a = temp;
		}
		 
		return a;

	}
	
	@Override
	public boolean equals(Object obj) {
		
		/*
		 * Notes:
		 * 
		 * 
		 */
		
		Fraction objFraction = (Fraction) obj;
		
		Fraction thisCopy = new Fraction(this);
		Fraction objCopy = new Fraction(objFraction);
		
		thisCopy.simplify();
		objCopy.simplify();
		
		if (thisCopy.numerator == objCopy.numerator && thisCopy.denominator == objCopy.denominator) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public int compareTo(Fraction obj) {
		
		/*
		 * Notes:
		 * 
		 * Basically showing which one is greater by returning a negative int, positive int, or zero
		 */
		
		Fraction objFraction = (Fraction) obj;
		
		Fraction thisCopy = new Fraction(this);
		Fraction objCopy = new Fraction(objFraction);
		
		thisCopy.simplify();
		objCopy.simplify();
		
		if (thisCopy.denominator == objCopy.denominator) {
			return(thisCopy.numerator - objCopy.numerator);
			// this could return negative, positive, or zero, which is what we want
		}
		
		else {
			if (thisCopy.denominator > objCopy.denominator) {
				return -1;
			}
			else {
				return 1;
			}
		}
		
	}
	
}