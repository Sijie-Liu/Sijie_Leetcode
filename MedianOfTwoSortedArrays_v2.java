//package Array;
//
//public class MedianOfTwoSortedArrays_v2 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//	
//	public static double findMedianSortedArrays(int[] nums1, int[] nums2)
//	{}
//	
//	public static double find(int[] nums1, int m, int[] nums2, int n, int k)
//	{
//		if(m==0)
//			return nums2[k];
//		if(n==0)
//			return nums1[k];
//		
//		int posA = Math.min(m, k/2);
//		int posB = Math.min(n, k/2);
//		if(nums1[posA] < nums2[posB])
//		{
//			
//			return find(nums1+posA,m-posA,nums2,n,k-posA);
//		}
//		
//	}
//
//}
