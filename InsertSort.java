//package Array;
//
//public class InsertSort {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] a = {6,5,4,3,2,1};
//		insertSort(a);
//		for(int i:a)
//			System.out.print(i+" ");
//	}
//	
//	public static void insertSort(int[] a)
//	{
//		int len = a.length;
//		for(int i=1;i<len;i++)
//		{
//			int temp = a[i];
//			int j=i-1;
//			for(;j>=0;j--)
//			{
//				if(a[j]>=temp)
//				{
//					a[j+1] = a[j];
//				}
//				else
//				{
//					break;
//				}
//			}
//			a[j+1] = temp;
//		}
//	}
//
//}
