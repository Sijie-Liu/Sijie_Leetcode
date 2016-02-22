//package Array;
//
//public class RotateImage {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//		for(int i=0;i<4;i++)
//		{
//			for(int j=0;j<4;j++)
//			{
//				System.out.print(matrix[i][j]+"  ");
//			}
//			System.out.println();
//		}
//		
//		rotate(matrix);
//		
//		System.out.println("=============");
//		
//		for(int i=0;i<4;i++)
//		{
//			for(int j=0;j<4;j++)
//			{
//				System.out.print(matrix[i][j]+"  ");
//			}
//			System.out.println();
//		}
//	}
//
//	public static void rotate(int[][] matrix) {
//        
//		int n = matrix.length;
//		for(int i=0;i<n/2;i++)
//		{
//			for(int j=i;j<n-i-1;j++)
//			{
//				
//				int right = matrix[j][n-i-1];
//				int bottom = matrix[n-i-1][n-1-j];
//				int left = matrix[n-1-j][i];
//				int top = matrix[i][j];
//				
//				//top ->right
//				matrix[j][n-i-1] = top;
//				
//				//right -> bottom
//				
//				matrix[n-i-1][n-1-j] = right;
//				
//				//bottom -> left
//				
//				matrix[n-1-j][i] = bottom;
//				
//				//left -> top
//				matrix[i][j] = left;
//				
//			}
//		}
//    }
//}
