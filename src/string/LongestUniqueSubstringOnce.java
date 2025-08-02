package string;

// Write a Java program to return the longest substring starting from the beginning 

// of a string that has no repeating characters.

import java.util.*;

public class LongestUniqueSubstringOnce {
	public static void main(String[] args) {

		String s = "abcdefabcc";
		Set<Character> seen = new HashSet<>();

		StringBuilder substring = new StringBuilder();

		for (char ch : s.toCharArray()) {

			if (seen.contains(ch)) {
				break; // Stop at first duplicate
			}
			seen.add(ch);
			substring.append(ch);
		}

		System.out.println("Longest unique substring from start: " + substring.toString());
	}
}
