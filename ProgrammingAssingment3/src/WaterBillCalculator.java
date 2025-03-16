/**
* @author Austin Driggs
* CS 110 Section 010
* Programming Assignment 3
* 10/27/22
*/

// Description: In this assignment you will read a data file containing customer information for the Hayhurst Water Association, 
// and calculate their water bill for the current month.  Each line in the data file contains basic information for each customer:   
// Account# ( integer),  first name, last name,  previous meter reading ( int),  current meter reading ( int), balance forward.  
// Given this basic information you will calculate the gallons used for each customer, their current charges, and total bill.

// 123 Sam Lewis 912333 925412 0.0
// 125 Terry Samuels 845714 851236 0.0
// 131 Anne Thomas 125223 130001 0.0
// 140 Frank Barns 125987 127250 0.0
// 190 Ted Willis 125000 150000 0.0
// 191 Chase Lee 0 31252 0.0
// 193 John Bragg 32659 62659 0.0
// 200 Sally Johns 12585 12682 0.0
// 201 Smith Smith 102548 102599 25.50
// 210 Joe Hails -234 10288 0.0
// 215 Sam Peters 12322 11000 0.0

// Description:
// 1.	The main method is responsible for prompting the user for the name of a data file, opening it and reading each line one at a time.  
//		Each line contains the basic information for a customer listed above, in the order given.  
//	
// 2.	As each customer is read from the file some basic calculations must take place:
//	a.	The value for previous meter reading must be >=  0, if it is less than zero, an error message should be 
//		printed along with the customers, name, and account #.
//	b.	The current meter reading must be > = previous meter reading. 
//		If the value for the current meter reading is < 0 an error should be displayed along with the customer’s name, and account #
//		
// 3.	calculateGallonsUsed:  you will implement a method that given the current and previous meter readings 
//		calculates and returns the gallons used in the current month
//	
// 4.	calculateCurrentCharges:  This method computes a customer’s current bill based on the gallons used in the current month.
//		A customer’s charges are calculated according to the chart on the next page.  
//		To calculate the current charges this method will need the customer’s gallons used.
//	
// 5.	calculateTotalBill:  This method calculates and returns a customer’s total bill, including the current charges, balance forward, and any penalty. 
//		IF the customer’s balance forward is greater than zero, add a 10% penalty to the balance forward.
//		To calculate the total bill, this method needs the current charges, and balance forward.
//	
// 6.	You main method will print  a report heading, and output a formatted line containing the billing 
//		information for each customer as a series of columns.  The report will also contain any errors.  
//
//		Sample output is shown on the next page

// Rate Schedule:
// gallons per month	rate per 1,000 gallons
// first 5,000			$10.90
// next 5,000			$10.55
// next 10,000			$10.00
// next 10,000			$9.45
// all over 30,000		$8.60

// The minimum customer bill is $31.54

// Sample Output:
// Account    First      Last       Previous        Current         Gals Used  Balance    current    Total     
// 123        Sam        Lewis      912333          925412          13079      0.00       138.04     138.04    
// 125        Terry      Samuels    845714          851236          5522       0.00       60.01      60.01     
// 131        Anne       Thomas     125223          130001          4778       0.00       52.08      52.08     
// 140        Frank      Barns      125987          127250          1263       0.00       31.54      31.54     
// 190        Ted        Willis     125000          150000          25000      0.00       254.50     254.50    
// 191        Chase      Lee        0               31252           31252      0.00       312.52     312.52    
// 193        John       Bragg      32659           62659           30000      0.00       301.75     301.75    
// 200        Sally      Johns      12585           12682           97         0.00       31.54      31.54     
// 201        Smith      Smith      102548          102599          51         25.50      31.54      59.59     
// 210        Joe        Hails      has an invalid previous meter reading of       -234.
// 215        Sam        Peters     has an invalid current meter reading of      11000.

import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

// C:\Users\austi\OneDrive\Documents\CS110\waterCustomers.txt

public class WaterBillCalculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Scanner inputFile = null;
		String filePath = null;
		
		boolean goodValue = false;
		while (!goodValue) {
			try {
				System.out.println("Please input a valid file path:");
				filePath = scan.nextLine();
				inputFile = new Scanner(new FileReader(filePath));
				goodValue = true;
				System.out.println("\nHayhurst Water Association");
			} catch (IOException e) {
				System.out.println("\nInvalid file path: " + filePath + "\nPlease try again.\n");
			}
		}
		
		System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s\n", 
				"Account", "First", "Last", "Previous", "Current", "Gals Used", "Balance", "Current", "Total");
		
		int accountNum, preMeter, curMeter, galsUsed;
		String firstName, lastName;
		double preBalance, curBalance, totBalance;
		
		while (inputFile.hasNext()) {
			
			accountNum = inputFile.nextInt();
			firstName = inputFile.next();
			lastName = inputFile.next();
			preMeter = inputFile.nextInt();
			curMeter = inputFile.nextInt();
			preBalance = inputFile.nextDouble();
			
			galsUsed = calculateGallonsUsed(preMeter, curMeter);
			curBalance = calculateCurrentCharges(galsUsed);
			totBalance = calculateTotalBill(preBalance, curBalance);
			
			if (galsUsed == -1) {
				System.out.printf("%-15d %-15s %-15s has an invalid current meter reading of " 
						+ curMeter + "\n", accountNum, firstName, lastName);
			}
			else if (galsUsed == -2) {
				System.out.printf("%-15d %-15s %-15s has an invalid previous meter reading of " 
						+ preMeter + "\n", accountNum, firstName, lastName);
			}
			else {
				System.out.printf("%-15d %-15s %-15s %-15d %-15d %-15d $%-14.2f $%-15.2f $%-15.2f\n", 
						accountNum, firstName, lastName, preMeter, curMeter, galsUsed, preBalance, curBalance, totBalance);
			}
			
		} // end while (inputFile.hasNext)
		
		scan.close();
		inputFile.close();

	} // end main
	
	public static int calculateGallonsUsed(int preMeter, int curMeter) {
		
		int galsUsed;
		
		if (preMeter >= 0) {
			if (preMeter <= curMeter) {
				galsUsed = curMeter - preMeter; // both conditions are good
			} 
			else {
				galsUsed = -1; // error curMeter
			}
		}
		else {
			galsUsed = -2; // error preMeter
		}
		
		return galsUsed;
		
	} // end calculateGallonsUsed
	
	public static double calculateCurrentCharges(int galsUsed) {
		
		double curBalance = 0;
		
		if (galsUsed > 30000) {
			curBalance = ( (5000 * .0109) + (5000 * .01055) + (10000 * .01) + (10000 * .00945) + 
					((galsUsed - 30000) * 0.0086) );
		}
		else if (galsUsed > 20000) {
			curBalance = ( (5000 * .0109) + (5000 * .01055) + (10000 * .01) + 
					((galsUsed - 20000) * 0.00945) );
		}
		else if (galsUsed > 10000) {
			curBalance = ( (5000 * .0109) + (5000 * .01055) + 
					((galsUsed - 10000) * 0.01) );
		}
		else if (galsUsed > 5000) {
			curBalance = ( (5000 * .0109) + 
					((galsUsed - 5000) * 0.01055) );
		}
		else {
			curBalance = (galsUsed * 0.0109);
		}
		
		double minBill = 31.54;
		if (curBalance < minBill) {
			curBalance = minBill;
		}
	
		return curBalance;
		
	} // end calculateCurrentCharges
	
	public static double calculateTotalBill(double preBalance, double curBalance) {
		
		double totBalance = (preBalance * 1.1) + curBalance;
		
		return totBalance;
		
	} // end calculateTotalBill

}
