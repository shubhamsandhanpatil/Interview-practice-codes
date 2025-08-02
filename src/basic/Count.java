//package basic;
//
//public class Count {
//
//	public static void main(String[] args) {
//
//		int[] arr = { 1, 1, 0, 1, 1, 1, 1, 0 };
//		int count = 0;
//			int count1 = 0;
//		// int max= 0;
//
//		for (int i : arr)
//			if (i == 1) {
//				count++;
//			}
//
//			for (int i : arr)
//				if (i == 0) {
//					count1++;
//				}
//
//		// if(count>=max){
//		// max=count;
//
//		// }else{
//		// max=count;
//		// count=0;
//		// }
//		System.out.println("count of 1 : "+count);
//		System.err.println("count of 0 : "+count1);
//	}
//}

package basic;

import java.util.HashMap;
import java.util.Map;

public class Count {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 0, 1, 1, 1, 1, 0, 2, 2, 3 };

		Map<Integer, Integer> countMap = new HashMap<>();

		for (int num : arr) {
			countMap.put(num, countMap.getOrDefault(num, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
			System.out.println("Count of " + entry.getKey() + " : " + entry.getValue());
		}
	}
}
