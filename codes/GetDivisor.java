// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

// public class GetDivisor {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the num : ");
//         int input = sc.nextInt();

//         List<Integer> list = new ArrayList<>();
//         for (int i = 1; i <= 30; i++) {
//         list.add(i);
//         }

//         // Find and print divisors from the list
//         System.out.println("Divisors of " + input + " from the list are: ");
//         for (int num : list) {
//           if (input % num == 0) {
//             // System.out.println(list + "is divisible by " + num + " ");
//             System.out.print(num+" ");
//           }
//         }

//     }
// }


// ****************************************************************************
// using streams


// import java.util.List;
// import java.util.Scanner;
// import java.util.stream.Collectors;
// import java.util.stream.IntStream;

// public class GetDivisor {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         int input = sc.nextInt();

//         // Using Stream to get divisors from 1 to 30
//         List<Integer> divisors = IntStream.rangeClosed(1, 30)
//                                            .filter(num -> input % num == 0)
//                                            .boxed()
//                                            .collect(Collectors.toList()); // Collect as List

//         // Print the list of divisors
//         System.out.println("Divisors of " + input + " from the list are: ");
//         System.out.println(divisors);

//         sc.close();
//     }
// }




// Integer[] divisorArray = IntStream.rangeClosed(1, 30)
//                                   .filter(num -> input % num == 0)
//                                   .boxed()
//                                   .toArray(Integer[]::new); // Collect as Array





        // // Convert List to Array and print
        // Integer[] divisorArray = divisors.toArray(new Integer[0]);
        // System.out.println("Divisors of " + input + " from the list are: ");
        // System.out.println(java.util.Arrays.toString(divisorArray));




import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GetDivisor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int input = sc.nextInt();

        // Define a list of random numbers
        List<Integer> list = Arrays.asList(2, 3, 4, 5, 6, 14, 15, 18, 20, 30);

        // Use Stream to get divisors from the list
        List<Integer> divisors = list.stream()
                                     .filter(num -> input % num == 0) // Filter divisors of input
                                     .collect(Collectors.toList());   // Collect as List

        // Print the list of divisors
        System.out.println("Divisors of " + input + " from the random list are: ");
        System.out.println(divisors);

        sc.close();
    }
}
