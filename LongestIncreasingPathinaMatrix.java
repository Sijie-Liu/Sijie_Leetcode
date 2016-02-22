//package DFS;
//
//public class LongestIncreasingPathinaMatrix {
//
//	public static void main(String[] args)
//	{
//		int[][] matrix = new int[][]{{5,4,3},{1,1,2},{1,1,1}};
//		
//		System.out.println(longestIncreasingPath(matrix));
//	}
//	
//	public static int longestIncreasingPath(int[][] matrix) {
//        
//		int result = 0;
//		
//		if(matrix.length<=0)
//			return 0;
//		if(matrix[0].length <=0)
//			return 0;
//		
//		for( int i=0;i<matrix.length;i++)
//		{
//			for( int j=0;j<matrix[i].length;j++)
//			{
//				int tmp = findLongest(matrix, i, j, -1);
//				result = Math.max(result, tmp);
//			}
//		}
//		
//		return result;
//    }
//	
//	public static int findLongest(int[][] matrix, int i, int j, int previous, boolean flag)
//	{
//		int iMax = matrix.length;
//		int jMax = matrix[0].length;
//		
//		if(i<0 || i >= iMax || j<0|| j >= jMax)
//			return 0;
//		
//		if(matrix[i][j] <= previous)
//			return 0;
//		
//		int up = 1+findLongest(matrix, i, j-1, matrix[i][j]);
//		int down = 1+findLongest(matrix, i, j+1, matrix[i][j]);
//		int left = 1+findLongest(matrix, i-1, j, matrix[i][j]);
//		int right = 1+findLongest(matrix, i+1, j, matrix[i][j]);
//		
//		return Math.max(Math.max(up, down),Math.max(left, right));
//	}
//}
