package basic;

import java.util.Scanner;

public class Fibo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num to fibonacchi nums to print");
		int count = sc.nextInt();

		if (count < 0) {
			System.out.println("please enter the positive num");

		} else {
			printfibo(count);
		}

	}

	static void printfibo(int count) {

		int n1 = 0, n2 = 1, n3;
		System.out.print(n1 + " " + n2);

		for (int i = 2; i < count; ++i) {
			n3 = n1 + n2;

			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;
		}
		System.out.println();
	}

}
