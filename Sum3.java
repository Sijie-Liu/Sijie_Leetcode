//package Array;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.List;
//
//public class Sum3 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		//int[] nums = {7,-1,14,-12,-8,7,2,-15,8,8,-8,-14,-4,-5,7,9,11,-4,-15,-6,1,-14,4,3,10,-5,2,1,6,11,2,-2,-5,-7,-6,2,-15,11,-6,8,-4,2,1,-1,4,-6,-15,1,5,-15,10,14,9,-8,-6,4,-6,11,12,-15,7,-1,-9,9,-1,0,-4,-1,-12,-2,14,-9,7,0,-3,-4,1,-2,12,14,-10,0,5,14,-1,14,3,8,10,-8,8,-5,-2,6,-11,12,13,-7,-12,8,6,-13,14,-2,-5,-11,1,3,-6};
//		int[] nums = {0,0,0};
//		List<List<Integer>> resultList = threeSum(nums);
//		for(List<Integer> list: resultList)
//		{
//			for(int val: list)
//			{
//				System.out.print(val+" ");
//			}
//			System.out.println();
//		}
//	}
//
//	public static List<List<Integer>> threeSum(int[] nums) {
//       
//		int[] arr = removeDuplicate(nums);
//		List<List<Integer>> resultList = new ArrayList<List<Integer>>();
//		int len = arr.length;
//		for(int a=0;a<len-2;a++)
//		{
//			for(int b=a+1;b<len-1;b++)
//			{
//				for(int c=b+1;c<len;c++)
//				{
//					if((arr[a]+arr[b]+arr[c])==0)
//					{
//						int[] temp = new int[3];
//						temp[0] = arr[a];
//						temp[1] = arr[b];
//						temp[2] = arr[c];
//						sortArray(temp);
//						
//						List<Integer> list = new ArrayList<Integer>();
//						list.add(temp[0]);
//						list.add(temp[1]);
//						list.add(temp[2]);
//						
//						resultList.add(list);
//					}
//				}
//			}
//		}
//		
//		return resultList;
//    }
//	
//	public static void sortArray(int[] nums)
//	{
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
//	}
//	
//	
//	public static int[] removeDuplicate(int[] nums)
//	{
//		
//		HashMap<Integer,Integer> set = new HashMap<Integer,Integer>();
//		int i=0;
//		for(int val: nums)
//		{
//			if(set.containsValue(val))
//				continue;
//			else
//				set.put(i++,val);
//		}
//		
//		int[] num = new int[set.size()];
//		for(int j=0;j<set.size();j++)
//			num[j] = set.get(j);
//		return num;
//			
//	}
//}
