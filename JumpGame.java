//package Array;
//
//public class JumpGame {
//
//	static boolean flag = false;
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] A = {2,0};
//		boolean b = canJump(A);
//		System.out.println(b);
//	}
//
//	public static boolean canJump(int[] nums) {
//        
//		jump(0,nums);
//		
//		return flag;
//		
//    }
//	
//	public static void jump(int start, int[] nums)
//	{
//		if(start == nums.length-1)
//		{
//			flag = true;
//			return;
//		}
//		for(int i=1;i<=nums[start];i++)
//		{
//			if(flag == true) return;
//			jump(start+i,nums);
//		}
//	}
//}
