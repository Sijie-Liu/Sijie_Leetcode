package HashTable;

import java.util.HashMap;

public class ContainsDuplicateII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,0,1,1};
		int k = 1;
		System.out.println(containsNearbyDuplicate(nums, k));
	}
	
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        int len = nums.length;
        for(int i=0;i<len;i++)
        {
            if(map.containsKey(nums[i]))
            {
                if(Math.abs(map.get(nums[i])-i) <= k)
                	return true;
                else {
                	map.put(nums[i],i);
				}
            }
            else
            {
                map.put(nums[i],i);
            }
        }
        
        return false;
    }

}
