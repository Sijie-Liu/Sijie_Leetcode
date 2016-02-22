//package Array;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class Sum4 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] S = {-493,-487,-480,-464,-456,-449,-445,-439,-437,-427,-415,-403,-400,-398,-372,-349,-347,-332,-330,-324,-287,-282,-273,-254,-249,-243,-220,-219,-217,-217,-214,-199,-198,-170,-153,-150,-143,-136,-113,-93,-91,-88,-87,-78,-58,-58,-55,-51,-49,-42,-38,-36,-26,0,13,28,54,61,85,90,90,111,118,136,138,167,170,172,195,198,205,209,241,263,290,302,324,328,347,359,373,390,406,417,435,439,443,446,464,465,468,484,486,492,493};
//		List<List<Integer>> resultList = fourSum(S,0);
//		
//		for(List<Integer> list: resultList)
//			{
//				for(int val: list)
//				{
//					System.out.print(val+" ");
//				}
//				System.out.println();
//			}
//	}
//	
//	public static List<List<Integer>> fourSum(int[] nums, int target) {
//        
//		Arrays.sort(nums);
//		List<List<Integer>> resultList = new ArrayList<List<Integer>>();
//		if(nums.length<4) return null;
//		
//		int len = nums.length;
//		for(int a=0;a<len-3;a++)
//		{
//			if(a>0 && nums[a]==nums[a-1]) continue;
//			for(int b=a+1;b<len-2;b++)
//			{
//				if(b>a+1 && nums[b]==nums[b-1]) continue;
//				
//				int c = b+1;
//				int d = len - 1;
//				while(c<d)
//				{
//					if(c>b+1 && nums[c] == nums[c-1])
//					{
//						c++; continue;
//					}
//					if(d<len-1 && nums[d] == nums[d+1])
//					{
//						d--;continue;
//					}
//					
//					int sum = nums[a]+nums[b]+nums[c]+nums[d];
//					if(sum == target)
//					{
//						List<Integer> temp = new ArrayList<Integer>();
//						temp.add(nums[a]);
//						temp.add(nums[b]);
//						temp.add(nums[c]);
//						temp.add(nums[d]);
//						
//						resultList.add(temp);
//						c++;
//					}
//					else if(sum<target)
//					{
//						c++;
//					}
//					else
//					{
//						d--;
//					}
//				}
////				if(b>a+1 && nums[b]==nums[b-1]) continue;
////				for(int c=b+1;c<len-1;c++)
////				{
////					if(c>b+1 && nums[c]==nums[c-1]) continue;
////					for(int d=c+1;d<len;d++)
////					{
////						if(d>c+1 && nums[d]==nums[d-1]) continue;
////						if(nums[a]+nums[b]+nums[c]+nums[d] == target)
////						{
////							List<Integer> temp = new ArrayList<Integer>();
////							temp.add(nums[a]);
////							temp.add(nums[b]);
////							temp.add(nums[c]);
////							temp.add(nums[d]);
////							
////							resultList.add(temp);
////							break;
////						}
////					}
////				}
//			}
//		}
//		
//		return resultList;
//    }
//	
//
//}
