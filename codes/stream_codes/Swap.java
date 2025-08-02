package stream_codes;

public class Swap {
	public static void main(String[] args) {

		int a = 10, b = 20;

		System.out.print("a = " + a);
		System.out.println(" , b = " + b);

		a = a + b - (b = a);

		System.out.print(" a = " + a);
		System.out.print(" , b = " + b);
	}
}
