package Array;

import java.util.HashMap;

public class LongestConsecutiveSequence_2ndAttempt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] S={2,5,4,3,1,18,19,20,21,22,23,11,111};
		System.out.println(longestConsecutive(S));
	}

	public static int longestConsecutive(int[] nums) 
	{
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int max = Integer.MIN_VALUE;
		int len = nums.length;
		
		//store nums into map
		for(int i=0;i<len;i++)
		{
			map.put(nums[i], nums[i]);
		}
		
		
		for(int i=0;i<len;i++)
		{
			if(!map.containsKey(nums[i]))
				continue;
			int key = nums[i];
			int tempLen = 1;
			int temp1 = key;
			int temp2 = key;
			
			while(map.containsKey(temp1+1))
			{
				tempLen++;
				map.remove(++temp1);
			}
			
			while(map.containsKey(temp2-1))
			{
				tempLen++;
				map.remove(--temp2);
			}
			
			map.remove(key);
			
			max = max>tempLen?max:tempLen;
		}
		
		return max;
	}
}
