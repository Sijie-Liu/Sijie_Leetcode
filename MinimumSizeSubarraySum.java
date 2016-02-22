//package Array;
//
//import java.util.ArrayList;
//
//public class MinimumSizeSubarraySum {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//	
//	
//	public int minSubArrayLen(int s, int[] nums) {
//        
//		int currentMin = Integer.MAX_VALUE;
//		int sum = 0;
//		for(int i=0;i<nums.length;i++) 
//        {
//			sum = 0;
//        	for(int j=i;j<nums.length;j++)
//        	{
//        		sum+=nums[j];
//        		if(sum>=s)
//        		{
//        			int len = j-i+1;
//        			if(len<currentMin)
//        				currentMin = len;
//        			break;
//        		}
//        			
//        	}
//        }
//		
//		if(currentMin == Integer.MAX_VALUE)
//			return 0;
//		return currentMin;
//		
//		
////		int start = 0;
////		int end = 0;
////		int sum = 0;
////		int min = Integer.MAX_VALUE;
////		
////		
////		while(start<nums.length&&end<nums.length)
////		{
////			while(sum<s&&end<nums.length)
////			{
////				sum+=nums[end++];
////			}
////			while(start<=end && sum>=s)
////			{
////				min = Math.min(min, end-start);
////				sum-=nums[start++];
////			}
////		}
////		return min == Integer.MAX_VALUE? 0 : min;
//    }
//
//}
