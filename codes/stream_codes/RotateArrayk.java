package stream_codes;

import java.util.Arrays;
import java.util.stream.IntStream;
public class RotateArrayk {

	
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5}; 
	        int k = 2;
	        k %= arr.length;
	        int[] rotated = IntStream.concat(
	        		Arrays.stream(arr, arr.length - k, arr.length), 
	        		Arrays.stream(arr, 0, arr.length - k)).toArray();
	        System.out.println(Arrays.toString(rotated));
	    }
	}