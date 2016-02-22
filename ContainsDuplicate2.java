//package Array;
//
//import java.util.HashMap;
//
//public class ContainsDuplicate2 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//	
//	public boolean containsNearbyDuplicate(int[] nums, int k) {
//        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
//        for(int i=0;i<nums.length;i++)
//        {
//        	if(map.containsKey(nums[i]))
//        	{
//        		int j = map.get(nums[i]);
//        		if(Math.abs(i-j)<=k)
//        			return true;
//        		else
//        		{
//        			map.put(nums[i], i);
//        		}
//        	}
//        	else
//        	{
//        		map.put(nums[i], i);
//        	}
//        	
//        	
//        }
//        return false;
//    }
//
//}
