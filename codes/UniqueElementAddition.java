public class UniqueElementAddition {
public static void main(String[] args) {
        int[] arr = { 10, 15, 15, 20, 10, 30 };
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;

            // Check if the element is unique
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }

            // If the element is unique, add it to the sum
            if (isUnique) {
                sum += arr[i];
            }
        }

        System.out.println("Sum of unique elements: " + sum);
    }
}




// *************************************

// import java.util.HashMap;

// public class Main {
//     public static void main(String[] args) {
//         int[] arr = {10, 15, 15, 20, 10, 30};

//         HashMap<Integer, Integer> map = new HashMap<>();
//         int sum = 0;

//         // Populate the hashmap with the frequency of each element
//         for (int i = 0; i < arr.length; i++) {
//             if (map.containsKey(arr[i])) {
//                 map.put(arr[i], map.get(arr[i]) + 1);
//             } else {
//                 map.put(arr[i], 1);
//             }
//         }

//         // Iterate over the hashmap to calculate the sum of unique elements
//         for (int key : map.keySet()) {
//             if (map.get(key) == 1) {
//                 sum += key; // Corrected the sum operation
//             }
//         }

//         System.out.println("Sum of unique elements: " + sum);
//     }
// }
