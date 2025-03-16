/**
* @author Austin Driggs
* CS 110 Section 010
* While Loops
* 9/29/22
*/

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MixedFileScanner {

	public static void main(String[] args) throws IOException {
		
		FileReader inputFile = new FileReader("C:\\Users\\austi\\OneDrive\\Documents\\CS110\\FileScannerRepository\\NameAgeYear.txt");
		
		Scanner readFile = new Scanner(inputFile);
		
		String line, fName, lName;
		int age;
		double test;
		
//		System.out.println(line);
		
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
