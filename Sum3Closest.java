//package Array;
//
//public class Sum3Closest {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] S = {-3,-2,-5,3,-4};
//		
//		System.out.println(threeSumClosest(S,-1));
//	}
//	
//	public static int threeSumClosest(int[] nums, int target) {
//        int min = nums[0]+nums[1]+nums[2];
//        int len = nums.length;
//        
//        for(int i= 0;i<nums.length-1;i++)
//		{
//			for(int j=0;j<nums.length-1-i;j++)
//			{
//				if(nums[j]>nums[j+1])
//				{
//					int temp= nums[j];
//					nums[j]=nums[j+1];
//					nums[j+1] = temp;
//				}
//			}
//		}
//        
//        int front = 1;
//        int back = len-1;
//        for(int i=0;i<len-2;i++)
//        {
//        	front = i+1;
//        	back = len-1;
//        	while(front<back)
//        	{
//        		int sum = nums[i]+nums[front]+nums[back];
//        		min = (Math.abs(sum-target) > Math.abs(min-target))? min:sum;
//        		if(sum<target)
//        		{
//        			front++;
//        		}
//        		else if(sum>target)
//        		{
//        			back--;
//        		}
//        		else
//        			return target;
//        	}
//        }
//        
//        return min;
//    }
//	
//	public static void sort(int[] nums)
//	{
//		
//	}
//
//}
