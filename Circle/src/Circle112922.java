
import java.awt.Color;

public class Circle112922 {

	// Lets create a static/class datamember for our default radius
	static final public double defaultRadius = 1;
	
	// instance data members:
	private double radius; // must be > 0
	private double x;
	private double y;
	private Color color;
	
	// constructors go here:
	// the default constructr has no arguments
//	public Circle112922() {
//		this.radius = defaultRadius;
//		this.x = 100;
//		this.y = 100;
//		this.color = Color.magenta;
//	}
	
	// creating a non-default constructor
	public Circle112922(double r, double anX, double anY, Color c) {
		this.radius = r;
		this.x = anX;
		this.y = anY;
		this.color = c;
	}
	
	// creating a getter
	public double getRadius() {
		return radius;
	}
	
	// creating a setter
	public void setRadius(double r) {
		if (r < 0) {
			throw new ArithmeticException(r + " is not a legal radius.");
		}
		else {
			this.radius = r;
		}
	}
	
//	public void draw() {
//		StdDraw.setPenColor(this.color);
//		StdDraw.circle(this.x, this.y, this.radius);
//	}
	
	public double getCircumfrence() {
		double c = 2 * Math.PI * this.radius;
		return c;
	}
	
	public double getArea() {
		double a = Math.PI * (this.radius * this.radius);
		return a;
	}
	
	public double getDiameter() {
		double d = 2 * this.radius;
		return d;
	}
	
	// mutator method
	// grow a circle by a particular percentage
	public void grow(double percentage) {
		this.radius = this.radius * (1 + percentage);
	}
	
}
