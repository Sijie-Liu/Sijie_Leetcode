//package Array;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class PascalTriangle2_ {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		List<Integer> result = getRow(2);
//		for(int i=0;i< result.size();i++)
//		{
//			System.out.print(result.get(i)+" ");
//		}
//	}
//	public static List<Integer> getRow(int rowIndex) {
//        ArrayList<Integer> resultList = new ArrayList<Integer>(); 
//        
//        int[] arr = new int[rowIndex+1];
//        for(int i=0;i<=rowIndex;i++)
//        {
//        	if(i == 0)
//        	{
//        		arr[i]=1;
//        	}
//        	else
//        	{
//        		arr[i] =1;
//        		
//        		
//        		for(int j=i-1;j>0;j--)
//        		{
//        			arr[j] = arr[j]+arr[j-1];
//        		}
//        		
//        	}
//        }
//        
//        for(int i=0;i<=rowIndex;i++)
//        	resultList.add(arr[i]);
//        
//        return resultList;
//    }
//
//}
