package infosys_top_20;

import java.util.HashSet;
import java.util.Set;

public class PrintUnique {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 3, 4, 5, 6, 5 };
//		int j = 0;

//		for (int i = 0; i < arr.length; i++) {
//
//			if (arr[i] != arr[j]) {
//				j++; // why here only j++ if arr[i] ptr is not equalto arr[j] ptr so if equal same
//						// swap
//				int temp = arr[i];
//				arr[i] = arr[j];
//				arr[j] = temp;
////                      j++      arr[j] ptr is at start at 0 index 
//			}
//		}
//		for (int k = 0; k < j; k++) {
//			System.out.print(arr[k] + " ");
//
//		}

		Set<Integer> set = new HashSet<>();

		for (int num : arr) {
			set.add(num);
		}
		System.out.print(set);

	}
}
