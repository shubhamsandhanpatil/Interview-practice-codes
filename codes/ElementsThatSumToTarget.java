import java.util.ArrayList;
import java.util.List;

public class ElementsThatSumToTarget {

    public static void main(String[] args) {
        // Given array and target sum
        int[] arr = {1, 2, 3, 7, 5, 6, 8}; // Example array
        int target = 12; // Example target sum

        findElementsThatSumToTarget(arr, target);
    }

    public static void findElementsThatSumToTarget(int[] arr, int target) {
        List<Integer> result = new ArrayList<>();
        findCombination(arr, target, 0, result);
    }

    private static void findCombination(int[] arr, int target, int index, List<Integer> result) {
        // Base case: If target is met
        if (target == 0) {
            System.out.println("Elements found: " + result);
            return;
        }

        // If target is negative or index exceeds length, return
        if (target < 0 || index >= arr.length) {
            return;
        }

        // Include the current element
        result.add(arr[index]);
        findCombination(arr, target - arr[index], index + 1, result);

        // Exclude the current element and backtrack
        result.remove(result.size() - 1);
        findCombination(arr, target, index + 1, result);
    }
}
