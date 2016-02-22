//package Array;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class SummaryRanges {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] S = {0,1,4,5,6,11,13,14,15};
//		List<String> strList = summaryRanges(S);
//		for(String s : strList)
//			System.out.println(s);
//	}
//	
//	public static List<String> summaryRanges(int[] nums) {
//        
//		
//		
//		List<String> strList = new ArrayList<String>();
//		if(nums.length<=0)
//			return strList;
//		
//		int len = nums.length;
//		int start = 0;
//		int end = 0;
//		
//		for(int i=0;i<len;)
//		{
//			start = i;
//			end = i;
//			
//			while(end!=len && (nums[end]-nums[start])==(end-start))
//			{
//				end++;
//			}
//			
//			if(end-start == 1)
//				strList.add(String.valueOf(nums[start]));
//			else
//			{
//				String str = nums[start]+"->"+nums[end-1];
//				strList.add(str);
//			}
//			
//			i=end;
//		}
//		
//		
//		return strList;
//    }
//
//}
