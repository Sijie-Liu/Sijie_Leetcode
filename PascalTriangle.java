//package Array;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class PascalTriangle {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		List<List<Integer>> integerList = generate(5);
//		displayList(integerList);
//	}
//
//	public static List<List<Integer>> generate(int numRows)
//	{
//		if(numRows<=0)
//			return null;
//		List<List<Integer>> integerList = new ArrayList<List<Integer>>();
//		List<Integer> currentList = null;
//		List<Integer> previousList = null;
//		for(int i=0;i<numRows;i++)
//		{
//			if(i==0)
//			{
//				currentList = new ArrayList<Integer>();
//				currentList.add(1);
//				integerList.add(currentList);
//				continue;
//			}
//			previousList = currentList;
//			currentList = new ArrayList<Integer>();
//			for(int j=0;j<=i;j++)
//			{
//				if(j==0||j==i)
//				{
//					currentList.add(1);
//				}
//				else
//				{
//					currentList.add(previousList.get(j-1)+previousList.get(j));
//				}
//			}
//			integerList.add(currentList);
//		}
//		return integerList;
//	}
//	
//	public static void displayList(List<List<Integer>> integerList)
//	{
//		for(List<Integer> subList: integerList)
//		{
//			for(int i:subList)
//			{
//				System.out.print(i+" ");
//			}
//			System.out.println();
//		}
//	}
//}
