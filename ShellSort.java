//package Array;
//
//public class ShellSort {
//
//	public static void main(String[] arg0)
//	{
//		int[] arr = {12,5,3,4,7,1,2,8,9,10};
//		shellSort(arr);
//		for(int i: arr)
//			System.out.print(i+" ");
//	}
//	
//	public static void shellSort(int[] arr)
//	{
//		int len = arr.length;
////		for(int r = len/2;r>=1;r/=2)
////		{
////			for(int i=r;i<len;i++)
////			{
////				int temp = arr[i];
////				int j=i-r; //mark the other element of a pair
////				while(j>=0 && temp<arr[j])
////				{
////					arr[j+r] = arr[j];
////					j-=r;
////				}
////				arr[j+r]=temp;
////			}
////		}
//		
//		for(int r = len/2;r>=1;r/=2)
//		{
//			for(int i=0;i<len-r;i++)
//			{
//				if(arr[i]>arr[i+r])
//				{
//					int temp = arr[i];
//					arr[i] = arr[i+r];
//					arr[i+r] = temp;
//				}
//			}
//		}
//	}
//}
