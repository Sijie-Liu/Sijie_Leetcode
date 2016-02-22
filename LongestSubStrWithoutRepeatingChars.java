//package HashTable;
//
//import java.util.HashMap;
//
//public class LongestSubStrWithoutRepeatingChars {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println(lengthOfLongestSubstring("ua"));
//	}
//	
//	public static int lengthOfLongestSubstring(String s) {
//		
//       HashMap<Character,Integer> map = new HashMap<Character, Integer>();
//       
//       if(s.length()<=0)
//    	   return 0;
//       if(s.length()==1)
//    	   return 1;
//       
//       
//       int count = 0;
//       int max = Integer.MIN_VALUE;
//       
//       
//       for(int i=0;i<s.length();i++)
//       {
//    	   
//    	   if(!map.containsKey(s.charAt(i)))
//    	   {
//    		   count++;
//    		   map.put(s.charAt(i), 1);
//    	   }
//    	   else {
//			max = max>count? max:count;
//			count = 0;
//			if(max == 128)
//				return 128;
//			map = new HashMap<Character, Integer>();
//    	   }
//    	   
//    	   max = max>count? max:count;
//    	   
//   	   }
//       
//       return max;
//        
//    }
//
//}
