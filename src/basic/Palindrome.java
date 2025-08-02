package basic;

public class Palindrome {

	public static void main(String[] args) {
		String str = "Madam";
		String str1 = str.toLowerCase();

		if (isPalindrome(str1)) {
			System.out.println("string is palindrome");
		} else {
			System.out.println("not palindrome");
		}

	}

	public static boolean isPalindrome(String str1) {
		int start = 0;
		int end = str1.length() - 1;
		while (start < end) {
			if (str1.charAt(start) != str1.charAt(end)) {

				return false;
			}
			start++;
			end--;
		}

		return true;
	}
}
