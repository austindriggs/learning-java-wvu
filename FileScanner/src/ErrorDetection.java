/**
* @author Austin Driggs
* CS 110 Section 010
* While Loops
* 9/29/22
*/

// This is from MixedFileScanner.java

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ErrorDetection {

	public static void main(String[] args) throws IOException {
		
//		FileReader inputFile = new FileReader("C:\\Users\\austi\\OneDrive\\Documents\\CS110\\FileScannerRepository\\NameAgeYear.txt"); change this to null
		FileReader inputFile = null;
		
//		Scanner readFile = new Scanner(inputFile); change this to null
		Scanner readFile = null;
		
		String line, fName, lName;
		int age;
		double test;
		
		
		Scanner scan = new Scanner(System.in);
		
// THIS IS THE ERROR DETECTION
		boolean goodFileName = false;
		
		while (!goodFileName) {
			System.out.println("Please enter the name of a file in your repository:");
			String name = scan.next();
			
			try {
				inputFile = new FileReader("C:\\Users\\austi\\OneDrive\\Documents\\CS110\\FileScannerRepository\\" + name);
				readFile = new Scanner(inputFile);
				goodFileName = true;
			}
			catch (IOException e) {
				System.out.println("You input an incorrect file name.");
			}
		}
		
		while (readFile.hasNext()) {
			fName = readFile.next();
			lName = readFile.next();
			age = readFile.nextInt();
			test = readFile.nextDouble();
			
			System.out.println(fName + " " + lName + " " + age + " " + test);
			
		}
		
		
		readFile.close();

	}

}
