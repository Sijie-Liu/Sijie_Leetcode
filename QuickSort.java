//package Array;
//
//public class QuickSort {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] S = {4,3,2,5,1,22,6,12,11};
//		quickSort(S,0,S.length-1);
//		for(int i:S)
//			System.out.print(i+" ");
//	}
//
//	public static void quickSort(int[] arr, int left, int right)
//	{
//		if(left < right)
//		{
//			int i = left;
//			int j = right;
//			int base = arr[left];
//			
//			while(i<j)
//			{
//				while(arr[j]>=base && i<j)
//					j--;
//				if(i<j)
//				{
//					arr[i++] = arr[j];
//				}
//				
//				while(arr[i]<base && i<j)
//					i++;
//				if(i<j)
//				{
//					arr[j--] = arr[i];
//				}
//			}
//			arr[i] = base;
//			
//			quickSort(arr,left,i-1);
//			quickSort(arr,i+1,right);
//		}
//	}
//}
