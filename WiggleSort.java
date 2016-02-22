package Array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class WiggleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		wiggleSort(nums);
		for(int i:nums)
		{
			System.out.print(i+" ");
		}
		
	}
	
	public static void wiggleSort(int[] nums) {
		
		if(nums.length <= 1)
			return;
		int len = nums.length;
        for(int i=0;i<len-1;i++)
        {
        	for(int j = 0;j<len-i-1;j++)
        	{
        		if(nums[j]<nums[j+1])
        		{
        			int tmp = nums[j];
        			nums[j] = nums[j+1];
        			nums[j+1] = tmp;
        		}
        	}
        }
        
        for(int i=0; i<len-1;i+=2)
        {
        	int tmp = nums[i];
        	nums[i] = nums[i+1];
        	nums[i+1] = tmp;
        }
        
        
    }

}
