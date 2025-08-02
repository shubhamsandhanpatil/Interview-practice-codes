public class AvgOfPositiveNos {
	public static void main(String[] args) {
		int[] arr = { -3, -2, 0, -7, 25, 12, -11, -46, 8 };
		int sum = 0;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				sum = sum + arr[i];
				count++;
			}
		}

		if (count > 0) {
			double avg = sum / count;
			System.out.println("Average of positive numbers is = " + avg);
		} else {
			System.out.println("No positive number in the array.");
		}
		// System.out.println(count); //3

	}

}

// output:15