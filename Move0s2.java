//package Array;
//
//public class Move0s2 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		int[] arr = {0,1,0,1,3,12};
//		moveZeroes(arr);
//		for(int i=0;i<arr.length;i++)
//			System.out.print(arr[i]+" ");
//		
//	}
//	public static void moveZeroes(int[] nums) {
//        int count = 0; // record the number of 0s in the array
//        int index = 0; //record the current index
//        
//        int len = nums.length;
//        for(int i=0;i<len;i++)
//        {
//        	if(nums[i]!=0)
//        	{
//        		nums[index++] = nums[i];
//        	}
//        	else
//        	{
//        		count++;
//        	}
//        }
//        
//        for(int i=len-count;i<len;i++)
//        	nums[i]=0;
//    }
//
//}
