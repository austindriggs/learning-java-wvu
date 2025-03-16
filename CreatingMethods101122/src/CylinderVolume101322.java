import java.util.Scanner;

public class CylinderVolume101322 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		double radius = 0, height = 0;
		
		while (radius <= 0 || height <= 0) {
			System.out.println("Please enter the radius of the cylinder: ");
			radius = scan.nextDouble();
			System.out.println("\nPlease enter the height of the cylinder: ");
			height = scan.nextDouble();
			
			if (radius <= 0 || height <= 0) {
				System.out.println("\nPlease enter values greater than 0.");
			}
		}
		
		System.out.printf("\nThe volume of the cylinder is about: %.2f", volume(radius, height));
		
	}
	
	public static double volume( double r, double h) {
		
		double vol = Math.PI * (r * r) * h;
		return vol;
		
	}

}
