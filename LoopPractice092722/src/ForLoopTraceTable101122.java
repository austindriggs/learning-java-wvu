
public class ForLoopTraceTable101122 {

	public static void main(String[] args) {
		
// Be able to use a trace table for:
		
		int i, j;
		
		for ( i = 1; i <= 3; i++) {
			
			for (j = 1; j <= 5; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}


		//	 	i		j		console			post condition j++ <=5
				
		//		1		1		1
		//				2		1 1
		//				3		1 1 1 
		//				4		1 1 1 1
		//				5		1 1 1 1 1
		//				6
		//		2		1		2
		//				2		2 2 
		//				3		2 2 2 
		//				4		2 2 2 2 
		//				5		2 2 2 2 2
		//				6
		//		3		1		3
		//				2		3 3 
		//				3		3 3 3 
		//				4		3 3 3 3 
		//				5		3 3 3 3 3 
		//				6
		//		4
				
		// Final Output:
		//		 				1 1 1 1 1
		//						2 2 2 2 2
		//						3 3 3 3 3 
		
		System.out.println("\n");
		
// Be able to use a trace table for:

		final int m = 3;
		final int n = 3;
		
		for (i = 1; i <= m; i++) {
			for (j = 1; j <= n; j++) {
				System.out.print( (m * (i-1) + j));
			} // End inner loop
			
			System.out.println();
			
		} // End outer loop
		
		// 		i		j		m		n		output
		//						3		3
		//		1		1						1
		//				2						1 2
		//				3						1 2 3 
		//				4
		//		2		1						4
		//				2						4 5
		//				3						4 5 6
		//				4
		//		3		1						7 
		//				2						7 8 
		//				3						7 8 9 
		//				4
		//		4
		

	}

}
