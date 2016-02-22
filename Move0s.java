//package Array;
//
//public class Move0s {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		int[] arr = {0};
//		moveZeroes(arr);
//		for(int i=0;i<arr.length;i++)
//			System.out.print(arr[i]+" ");
//		
//	}
//
//	public static void moveZeroes(int[] nums) {
//		for(int i=0;i<nums.length-1;i++)
//		{
//			for(int j=0;j<nums.length-i-1;j++)
//			{
//				if((nums[j]==0) || (nums[j]>nums[j+1] && nums[j+1]!=0))
//				{
//					int temp = nums[j];
//					nums[j] = nums[j+1];
//					nums[j+1] = temp;
//				}
//			}
//		}
//    }
//	
//	
//}
