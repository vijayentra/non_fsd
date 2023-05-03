//WAP to perform Matrix addition using multi-dimensional array

package day2;

public class Que2 {
	 public static void main(String[] args) {
	        int row = 2, col = 3;
	        int[][] m1 = { {2, 3, 4}, {5, 2, 3} };
	        int[][] m2 = { {-4, 5, 3}, {5, 6, 3} };

	        // Adding Two matrices
	        int[][] sum = new int[row][col];
	        for(int i = 0; i < row; i++) {
	            for (int j = 0; j < col; j++) {
	                sum[i][j] = m1[i][j] + m2[i][j];
	            }
	        }

	        // Displaying the result
	        System.out.println("Sum of two matrices is: ");
	        for(int[] r : sum) {
	            for (int c : r) {
	                System.out.print(c + "    ");
	            }
	            System.out.println();
	        }
	    }
}
