/*
* @author Austin Driggs
* CS 111 Section 002
* Lab Assignment 3
* Jakob Kaivo
* 1/23/23
* Purpose: Implement the Student class and successfully pass all tests for each method in StudentTest
*/

public class Student {
	
	/*
	 * Class Name: Student
	 * Purpose: The class's purpose is to use the methods in order to create an array for each student, with the amount of assignments
	 * that they have completed, as well as the grade out of 100.0 for that assignment.
	 * Exceptions: None
	 */
	
	private String name;
	private int assignments;
	private double[] grades;
	
	public Student(String name, int assignments) {

		/*
		 * Method Name: Student
		 * Purpose: Constructor
		 * Parameters: String name, int assingments
		 * Preconditions: None
		 * Postconditions: None
		 * Exceptions: None
		 */
		
		this.name = name;
		this.assignments = assignments;
		this.grades = new double[assignments];
		
	}

	public void setName(String name) {
		
		/*
		 * Method Name: setName
		 * Purpose: Changes the Student's name.
		 * Parameters: String name
		 * Preconditions: None
		 * Postconditions: sets the students name to the new name provided as the parameter
		 * Exceptions: None
		 */
		
		this.name = name;
		
	}

	public String getName() {
		
		/*
		 * Method Name: getName
		 * Purpose: Returns the Student's name as a String.
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: returns the student's name
		 * Exceptions: None
		 */
		
		return this.name;
	}

	public void setGrade(int assignment, double grade) {
		
		/*
		 * Method Name: setGrade
		 * Purpose: Takes two parameters: The assignment number (starting from 0) and the grade (a double typically
		 * between 0.0 and 100.0, but with no fixed upper bound).
		 * Parameters: int assignment, double grade
		 * Preconditions: assignment number needs to be in bounds of the index. grade should be greater than zero.
		 * Postconditions: the grade at index assignment will be set to the new grade
		 * Exceptions: out of bounds for the array
		 */
	
		this.grades[assignment] = grade;
		
	}

	public double getGrade(int assignment) {

		/*
		 * Method Name: getGrade
		 * Purpose: With an integer parameter, returns the grade from an individual assignment
		 * Parameters: int assignment
		 * Preconditions: assignment number needs to be in bounds of the index
		 * Postconditions: return the grade at index assingment
		 * Exceptions: out of bounds for the array
		 */
		
		return grades[assignment];
		
	}

	public char getLetterGrade(int assignment) {
		
		/*
		 * Method Name: getLetterGrade
		 * Purpose: Returns a single character for the numeric grade using the following scale: 90.0 or higher: 
		 * 'A'; 80.0 to 90.0: 'B'; 70.0 to 80.0: 'C'; 60.0 to 70.0: 'D'; less than 60.0: 'X'. With an integer parameter, 
		 * returns the letter grade from an individual assignment
		 * Parameters: int assignment
		 * Preconditions: assignment number needs to be in bounds of the index
		 * Postconditions: return letterGrade
		 * Exceptions: out of bounds for the array
		 */
		
		char letterGrade = 'X';
		
		if (grades[assignment] >= 90.0) {
			letterGrade = 'A';
		}
		else if (grades[assignment] >= 80.0) {
			letterGrade = 'B';
		}
		else if (grades[assignment] >= 70.0) {
			letterGrade = 'C';
		}
		else if (grades[assignment] >= 60.0) {
			letterGrade = 'D';
		}
		else {
			letterGrade = 'X';
		}
		
		return letterGrade;
	}

	public double getGrade() {
		
		/*
		 * Method Name: getGrade
		 * Purpose: With no parameters, returns the average (total of all grades divided by number of assignments) grade
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: returning the average grade
		 * Exceptions: None
		 */
		
		double sum = 0;
		for (int i = 0; i < grades.length; i++) {
			sum += grades[i];
		}
		
		return sum / (double) grades.length;
	}

	public char getLetterGrade() {

		/*
		 * Method Name: getLetterGrade
		 * Purpose: Returns a single character for the numeric grade using the following scale: 90.0 or higher: 
		 * 'A'; 80.0 to 90.0: 'B'; 70.0 to 80.0: 'C'; 60.0 to 70.0: 'D'; less than 60.0: 'X'. With no parameters, 
		 * returns the letter grade for the Student's average grade
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: returning the average letter grade
		 * Exceptions: None
		 */
		
		double sum = 0;
		for (int i = 0; i < grades.length; i++) {
		sum += grades[i];
		}
		
		double average = sum / grades.length;
		
		char letterGrade = 'X';
		
		if (average >= 90.0) {
			letterGrade = 'A';
		}
		else if (average >= 80.0) {
			letterGrade = 'B';
		}
		else if (average >= 70.0) {
			letterGrade = 'C';
		}
		else if (average >= 60.0) {
			letterGrade = 'D';
		}
		else {
			letterGrade = 'X';
		}
		
		return letterGrade;
	}
	
}