


// DO NOT RUN THIS




import java.util.*;

public class TryCatchBlock {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		boolean goodValue = false;
		
		while (!goodValue) {
			
			try {
				System.out.println("Input a type double number: ");
				double num = scan.nextDouble();
				goodValue = true;
			}
			catch (InputMismatchException e) {
				System.out.println("You input an invalid value.");
			}
		}

	}

}
