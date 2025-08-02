package stream_codes;

	import java.util.Arrays;

	public class StreamDistinct {

		public static void main(String[] args) {

			int arr[] = { 1, 1, 2, 3, 2, 3, 4, 5, 6, 5, 4, 1 };

			int[] unique = Arrays.stream(arr).distinct().toArray();

			System.out.println(arr);
			System.out.println(" unique numbers are : " + Arrays.toString(unique));
		}

	}



