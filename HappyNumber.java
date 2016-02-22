//package HashTable;
//
//import java.util.HashMap;
//
//public class HappyNumber {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println(isHappy(7));
//	}
//	
//	public static boolean isHappy(int n) {
//        
//		boolean flag = false;
//		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
//		
//		
//		while(!map.containsKey(n))
//		{
//			map.put(n, 1);
//			int sum = 0;
//			while(n!=0)
//			{
//				sum+= (n%10)*(n%10);
//				n = n/10;
//			}
//			if(sum==1)
//			{
//				flag = true;
//				break;
//			}
//			
//			n = sum;
//		}
//		
//		return flag;
//    }
//
//}
