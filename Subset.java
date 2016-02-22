//package Array;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class Subset {
//
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] nums = {1,2,3};
//		List<List<Integer>> ill = subsets(nums);
//		for(List<Integer> l:ill)
//		{
//			for(int i:l)
//			{
//				System.out.print(i+" ");
//			}
//			System.out.println();
//		}
//	}
//	
//	public static List<List<Integer>> subsets(int[] nums) {
//		
//		if(nums.length<=0)
//			return new ArrayList<List<Integer>>();
//		
//		List<List<Integer>> result = new ArrayList<List<Integer>>();
//		int len = nums.length;
//		Arrays.sort(nums);
//		
//		for(int i=0;i<len;i++)
//		{
//			List<List<Integer>> temp = new ArrayList<List<Integer>>();
//			for(List<Integer> l:result)
//			{
//				temp.add(new ArrayList<Integer>(l));
//			}
//			
//			for(List<Integer> l:temp)
//			{
//				l.add(nums[i]);
//				result.add(l);
//			}
//			
//			List<Integer> top = new ArrayList<Integer>();
//			top.add(nums[i]);
//			result.add(top);
//			
//		}
//		
//		result.add(new ArrayList<Integer>());
//		return result;
//    }
//	
//	
//
//}
