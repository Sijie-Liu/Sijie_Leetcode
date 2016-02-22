//package Array;
//
//public class RemoveDuplicatesFromSortedArray2 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] arr = {1,1,1,2,2,3};
//		System.out.println(removeDuplicates(arr));
//	}
//	
//	public static int removeDuplicates(int[] nums) {
//    
//		int len = nums.length;
//		if(len == 0 || len == 1||len == 2)
//			return len;
//		
//		int count = 1;
//		boolean flag = false;
//		
//		for(int i=1;i<len;i++)
//		{
//			if(nums[i]==nums[i-1] && flag == false)
//			{
//				nums[count++] = nums[i];
//				flag = true;
//			}
//			else if(nums[i]!=nums[i-1])
//			{
//				nums[count++] = nums[i];
//				flag = false;
//			}
//		}
//		
//		return count;
//    }
//
//}
