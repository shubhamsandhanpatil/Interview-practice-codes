package infosys_top_20;

import java.util.Scanner;

public class NextFiveLetter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter te character ");
		char ch = sc.next().charAt(0);       //for char

		for (int i = 0; i < 5; i++) {
			ch++;
			if (ch > 'z') {
				ch = 'A';
				System.out.println(ch + " ");
			} else if (ch > 'Z' && ch < 'a') {
				ch = 'a';
				System.out.println(ch + " ");

			} else {
				System.out.println(ch + " ");
			}
		}

	}

}
