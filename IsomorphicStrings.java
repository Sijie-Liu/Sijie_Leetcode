//package HashTable;

//import java.util.ArrayList;
//import java.util.HashMap;
//
//public class IsomorphicStrings {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println(isIsomorphic("aba","baa"));
//	}
//	
//	public static boolean isIsomorphic(String s, String t) {
//		
//		//Time Limit Exceeded
////		String s2=s;
////		for(int i=0;i<s.length();i++)
////		{
////			s2 = s2.replace(t.charAt(i), '.');
////			s2 = s2.replace(s2.charAt(i), t.charAt(i));
////		}
////		
////		if(s2.equals(t))
////			return true;
////		else
////			return false;
//		
//		HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();
//		HashMap<Character,Integer> map2 = new HashMap<Character,Integer>();
//		int len = s.length();
//		
//		int count = 0;
//		for(int i=0;i<len;i++)
//		{
//			if(map1.containsKey(s.charAt(i)) && map2.containsKey(t.charAt(i)))
//			{
//				if(map1.get(s.charAt(i))!=map2.get(t.charAt(i)))
//					return false;
//			}
//			else if(!map1.containsKey(s.charAt(i)) && !map2.containsKey(t.charAt(i)))
//			{
//				map1.put(s.charAt(i), count);
//				map2.put(t.charAt(i), count);
//				count++;
//			}
//			else
//				return false;
//				
//			
//		}
//		return true;
//    }
//
//}
