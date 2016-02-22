//package Array;
//
//public class MedianOfTwoSortedArrays {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] nums1 = {1,2};
//		int[] nums2 = {};
//		
//		double result = findMedianSortedArrays(nums1,nums2);
//		System.out.println(result);
//	}
//	
//	
////	 This method cause Time Limit Error
//	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        int m = nums1.length;
//        int n = nums2.length;
//        int p = (m+n)/2;
//        int indexM = 0;
//        int indexN = 0;
//        
//        double result = 0;
//		
//        while(indexM+indexN <p)
//		{
//        	if(indexM>= m)
//        	{
//        		indexN++;
//        	}
//        	else if(indexN>=n)
//        	{
//        		indexM++;
//        	}
//        	else if(nums1[indexM]<=nums2[indexN])
//				indexM++;
//        	else if(nums1[indexM]>=nums2[indexN])
//				indexN++;
//		}
//        
//        if(indexM>=m)
//        	result = nums2[indexN];
//        else if(indexN>=n)
//        	result = nums1[indexM];
//        else
//        	result = Math.min(nums1[indexM], nums2[indexN]);
//        
//        return result;
//		
//    }
//
//}
