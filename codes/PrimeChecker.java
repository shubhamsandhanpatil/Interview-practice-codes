import java.util.Scanner;

public class PrimeChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = scanner.nextInt();

		System.out.println("Prime numbers from 1 to " + num + " are:");

		for (int i = 2; i <= num; i++) {
			boolean isPrime = true;

			if (i <= 1) {
				isPrime = false;
			} else {
				for (int j = 2; j <= Math.sqrt(i); j++) {
					if (i % j == 0) {
						isPrime = false;
						break;
					}
				}
			}

			if (isPrime) {
				System.out.println(i);
			}
		}
	}
}

//
//
//| `i` | `Math.sqrt(i)` | `j` values checked | Prime? | Why?                                    |
//| --- | -------------- | ------------------ | ------ | --------------------------------------- |
//| 2   | 1.41           | none               | ✅ Yes  | No `j` values checked (`j=2 > sqrt(2)`) |
//| 3   | 1.73           | none               | ✅ Yes  | No `j` values checked                   |
//| 4   | 2.00           | 2                  | ❌ No   | 4 % 2 == 0                              |
//| 5   | 2.23           | 2                  | ✅ Yes  | 5 % 2 != 0                              |
//| 6   | 2.44           | 2                  | ❌ No   | 6 % 2 == 0                              |
//| 7   | 2.64           | 2                  | ✅ Yes  | 7 % 2 != 0                              |
//| 8   | 2.82           | 2                  | ❌ No   | 8 % 2 == 0                              |
//| 9   | 3.00           | 2, 3               | ❌ No   | 9 % 3 == 0                              |
//| 10  | 3.16           | 2, 3               | ❌ No   | 10 % 2 == 0                             |
