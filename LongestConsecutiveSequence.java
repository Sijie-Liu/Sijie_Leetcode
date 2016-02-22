//package Array;
//
//import java.util.HashMap;
//
//public class LongestConsecutiveSequence {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		int[] S = {100,4,200,1,3,5,6,7,8,2,11,21,222};
//		System.out.println(longestConsecutive(S));
//	}
//	
//	public static int longestConsecutive(int[] nums) {
//        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
//        int count=0;
//        int len = nums.length;
//        
//        for(int i=0;i<len;i++)
//        {
//        	map.put(nums[i], -1);
//        }
//        
//        for(int i=0;i<len;i++)
//        {
//        	int val = map.get(nums[i]);
//        	if(val!=-1)
//        		continue;
//        	if(map.containsKey(nums[i]-1) && !map.containsKey(nums[i]+1))
//        	{
//        		if(map.get(nums[i]-1) == -1)
//        		{
//        			val = count++;
//        			map.put(nums[i]-1, val);
//        			map.put(nums[i], val);
//        		}
//        		else
//        		{
//        			val = map.get(nums[i]-1);
//        			map.put(nums[i], val);
//        		}
//        		checkLeft(map,nums[i]-1,count);
//        	}
//        	else if(!map.containsKey(nums[i]-1) && map.containsKey(nums[i]+1))
//        	{
//        		if(map.get(nums[i]+1) == -1)
//        		{
//        			val = count++;
//        			map.put(nums[i]+1, val);
//        			map.put(nums[i], val);
//        		}
//        		else
//        		{
//        			val = map.get(nums[i]+1);
//        			map.put(nums[i], val);
//        		}
//        		checkRight(map,nums[i]+1,count);
//        	}
//        	else if(map.containsKey(nums[i]-1) && map.containsKey(nums[i]+1))
//        	{
//        		if(map.get(nums[i]-1)==-1&&map.get(nums[i]+1)==-1)
//        		{
//        			val = count++;
//        			map.put(nums[i]+1, val);
//        			map.put(nums[i], val);
//        			map.put(nums[i]-1, val);
//        		}
//        		else if(map.get(nums[i]-1)==-1)
//        		{
//        			val = map.get(nums[i]+1);
//        			map.put(nums[i], val);
//        			map.put(nums[i]-1, val);
//        		}
//        		else
//        		{
//        			val = map.get(nums[i]-1);
//        			map.put(nums[i]+1, val);
//        			map.put(nums[i], val);
//        			map.put(nums[i]-1, val);
//        		}
//        		checkLeft(map,nums[i]-1,count);
//        		checkRight(map,nums[i]+1,count);
//        	}
//        	else
//        	{
//        		val = count++;
//        		map.put(nums[i], val);
//        	}
//        }
//        
//        int[] group = new int[count];
//        int max = 0;
//        for(int key: map.keySet())
//        {
//        	group[map.get(key)]++;
//        	max = max > group[map.get(key)]? max:group[map.get(key)];
//        }
//        
//        return max;
//        
//    }
//	
//	public static void checkLeft(HashMap<Integer,Integer> map, int key,int count)
//	{
//		if(map.containsKey(key-1))
//		{
//			map.put(key-1, map.get(key));
//			count++;
//			checkLeft(map,key-1,count);
//		}
//	}
//	
//	public static void checkRight(HashMap<Integer,Integer> map, int key,int count)
//	{
//		if(map.containsKey(key+1))
//		{
//			map.put(key+1, map.get(key));
//			count++;
//			checkRight(map,key+1,count);
//		}
//	}
//
//}
