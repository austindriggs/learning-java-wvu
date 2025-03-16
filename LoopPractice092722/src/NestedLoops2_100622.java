public class NestedLoops2_100622 {

	public static void main(String[] args) {

//	Write a program that prints a multiplication table from 1-12

		for ( int i = 1; i <= 12; i++ ) {
			for ( int j = 1; j <= 12; j++ ) {
				System.out.printf("%10d", (j * i));
			}
			System.out.println();
		
		}

	}

}
