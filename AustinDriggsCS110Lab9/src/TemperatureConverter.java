/**
* @author Austin Driggs
* CS 110 Section 010
* Lab 9 Problem 1
* 10/19/22
*/

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		String name = scan.nextLine();
		
		welcome(name);
		
		System.out.println("\nEnter the temperature in Fahrenheit: ");
		double fahrenheit = scan.nextDouble();
		
		double celsius = fahrenheitTocelsius(fahrenheit);
		
		System.out.printf("\nThe temperature in celsius is %.2f\n", celsius);
		
		System.out.println("\nEnter the day: ");
		String dummy = scan.nextLine();
		String Day = scan.nextLine(); // used for errors
		String day = Day.toLowerCase(); // used for switch
		
		System.out.println();
		
		switch (day) {
		case "monday":
			if (celsius >= 6.00 && celsius <= 10.00) {
				System.out.println("Sunny Weather");
				break;
			}
			else {
				System.out.println("Invalid temperature range for this day.");
				break;
			}
		case "tuesday":
			if (celsius >= 3.00 && celsius <= 12.00) {
				System.out.println("Cloudy Weather");
				break;
			}
			else {
				System.out.println("Invalid temperature range for this day.");
				break;
			}
		case "wednesday":
			if (celsius >= 5.00 && celsius <= 12.00) {
				System.out.println("Cloudy Weather");
				break;
			}
			else {
				System.out.println("Invalid temperature range for this day.");
				break;
			}
		case "thursday":
			if (celsius >= -10.00 && celsius <= 4.00) {
				System.out.println("Snow Storm");
				break;
			}
			else {
				System.out.println("Invalid temperature range for this day.");
				break;
			}
		case "friday":
			if (celsius >= 9.00 && celsius <= 16.00) {
				System.out.println("Rainfall");
				break;
			}
			else {
				System.out.println("Invalid temperature range for this day.");
				break;
			}
		case "saturday":
			if (celsius >= 4.00 && celsius <= 13.00) {
				System.out.println("Cloudy Weather");
				break;
			}
			else {
				System.out.println("Invalid temperature range for this day.");
				break;
			}
		case "sunday":
			if (celsius >= 6.00 && celsius <= 10.00) {
				System.out.println("Partly Cloudy");
				break;
			}
			else {
				System.out.println("Invalid temperature range for this day.");
				break;
			}
		default:
			System.out.println(Day + "is not a valid day. Please try again.");
			
		} // end switch
		
		scan.close();
		
	} // end main
	
	public static void welcome(String name) {
		
		System.out.println("\nWelcome, " + name + ". This program converts a Fahrenheit temperature to celsius.");
		
	}
	
	public static double fahrenheitTocelsius(double fahrenheit) {
		
		double celsius = (fahrenheit - 32) * (5.0/9.0);
		return celsius;
		
	}
	
	

}
