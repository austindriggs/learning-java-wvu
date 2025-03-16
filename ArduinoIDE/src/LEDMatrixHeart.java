import java.util.Arrays;

public class LEDMatrixHeart {

	public static void main(String[] args) {
		 
		byte[] i           	=     {0x7E,0x7E,0x18,0x18,0x18,0x18,0x7E,0x7E};

		byte[] smallDot	   	=     {0x00,0x00,0x3C,0x3C,0x3C,0x18,0x00,0x00,};
		byte[] smallHeart  	=     {0x00,0x24,0x7E,0x7E,0x7E,0x3C,0x18,0x00};
		byte[] heart	    =     {0x66,(byte)0xFF,(byte)0xFF,(byte)0xFF,(byte)0xFF,0x7E,0x3C,0x18}; 
		byte[] bigHeart   	=     {0x66,(byte)0xFF,(byte)0xFF,(byte)0xFF,(byte)0xFF,(byte)0xFF,0x7E,0x3C};
		byte[] bigDot     	=     {(byte)0xFF,(byte)0xFF,(byte)0xFF,(byte)0xFF,(byte)0xFF,(byte)0xFF,(byte)0xFF,(byte)0xFF};

		byte[] u	          	=     {0x66,0x66,0x66,0x66,0x66,0x66,0x7E,0x7E};

		byte[] smile	      	=     {0x00,0x00,0x24,0x00,0x42,0x3C,0x00,0x00}; 

		      printByte(i);
		      System.out.println();

		      printByte(smallDot);
		      System.out.println();
		      printByte(smallHeart);
		      System.out.println();
		      printByte(heart);
		      System.out.println();
		      printByte(bigHeart);
		      System.out.println();
		      printByte(bigDot);
		      System.out.println();
		      printByte(bigHeart);
		      System.out.println();
		      printByte(heart);
		      System.out.println();

		      printByte(u);
		      System.out.println();

		      printByte(smile);
		      System.out.println();
		      
	}
	
	public static void printByte(byte[] print) {

		for (int i = 0; i < 8; i++) {
			for (int j = 0; print[j] < 8; j++) {
				System.out.print(print[j]);
			}
			System.out.println();
		}
		
	}
	
}
