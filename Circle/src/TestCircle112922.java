import java.awt.Color;

public class TestCircle112922 {

	public static void main(String[] args) {

	// Learning static, final, private, public, etc.
		System.out.println("The default radius is: " + Circle112922.defaultRadius);
		// Error: "The field Circle112922.defaultRadius is not visible" if variable is private
		
		// If public you can do this though
		// Circle112922.defaultRadius = -99;
		// System.out.println("The default radius is: " + Circle112922.defaultRadius);
		// To get around this change it to "final" in Circle112922
		
		System.out.println();
	
	// More
//		Circle112922 one = new Circle112922();
		
//		System.out.println("one's radius is: " + one.getRadius());
//		one.setRadius(-99);
//		System.out.println("one's radius is: " + one.getRadius());
		
		Circle112922 two = new Circle112922(100, 500, 500, Color.green);
		System.out.println("two's radius is: " + two.getRadius());
		System.out.println();
		
		System.out.println("The circumfrence of two is: " + two.getCircumfrence());
		System.out.println("The area of two is: " + two.getArea());
		System.out.println("The diameter of two is: " + two.getDiameter());
		
		System.out.println();
		
		two.grow(0.5);
		
		System.out.println("The new circumfrence of two is: " + two.getCircumfrence());
		System.out.println("The new area of two is: " + two.getArea());
		System.out.println("The new diameter of two is: " + two.getDiameter());
	}

}
