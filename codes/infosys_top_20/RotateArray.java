package infosys_top_20;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int n = nums.length;
		int k = 3;

		reverse(nums, 0, n - 1);   //rev whole arr ==  7654321
		reverse(nums, 0, k - 1);    // after rev first 3  ==567_4321
		reverse(nums, k, n - 1);    //  567_4321  == 567_1234

		System.out.println(" " + Arrays.toString(nums));

	}

	public static void reverse(int[] nums, int start, int end) {

		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;

		}
	}

}
