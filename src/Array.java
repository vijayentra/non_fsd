public class Array {

	public static void main(String[] args) {
		
		int[][] a = { {3,-2}, {3,5}, {4,4}, {6,2} };     //rows=4,col=2
        int[][] b = { {2,3,4}, {-9,0,3} };               //rows=2,col=3
		int[][] product = new int[4][3];
		
        for(int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 2; k++) {
                    product[i][j] += a[i][k] * b[k][j]; }
            }
        }
        for(int[] row : product) {
            for (int column : row) {
                System.out.print(column+ "  ");
            }
            System.out.println();}
        }
	}
//		int[] height = [];
//		int[] age = new int[5];
//		System.out.println(age[0]);
//		height[0]=1;
//		
//		int[][] weight = {{45,55,48,38,61},{34,66,5}};
//		
//		for(int a[] : weight)     //multi dimensional
//		{
//			for(int value : a)
//			{
//				System.out.println(a);
//			}
//		}
//	}