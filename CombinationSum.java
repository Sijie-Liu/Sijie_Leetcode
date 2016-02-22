//package Array;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class CombinationSum {
//
//	static List<List<Integer>> result;
//	static List<Integer> solu;
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		int[] S = {2,3,6,7};
//		List<List<Integer>> ll = combinationSum(S,7);
//		for(List<Integer> l: ll)
//		{
//			for(int i : l)
//			{
//				System.out.print(i+" ");
//			}
//			System.out.println();
//		}
//	}
//	
//	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
//        result = new ArrayList<>();
//        solu = new ArrayList<>();
//        Arrays.sort(candidates);
//        getCombination(candidates,target,0,0);
//        return result;
//    }
//
//	public static void getCombination(int[] candidates, int target, int sum, int level)
//	{
//		if(sum>target) return;
//		if(sum == target)
//		{
//			result.add(new ArrayList<>(solu));
//			return;
//		}
//		
//		for(int i= level;i<candidates.length;i++)
//		{
//			sum+=candidates[i];
//			solu.add(candidates[i]);
//			getCombination(candidates,target,sum,i);
//			solu.remove(solu.size()-1);
//			sum-=candidates[i];
//		}
//	}
//}
