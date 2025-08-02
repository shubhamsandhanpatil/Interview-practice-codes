public class SubarrayWithTargetSum {

    public static void main(String[] args) {
        // Given array and target sum
        int[] arr = {1, 2, 3, 7, 5}; // Example array
        int target = 15; // Example target sum

        findSubarrayWithTargetSum(arr, target);
    }

    public static void findSubarrayWithTargetSum(int[] arr, int target) {
        int start = 0, end = 0, sum = 0;

        while (end < arr.length) {
            sum += arr[end];

            // Slide the window when the sum exceeds the target
            while (sum > target && start <= end) {
                sum -= arr[start++];
            }

            // Check if we found the target sum
            if (sum == target) {
                System.out.print("Subarray found: ");
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println(); // Move to the next line
                return;
            }
            end++;
        }

        System.out.println("No subarray found with the given target sum.");
    }
}
