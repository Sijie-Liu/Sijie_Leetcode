//package Array;
//
//import java.util.ArrayList;
//
//public class RemoveElement {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] arr = {4,5};
//		int val = 4;
//		int size = removeElement(arr,val);
//		
//		System.out.println(size);
//		
//		for(int i: arr)
//		{
//			System.out.print(i+" ");
//		}
//		
//	}
//
//	public static int removeElement(int[] nums, int val) {
//		
//		int start = 0;
//		
//		for(int i=0;i<nums.length;i++)
//		{
//			if(val!=nums[i])
//				nums[start++] = nums[i];
//		}
//		
//		return start;
//		
//		
//    }
//}
