import java.util.Scanner;

public class DigitComma {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Input a number between 1,000 and 999,999: ");
		String num = scan.nextLine();
		
		if (num != null) {
			System.out.println(comma(num));
		}
	
	}
	
	public static String comma(String num) {
		int position = num.indexOf(',');
		if (position ==  -1) {
			System.out.println("The number contains no commas.");
			return null;
		}
		else {
			String newNum = num.substring(0, position) + num.substring(position + 1);
			return newNum;
		}
	}

}
