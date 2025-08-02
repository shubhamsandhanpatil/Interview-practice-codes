package infosys_top_20;

public class ZeroesToRight {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 2, 3, 0, 4, 5, 0, };
		
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;              // why here only arr[j] ptr is at start at 0 index & arr[i] start from 1 coz !=0
			}
		}
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
	}
}
