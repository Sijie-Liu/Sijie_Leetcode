//package Array;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class Sum3_2 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] nums = {-1,0,1,2,-1,-4};
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
//		List<List<Integer>> resultList = new ArrayList<List<Integer>>();
//		
//		Arrays.sort(nums);
//		int len = nums.length;
//		for(int i=0;i<len-2;i++)
//		{
//			if(nums[i]>0) break;
//			if(i>0&&nums[i]==nums[i-1])
//			{
//				continue;
//			}
//			else
//			{
//				for(int j=i+1;j<len-1;j++)
//				{
//					if(j>(i+1)&&nums[j]==nums[j-1])
//					{
//						continue;
//					}
//					else
//					{
//						for(int k=j+1;k<len;k++)
//						{
//							
//							if((nums[i]+nums[j]+nums[k])==0)
//							{
//								List<Integer> tempList = new ArrayList<Integer>();
//								tempList.add(nums[i]);
//								tempList.add(nums[j]);
//								tempList.add(nums[k]);
//								resultList.add(tempList);
//								break;
//							}
//						}
//					}
//				}
//			}
//		}
//		return resultList;
//	}
//
//}
