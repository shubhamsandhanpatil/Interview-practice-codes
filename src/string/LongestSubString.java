package string;

import java.util.HashMap;

//
//import java.util.HashMap;
//import java.util.Map;
////public class LongestUniqueSubstring {
//
//public class SubString {
//
//    public static int lengthOfLongestSubstring(String s) {
//        Map<Character, Integer> lastSeen = new HashMap<>();
//        int maxLength = 0;
//        int start = 0; // left boundary of sliding window
//
//        for (int i = 0; i < s.length(); i++) {
//            char currentChar = s.charAt(i);
//
//            // If the character was seen and is within the current window
//            if (lastSeen.containsKey(currentChar) && lastSeen.get(currentChar) >= start) {
//                start = lastSeen.get(currentChar) + 1; // move start to right of last occurrence
//            }
//
//            lastSeen.put(currentChar, i); // update the last seen index
//            maxLength = Math.max(maxLength, i - start + 1); // update maximum length
//        }
//
//        System.out.println(" String"+lastSeen.toString());
//        return maxLength;
//    }
//
//    public static void main(String[] args) {
//        String s = "abcdefabcbb";
//        int result = lengthOfLongestSubstring(s);
//        System.out.println("Input: " + s);
//        System.out.println("Length of longest substring without repeating characters: " + result);
//    }
//}

//public class LongestSubString {
//
//	public static int LengthOfLongestSubstring(String str) {
//
//		int start = 0;
//		int maxLength = 0;
//		int maxStart = 0;
//
//		HashMap<Character, Integer> map = new HashMap<>();
//
//		for (int end = 0; end < str.length(); end++) {      // end=i
//
//			char curr = str.charAt(end);    //char at current position i,store it in curr =end la jo char a 
//
//			if (map.containsKey(curr)) {       // map madhe cheeck kra ahe ka 
//				start = Math.max(start, map.get(curr) + 1);  // repeating value ali tr start la update karaycha
//			}
//
//			map.put(curr, end);     
//
//			if (end - start + 1 > maxLength) {
//				maxLength = end - start + 1;
//				maxStart = start; // 🔥 Important fix
//			}
//		}
//
//		String longestSubstring = str.substring(maxStart, maxStart + maxLength);
//		System.out.println("Longest substring is: " + longestSubstring);
//
//		return maxLength;
//	}
//
//	public static void main(String[] args) {
//		String input = "aaabcdefabcbb";
//
//		int ml = LengthOfLongestSubstring(input);
//		System.out.println("Length of the longest substring is: " + ml);
//	}
//}
//
//
////   start = Math.max(start, map.get('a') + 1); // start = max(0, 0+1) = 1
//
//
//
////	if (map.containsKey(curr)) {       
////	    // If the current character was seen before, shrink the window from left
////	    // Move start only if it’s inside the current window
////	    start = Math.max(start, map.get(curr) + 1);  
////	}
////	
////	map.put(curr, end); // Update the last seen position of the character

public class LongestSubString {

	public static int LengthOfLongestSubString(String str) {

		int start = 0;
		int maxLength = 0;
		int maxStart = 0;

		HashMap<Character, Integer> map = new HashMap<>();

		for (int end = 0; end < str.length(); end++) {
			char curr = str.charAt(end);
			if (map.containsKey(curr)) {
				start = Math.max(start, map.get(curr) + 1);

			}
			map.put(curr, end);
			if (end - start + 1 > maxLength) {
				maxLength = end - start + 1;
				maxStart = start;
			}
		}
		String longestSubString = str.substring(maxStart, maxStart + maxLength);
		System.out.println("longest substring is :" + longestSubString);

		return maxLength;
	}

	public static void main(String[] args) {

		String input = "aaabcdefabab";

		int ml = LengthOfLongestSubString(input);
		System.out.println("length of the longest substring is : " + ml);
	}

}