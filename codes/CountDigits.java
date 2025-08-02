import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read an integer input from the user
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Convert the integer to a String and use Streams to count the digits
        long count = Integer.toString(Math.abs(number))
                .chars() // Converts the string to an IntStream of characters
                .count(); // Count the number of characters

        // Print the result
        System.out.println("Number of digits: " + count);
    }
}
