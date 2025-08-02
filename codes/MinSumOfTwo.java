
import java.util.Arrays;

 public class MinSumOfTwo {

    public static void findMinSumPair(int[] arr) {
    Arrays.sort(arr);

    int left = 0; //two pointers
    int right = arr.length - 1;
    int minSum = Integer.MAX_VALUE;         /*minSum is set to max value so when compare the sum will be
                                              compare to max and other will be less than that;*/
    int minLeft = left, minRight = right;       /*minLeft and minRight will hold the indices of 
                                            the pair that results in the minimum sum.*/
   

    // traverse
    while (left < right) {
    int sum = arr[left] + arr[right];

    if (Math.abs(sum) < Math.abs(minSum)) {
    minSum = sum;
    minLeft = left;
    minRight = right;
    }

    if (sum < 0) {
    left++;
    } else {
    right--;
    }
    }

    System.out.println("the pair with the minimum sum is : ( " + arr[minLeft] +
    ", " + arr[minRight] + ")");
    System.out.println("The minimum sum is: " + minSum);
    }

    public static void main(String[] args) {
    int[] arr = { 1, 60, -10, 70, -80, 85 };
    findMinSumPair(arr);

    }
    }


// ----------------------------------------------------------------------------------------------------------

//     // Method to find the smallest two numbers and their sum
//     public static int[] bruteForce(int[] arr) {
//         // Initialize the minimum and second minimum values
//         int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;

//         // Loop through the array to find the two smallest elements
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] < min) {
//                 secondMin = min; // Update second smallest
//                 min = arr[i]; // Update smallest
//             } else if (arr[i] < secondMin) {
//                 secondMin = arr[i]; // Update second smallest if current element is larger than min but smaller than
//                                     // secondMin
//             }
//         }

//         // Create an array to return the result: [min, secondMin, sum]
//         int[] result = new int[3];
//         result[0] = min;
//         result[1] = secondMin;
//         result[2] = min + secondMin; // Sum of the two minimum numbers

//         return result;
//     }

//     public static void main(String[] args) {
//         int[] x = { 12, 48, 96, 49, 51, 73, 23, 11, 96, -10 };
//         int[] result = bruteForce(x);

//         System.out.println("The numbers with the minimum sum are: " + result[0] + " and " + result[1]);
//         System.out.println("The sum of the two numbers is: " + result[2]);

//     }

// }