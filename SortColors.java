//package Array;
//
//public class SortColors {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] arr = {0,1,2,2,1,0,1,2,1,2,2,0};
//		sortColors(arr);
//		for(int i: arr)
//		{
//			System.out.print(i+" ");
//		}
//	}
//
//	
//	public static void sortColors(int[] nums) {
//        
//		int len = nums.length;
//		
//		for(int i=1;i<len;i++)
//        {
//        	for(int j=0;j<len-i;j++)
//        		if(nums[j]>nums[j+1])
//        		{
//        			int temp = nums[j];
//        			nums[j] = nums[j+1];
//        			nums[j+1] = temp;
//        		}
//        }
//    }
//}
