import java.util.Arrays;

//  straight reverse are same ; make lowercase ; sort it ; check equality 


public class AnagramChecker {
//	public static void main(String[] args) {
//		String str1 = "listen";
//		String str2 = "Silent";
//
////		String s1 = str1.toLowerCase();
////		String s2 = str2.toLowerCase();
//
//		char[] charArray1 = str1.toLowerCase().toCharArray();
//		char[] charArray2 = str2.toLowerCase().toCharArray();
//
//		Arrays.sort(charArray1);
//		Arrays.sort(charArray2);
//
//		if (Arrays.equals(charArray1, charArray2)) {
//			System.out.println(str1 + " and " + str2 + " are anagram");
//		} else {
//			System.out.println(str1 + " and " + str2 + " are not anagram");
//		}
//	}
//}

// ********************************************

// if (areAnagrams(str1, str2)) {
// System.out.println(str1 + " and " + str2 + " are anagrams.");
// } else {
// System.out.println(str1 + " and " + str2 + " are not anagrams.");
// }
// }

// public static boolean areAnagrams(String str1, String str2) {
// // Remove spaces and convert to lowercase
// str1 = str1.replaceAll("\\s", "").toLowerCase();
// str2 = str2.replaceAll("\\s", "").toLowerCase();

// // Check if lengths are different
// if (str1.length() != str2.length()) {
// return false;
// }

// // Convert strings to character arrays and sort them
// char[] charArray1 = str1.toCharArray();
// char[] charArray2 = str2.toCharArray();
// Arrays.sort(charArray1);
// Arrays.sort(charArray2);

// // Compare sorted arrays
// return Arrays.equals(charArray1, charArray2);
// }
// }

/*
 * Use \\d to match digits. Use \\w to match word characters. Use \\W to match
 * non-word characters. Use \\t, \\n, and \\r for specific whitespace characters
 * like tabs, newlines, and carriage returns.
 */

/************************************************************* */

// import java.util.Arrays;

// public class AnagramChecker {
// public static void main(String[] args) {
// String str1 = "listen";
// String str2 = "silent";

// if (areAnagrams(str1, str2)) {
// System.out.println(str1 + " and " + str2 + " are anagrams.");
// } else {
// System.out.println(str1 + " and " + str2 + " are not anagrams.");
// }
// }

// public static boolean areAnagrams(String str1, String str2) {
// // Remove spaces and convert to lowercase
// str1 = str1.replaceAll("\\s", "").toLowerCase();
// str2 = str2.replaceAll("\\s", "").toLowerCase();

// // Check if lengths are different
// if (str1.length() != str2.length()) {
// return false;
// }

// // Convert strings to character arrays and sort them
// char[] charArray1 = str1.toCharArray();
// char[] charArray2 = str2.toCharArray();
// Arrays.sort(charArray1);
// Arrays.sort(charArray2);

// // Use two pointers to compare sorted arrays
// int i = 0, j = 0;
// while (i < charArray1.length && j < charArray2.length) {
// if (charArray1[i] != charArray2[j]) {
// return false;
// }
// i++;
// j++;
// }

// return true;
// }
// }
	
	
	
	public static void main(String [] args) {
		String str1="Listen";
		String str2="Silent";
		
		char[] arr1=str1.toLowerCase().toCharArray();
		char[] arr2=str2.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1,arr2)) {
			System.out.println("Strings are anagram");
		}else {
			System.out.println("Strings are not anagram");
		}
	}

}

