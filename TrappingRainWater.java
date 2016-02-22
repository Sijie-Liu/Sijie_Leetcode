//package Array;
//
//public class TrappingRainWater {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] S = {0,1,0,2,1,0,1,3,2,1,2,1};
//		System.out.println(trap(S));
//	}
//
//	public static int trap(int[] height) {
//        
//		if(height.length<=2)
//			return 0;
//		
//		int len = height.length;
//		int[] leftMax = new int[len];
//		int[] rightMax = new int[len];
//		
//		leftMax[0] = 0;
//		leftMax[1] = height[0];
//		rightMax[len-1] = 0;
//		rightMax[len-2] = height[len-1];
//		int sum = 0;
//		
//		for(int i=2;i<len;i++)
//			leftMax[i] = height[i-1]>leftMax[i-1]?height[i-1]:leftMax[i-1];
//		for(int i=len-3;i>=0;i--)
//			rightMax[i] = height[i+1]>rightMax[i+1]?height[i+1]:rightMax[i+1];
//			
//		for(int i=0;i<len;i++)
//		{
//			int temp = Math.min(leftMax[i], rightMax[i])-height[i];
//			if(temp>0)
//				sum+=temp;
//		}
//		
//		return sum;
//    }
//}
