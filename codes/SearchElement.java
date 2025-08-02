	
	import java.util.Scanner;
	
	public class SearchElement {
	    public static void main(String[] args) {
	        int[] arr = { 66, 22, 43, 50, 83, 28, 7 };
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the element to search  : ");
	
	        int target = sc.nextInt();
	        boolean found = false;
	
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == target) {
	                found = true;
	                System.out.println("Element found at index " + i);
	                break;
	            }
	            else {
	        }
//	        if (!found) {
	            System.out.println("element not found");
	        }
	    }
	}

