public class Count1s {
	public static void main(String[] args) {

		int[] arr = { 1, 1, 0, 1, 1, 1, 1, 0 };
		int count = 0;
//		int count1 = 0;
		// int max= 0;

		for (int i : arr)
			if (i == 1) {
				count++;
			}

//		for (int i : arr)
//			if (i == 0) {
//				count1++;
//			}

		// if(count>=max){
		// max=count;

		// }else{
		// max=count;
		// count=0;
		// }
		System.out.println(count);
	}
}