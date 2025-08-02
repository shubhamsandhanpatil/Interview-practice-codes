package basic;

public class Max {

	public static void main(String[] args) {

		int[] nums = { 2, 3, 1, 2, 3, 4, 5, 3, 6, 7, 6, 8, 9, 10 };
		int max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {           //just chage sign for min and word min

				max = nums[i];
			}
		}
		System.out.println(max);
	}

}
