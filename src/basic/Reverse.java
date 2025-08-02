package basic;

public class Reverse {
	public static void main(String[] args) {

//		String original = "shubham";
//		String reversed = reverseString(original);
//		System.out.println("original : " + original);
//		System.out.println("reversed : " + reversed);
//
//	}
//
//	public static String reverseString(String str) {
//		return new StringBuilder(str).reverse().toString();
//	}

		String original = "automation";
		// Using StringBuilder
		String reversed = new StringBuilder(original).reverse().toString();
		System.out.println("Reversed: " + reversed);
	}

//	
//	
//	
//	
//
//	static String reverseString(String str) {
//
//		char[] chars = str.toCharArray();
//		String result = " ";
//
//		for (int i = str.length() - 1; i >= 0; i--) {
//			result += chars[i];
//
//		}
//		return result;
//
//	}
//
//	public static void main(String[] args) {
//		String original = "shubham";
//		String reversed = reverseString(original);
//		System.out.println("orignal string : " + original);
//		System.out.println("reversed string : " + reversed);
//
//	}

}
