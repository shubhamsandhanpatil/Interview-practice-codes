package infosys_top_20;

import java.util.Scanner;

public class OctalToBinary_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an octal number: ");    //int octal = 123; // Treated as decimal 123, not octal.

		String octal = sc.nextLine();

		try {
			// Convert octal to decimal
			int decimal = Integer.parseInt(octal,8);

			// Convert decimal to binary
			String binary = Integer.toBinaryString(decimal);

			// Display the binary representation
			System.out.println("Binary representation: " + binary);
		} catch (NumberFormatException e) {
			System.out.println("Invalid octal number. Please enter digits between 0 and 7 only.");
		} finally {
			sc.close();
		}
	}}
	
//	public static void main(String [] args) {
//		
//		int octal=5;
//		
//		String binary=Integer.toBinaryString(octal);
//		
//		System.out.println(" "+binary);
//		
//		
//		
//	}
//	
//}


