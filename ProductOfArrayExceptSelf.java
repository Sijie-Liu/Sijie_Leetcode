package Array;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] productExceptSelf(int[] nums) {
        
		int len = nums.length;
		int[] res = new int[len];
		
		res[0] = 1;
		
		for(int i=1;i<len;i++)
			res[i] = res[i-1]*nums[i-1];
		
		int right = 1;
		
		for(int i=len-1;i>=0;i--)
		{
			res[i] = res[i]*right;
			right*= nums[i];
		}
		return res;
		
//		int len = nums.length;
//		int[] left = new int[len];
//		int[] right = new int[len];
//		int[] res = new int[len];
//		
//		left[0] = 1;
//		right[len-1] =1;
//		
//		for(int i=1;i<len;i++)
//			left[i] = left[i-1]*nums[i-1];
//		for(int i = len-2;i>=0;i--)
//			right[i] = right[i+1]*nums[i+1];
//		for(int i=0;i<len;i++)
//			res[i] = left[i]*right[i];
//		
//		return res;
    }

}
