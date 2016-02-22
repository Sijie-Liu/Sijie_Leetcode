//package Array;
//
//public class PascalTriangle2 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int k = 3;
//		int[] arr = getRow(k);
//		for(int i: arr)
//			System.out.print(i+" ");
//	}
//
//	public static int[] getRow(int k)
//	{
//		int[] arr = new int[k+1];
//		arr[0] = 1;
//		for(int i=1;i<=k;i++)
//		{
//			for(int j=i;j>=0;j--)
//			{
//				if( j == i)
//					arr[j] = arr[j-1];
//				else if (j==0)
//					arr[j] = arr[j];
//				else
//					arr[j] = arr[j-1]+arr[j];
//			}
//		}
//		
//		return arr;
//	}
//	
//	
//}
