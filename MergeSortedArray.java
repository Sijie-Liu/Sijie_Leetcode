//package Array;
//
//public class MergeSortedArray {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] nums1 = new int[0];
//		int[] nums2 = {1};
//		
//		merge(nums1,0,nums2,1);
//		
//		for(int i: nums1)
//		{
//			System.out.print(i+" ");
//		}
//	}
//
//	public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        
//		if(m == 0)
//		{
//			for(int i=0;i<n;i++)
//				nums1[i] = nums2[i];
//		}
//		int len = m;
//		int mark = 0;
//		for(int i: nums2)
//        {
//        	for(int j = mark;j<len;j++)
//        	{
//        		if(i<nums1[j])
//        		{
//        			mark = j;
//        			len++;
//        			insert(mark,nums1,i,len);
//        			
//        			break;
//        		}
//        		if(j==len-1)
//        		{
//        			nums1[j+1] = i;
//        			len++;
//        			mark = j+1; 
//        			break;
//        		}
//        	}
//        }
//    }
//	
//	public static void insert(int pos, int[] nums, int val, int len)
//	{
//		int current = val;
//		int temp = 0;
//		for(int i=pos; i<len;i++)
//		{
//			temp = nums[i];
//			nums[i] = current;
//			current = temp;
//		}
//		
//	}
//	
//}
