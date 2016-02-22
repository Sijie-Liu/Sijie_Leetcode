//package Array;
//
//import java.util.HashMap;
//
//public class MajorityElement {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//	
//	public int majorityElement(int[] nums) {
//        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
//        for(int val: nums)
//        {
//        	if(map.containsKey(val))
//        	{
//        		int i = map.get(val);
//        		if((i+1)>(nums.length)/2)
//        			return val;
//        		map.put(val, i+1);
//        		
//        	}
//        	else
//        	{
//        		if(1>(nums.length)/2)
//        			return val;
//        		map.put(val, 1);
//        		
//        	}
//        }
//        
//        return 0;
//    }
//
//}
