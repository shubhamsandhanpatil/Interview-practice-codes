
//Anagram-----"listen" ↔ "silent", "earth" ↔ "heart" :Rearrangement of characters of one word/phrase to form another.
//Palindrome ----"madam", "racecar", "level" : Reads the same forward and backward.

public class PalindromeCheck {
//	public static boolean isPalindrome(String str) {
//		int start = 0;
//		int end = str.length() - 1;
//
//		while (start < end) {
//			if (str.charAt(start) != str.charAt(end)) {
//				return false;
//			}
//			start++;
//			end--;
//		}
//		return true;
//	}
//
//	public static void main(String[] args) {
//
//		String word = "madam";
//		if (isPalindrome(word)) {
//			System.out.println(word + " is a Palindrome");
//		} else {
//			System.out.println(word + " is not a Palindrome");
//		}
//	}
//}

	public static void main(String[] args) {
		String str = "Anna";
            
		if (isPalindrome(str.toLowerCase())) {
			System.out.println(str + " is a palindrome");
		} else {
			System.out.println(str + " is not a palindrome ");
		}

	}

	private static boolean isPalindrome(String str) {
		int start = 0;
		int end = str.length() - 1;
		while (start < end) {
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}