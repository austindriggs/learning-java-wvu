
public class Lecture3HW101422 {

	public static void main(String[] args) {

		String stars = "*****";
		String stripes = "=====";

	// Problem 1
		int i = 1;
		while ( i < 5){
		     System.out.print( stars.substring( 0, 1) );
		     System.out.println( stripes.substring( i, 5) );
		      i++;
		}
		
		System.out.print("\n\n\n");
		
	// Problem 2
		int sum = 0, digit;

		int num = 1524;

		do {
			digit = num % 10;
			System.out.println( digit );
			sum += digit;
			num = num / 10;
		} while (num > 10);{

		System.out.println( sum );
		}
		
		System.out.print("\n\n\n");
		
	// Problem 3
		
		int result = 1;
		for ( int j = 1;  j <= 10; j = j * 3){
			result = result * j;
			System.out.println( "When j is " + j + " result is " + result );
		}
		
		System.out.print("\n\n\n");
		
	// Problem 4
		for( int t=0;   t < 5;  t++){
			for( int m =0;   m <= t;  m++){
				System.out.print( (m+1) * t + " ");
			}
		 	System.out.println();
		}




	}

}
