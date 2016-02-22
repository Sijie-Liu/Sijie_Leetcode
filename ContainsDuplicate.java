//package Array;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//
//public class ContainsDuplicate {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] arr ={};
//		System.out.println(containsDuplicate(arr));
//	}
//
//	public static boolean containsDuplicate(int[] nums) {
//        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
//        for(int i:nums)
//        {
//        	if(map.containsKey(i))
//        		return false;
//        	map.put(i, 1);
//        }
//        return true;
//    }
//}
