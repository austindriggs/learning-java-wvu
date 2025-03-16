/**
* @author Austin Driggs
* CS 110 Section 010
* Lab 6 Problem 1
* 9/28/22
*/

import java.util.Scanner;

public class WeatherForecast {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter in the day of the week you wish to see the weather for: ");
		String day = scan.nextLine().toLowerCase();
		
		switch (day){
		case "monday":
			System.out.print("\nPartly cloudy skies.");
			break;
		case "tuesday":
			System.out.print("\nThunderstorms throughout the day.");
			break;
		case "wednesday":
			System.out.print("\nExpect snow and cold temperatures.");
			break;
		case "thursday":
			System.out.print("\nTornado watch and heavy gusts of wind.");
			break;
		case "friday":
			System.out.print("\nCloudy skies");
			break;
		case "saturday":
		case "sunday" :
			System.out.print("\nSunny and warm temperatures");
			break;
		default:
			System.out.print("\nERROR: Check spelling or try entering in a day Monday-Sunday.");
		}

		scan.close();
		
	}

}
