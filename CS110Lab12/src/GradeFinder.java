/**
* @author Austin Driggs
* CS 110 Section 010
* Lab 12 Problem 2
* 11/9/22
*/

import java.util.Scanner;

public class GradeFinder {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input your %'s for: Exam 1, Exam 2, HW, and Lab, pressing enter after each grade");
		double[] grades = {scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble()};
		
		System.out.println("Please enter the letter grade you wish to recieve in the class:");
		char letterGrade = scan.next().charAt(0);
		double numGrade = 0;
		
		switch (letterGrade) {
			case('a'):
			case('A'):
				numGrade = 90.0;
				break;
			case('b'):
			case('B'):
				numGrade = 80.0;
				break;
			case('c'):
			case('C'):
				numGrade = 70.0;
				break;
			case('d'):
			case('D'):
				numGrade = 60.0;
				break;
			default:
				System.out.println("Invalid Input: Maybe shoot for a higher grade?");	
		}
		
		double score = calculatePercentNeeded(grades, numGrade);
		
		System.out.printf("You will need a score of %.2f%% on the next exam to receive a(n) %s in the class.", score, letterGrade); 
		
		scan.close();

	} // end main
	
	public static double calculatePercentNeeded(double[] grades, double numGrade) {
		
		double score = ( numGrade - 
							( (grades[0] * 0.2) + (grades[1] * 0.2) + (grades[2] * 0.1) + (grades[3] * 0.3) )
						) / 0.2;
		
		return score;
		
	} // end calculatePercentNeeded
	
}
