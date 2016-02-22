//package Array;
//
//public class UniquePaths {
//
//	static int num = 0;
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int m = 7;
//		int n = 7;
//		move(0,0,m,n);
//		
//		System.out.println(num);
//		
//		System.out.println(uniquePath(m,n));
//	}
//
//	public static void move(int i,int j,int m, int n)
//	{
//		if(i == m-1 && j == n-1)
//		{
//			num++;
//		}
//		if(i<m-1)
//		{
//			move(i+1,j,m,n);
//		}
//		if(j<n-1)
//		{
//			move(i,j+1,m,n);
//		}
//	}
//	
//	public static int uniquePath(int m, int n)
//	{
//		int[][] arr = new int[m][n];
//		for(int i =0;i<n;i++)
//			arr[0][i] = 1;
//		for(int i = 0;i<m;i++)
//			arr[i][0] = 1;
//		
//		for(int i=1;i<m;i++)
//			for(int j=1;j<n;j++)
//			{
//				arr[i][j] = arr[i][j-1]+arr[i-1][j];
//			}
//		
//		return arr[m-1][n-1];
//			
//	}
//}
