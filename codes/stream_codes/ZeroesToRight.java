package stream_codes;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ZeroesToRight {
	public static void main(String[] args) {

		int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0, 3 };
		
		int[] result = IntStream.concat(
				        Arrays.stream(arr).filter(num -> num != 0).sorted().distinct(),
						Arrays.stream(arr).filter(num -> num == 0)).toArray();

	System.out.println(" zeroes to right : "+ Arrays.toString(result));
	
	
	}
}

//o/p      zeroes to right : [1, 2, 3, 4, 5, 3, 0, 0, 0]

//         zeroes to right : [1, 2, 3, 4, 5, 0, 0, 0]
