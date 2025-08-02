package infosys_top_20;

//avg of positive integers
//sum 
//count     
public class PositiveAvg {

	public static void main(String[] args) {

		int[] arr = { -3, -2, 0, -7, 25, 12, -11 };
		int sum = 0;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {                            //(arr[i] < 0)  for negative
				sum = sum + arr[i];
				count++;
			}
		}
		if (count > 0) {
			double avg = (double) sum / count;
			System.out.println("the avg of positive intgers is : " + avg);
		} else {
			System.out.println("There are no positive integers in the Array");
		}
	}

}
