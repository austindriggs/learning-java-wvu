import java.util.Scanner;

public class ForWhilePractice100622 {

	public static void main(String[] args) {
		// Write a fragment of code that will compute the sum of the first n positive odd integers, 
		// for example, if n is 5, you should compute 1 + 3 + 5 + 7 + 9. 
		// You can assume that variables n and sum exist and are appropriately initialized.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a value for n and we will sym the firs n odd numbers: ");
		int n = scan.nextInt();
		int sum = 0;
		int oddNum = 1;
		
		while ( n > 0) {
			sum += oddNum;
			oddNum += 2;
			n--;
		}
		System.out.println("\nsum is " + sum);

	}

}
