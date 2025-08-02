import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = fact(num);
        System.out.println(result);

    }

    public static int fact(int num) {
        if (num == 0 || num == 1) {
            return 1;

        } else {
            return num * fact(num - 1);

        }
    }

}




// if we do not declafe the fact method as stactic u need to create an object
// ************************************
// import java.util.Scanner;

// public class Factorial {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         // Create an instance of the Factorial class
//         Factorial factorial = new Factorial();

//         // Call the instance method using the object
//         int result = factorial.fact(num);
//         System.out.println(result);
//     }

//     // Instance method (non-static)
//     public int fact(int num) {
//         if (num == 0 || num == 1) {
//             return 1;
//         } else {
//             return num * fact(num - 1);
//         }
//     }
// }
