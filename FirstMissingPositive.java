//package Array;
//
//import java.util.HashMap;
//
//public class FirstMissingPositive {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] arr = {2};
//		System.out.println(firstMissingPositive(arr));
//	}
//	
//	public static int firstMissingPositive(int[] nums) {
//        
//		if(nums.length <=0) return 1;
//		
//		int len = nums.length;
//		
//		int result = 1;
//		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
//        for(int i=0;i<len;i++)
//        {
//        	if(nums[i]>0)
//        	{
//        		map.put(nums[i], nums[i]);
//        	}
//        }
//        
//        
//        int min=1;
//        while(true)
//        {
//        	if(!map.containsKey(min++))
//        	{
//        		result = min-1;
//        		break;
//        	}
//        }
//        
//        return result;
//    }
//	
//	
//
//}
