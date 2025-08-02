import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public interface DuplicateInArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 2, 2, 2, 4, 3, 4, 5, 5));
        HashSet<Integer> seen = new HashSet<>();
        boolean flag = false;

        for (int i = 0; i < arr.size(); i++) {

            if (!seen.contains(arr.get(i))) {
                int count = 0; // Reset count for each element
            
                for (int j = i + 1; j < arr.size(); j++) {
                    if (arr.get(i).equals(arr.get(j))) {
                        count++;
                    }
                }
                if (count > 0) {
                    System.out.println("Duplicate Found = " + arr.get(i) + " and repeated " + (count + 1) + " times");
                    flag = true;
                }
                seen.add(arr.get(i)); // Add the current element to the seen set
            }
        }

        if (!flag) {
            System.out.println("Duplicate not found");
        }
    }
}