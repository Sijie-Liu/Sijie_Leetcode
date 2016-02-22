//package Array;
//
//public class MissingNum {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//	
//	public int missingNumber(int[] nums) {
//        
//		if(nums.length == 0)
//			return 0;
//		int len = nums.length;
//        int sum = 0;
//        int origin = (1+len)*(len)/2;
//        
//        for(int i=0;i<len;i++)
//        {
//        	sum+=nums[i];
//        }
//        
//        int result = origin - sum;
//        return result;
//    }
//
//}
