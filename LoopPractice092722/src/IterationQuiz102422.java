
public class IterationQuiz102422 {

	public static void main(String[] args) {
//		What is the output of the following statement:
		
		double y = 1, x = 1;
		int i = 0;
		
		while (y < 1.8) {
			x = x / 2;
			y = y + x;
			i++;
		}
		System.out.println("x = " + x + ". y = " + y + ". i = " + i + ".");
		
		System.out.println("\n\n");

//		What is the result / output of the following code:
		
		int s = 1, n = 1;
		
		do {
			s = s + n;
			n++;
			System.out.println("s = " + s + ". n = " + n + ".");
		} while (s < 2 * n);
		
	}

}
