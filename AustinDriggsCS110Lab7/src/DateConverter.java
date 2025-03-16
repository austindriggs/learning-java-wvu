/**
* @author Austin Driggs
* CS 110 Section 010
* Lab 7 Problem 2
* 10/5/22
*/

import java.util.Scanner;

public class DateConverter {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
	// Setting default values to enter while statement
		String format, yearString;
		String monthString = "Month Invalid";
		String dayString = "Day Invalid";
		
		while ( monthString.equals("Month Invalid") || dayString.equals("Day Invalid") ) {
		
		// Get date and turn it into string and integers
			System.out.println("Enter in a date as MM/DD/YYYY: ");
			format = scan.nextLine();
			
			monthString = format.substring(0, format.indexOf('/'));
			int month = Integer.parseInt(monthString);
			
			dayString = format.substring(format.indexOf('/') + 1, format.lastIndexOf('/'));
			int day = Integer.parseInt(dayString);
			
			yearString = format.substring(format.lastIndexOf('/') + 1);
			int year = Integer.parseInt(yearString);
			
		// Month Validation
			if (month <= 12) {
				switch (month) {
				case 1:
					monthString = "January";
					break;
				case 2:
					monthString = "February";
					break;
				case 3:
					monthString = "March";
					break;
				case 4:
					monthString = "April";
					break;
				case 5:
					monthString = "May";
					break;
				case 6:
					monthString = "June";
					break;
				case 7:
					monthString = "July";
					break;
				case 8:
					monthString = "August";
					break;
				case 9:
					monthString = "September";
					break;
				case 10:
					monthString = "October";
					break;
				case 11:
					monthString = "November";
					break;
				case 12:
					monthString = "December";
					break;
				default:
					// monthString stays invalid
				} // End switch
				
			} // End if
			else {
				monthString = "Month Invalid";
			} // End else
			
		// Day Validation
			
			// 31 days
			if (day >= 31 || day < 0) {
				dayString = "Day Invalid";
			}
			
			// February
			else if (month == 2 && day > 28) {
				if (day == 29 && year % 4 == 0 && year % 100 != 0) {
					// leap year: no error
				} 
				else {
					dayString = "Day Invalid";
				}
			}
			
			// Months with 30 days
			if (month == 4 || month == 6 || month == 9 || month == 11) {
				if (day > 30) {
					dayString = "Day Invalid";
				}
			}
			
		// Final Output
			
			if (monthString.equals("Month Invalid") && dayString.equals("Day Invalid")) {
				System.out.println("\n" + monthString + " and " + dayString);
			}
			else if (monthString.equals("Month Invalid")) {
				System.out.println("\n" + monthString);
			}
			else if (dayString.equals("Day Invalid")) {
				System.out.println("\n" + dayString);
			}
			else {
				System.out.println("\nThe converted format is: " + monthString + " " + dayString + ", " + year + ".");
			}
			
		} // End while
		
		scan.close();

	}

}