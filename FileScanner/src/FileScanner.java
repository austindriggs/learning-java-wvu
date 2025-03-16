/**
* @author Austin Driggs
* CS 110 Section 010
* While Loops
* 9/29/22
*/

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileScanner {

	public static void main(String[] args) throws IOException {
		
		FileReader inputFile = new FileReader("C:\\Users\\austi\\OneDrive\\Documents\\CS110\\FileScannerRepository\\numbers.txt");
		
		Scanner readFile = new Scanner(inputFile);
		
//		String line = readFile.nextLine();
//		System.out.println(line);
		
		while (readFile.hasNextInt()) {
			int num = readFile.nextInt();
			System.out.println(num);
		}
		
		
		readFile.close();

	}

}
