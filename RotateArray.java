//package Array;
//
//public class RotateArray {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] nums = {1};
//		int k = 3;
//		rotate(nums,k);
//		for(int i=0;i<nums.length;i++)
//			System.out.print(nums[i]+" ");
//
//	}
//
//	public static void rotate(int[] nums, int k) {
//        int len = nums.length;
//        k = k%len;
//        reverce(nums,0,len-k-1);
//        reverce(nums,len-k,len-1);
//        reverce(nums,0,len-1);
//    }
//	
//	public static void reverce(int[] arr, int start, int end)
//	{
//		int len = end-start+1;
//		int temp;
//		for(int i=0;i<len/2;i++)
//		{
//			temp = arr[start+i];
//			arr[start+i] = arr[end-i];
//			arr[end-i] = temp;
//		}
//	}
//}
