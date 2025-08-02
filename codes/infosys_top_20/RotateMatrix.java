package infosys_top_20;

//public class RotateMatrix {

//
//    // Function to rotate the matrix by 90 degrees clockwise
//    public static void rotateMatrix(int[][] matrix) {
//        int n = matrix.length;
//
//        // Step 1: Transpose the matrix
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {       //j=i+1 cpz to avoid repeatation of swap
//                // Swap matrix[i][j] with matrix[j][i]
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[j][i];
//                matrix[j][i] = temp;
//            }
//        }
//
//        // Step 2: Reverse each row
//        for (int i = 0; i < n; i++) {
//            int left = 0, right = n - 1;
//            
//            while (left < right) {
//                // Swap elements in the row
//                int temp = matrix[i][left];
//                matrix[i][left] = matrix[i][right];
//                matrix[i][right] = temp;
//                left++;
//                right--;
//            }
//        }
//    }
//
//    // Function to print the matrix
//    public static void printMatrix(int[][] matrix) {
//        for (int[] row : matrix) {
//            for (int val : row) {
//                System.out.print(val + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        int[][] matrix = {
//            {1, 2, 3},
//            {4, 5, 6},
//            {7, 8, 9}
//        };
//
//        System.out.println("Original Matrix:");
//        
//        printMatrix(matrix);
//        rotateMatrix(matrix);
//
//        System.out.println("\nMatrix after 90-degree rotation:");
//        printMatrix(matrix);
//    }
//}

public class RotateMatrix {

	public static void rotateMatrix(int[][] matrix) {
		int n = matrix.length;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {

				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;

			}
		}

//				reverse the row
		for (int i = 0; i < n; i++) {
			int left = 0, right = n - 1;
			while (left < right) {
				int temp = matrix[i][left];
				matrix[i][left] = matrix[i][right];
				matrix[i][right] = temp;

				left++;
				right--;
			}

		}
	}

	public static void printMatrix(int[][] matrix) {

		for (int[] row : matrix) {
			for (int val : row) {
				System.out.print(val + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

//		System.out.println("Original matrix : \n " + matrix); xxxxxxxxxxxxxxxxxxx
		System.out.println("Original matrix : \n ");       //right
		printMatrix(matrix);
		rotateMatrix(matrix);
		System.out.println("\nMatrix after 90 degree rotation : \n ");
		printMatrix(matrix);
	}
}