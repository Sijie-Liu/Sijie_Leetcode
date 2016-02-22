//package HashTable;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//
//public class WordPattern {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String pattern = "abba";
//		String str = "dog dog dog dog";
//		System.out.println(wordPattern(pattern, str));
//	}
//
//	public static boolean wordPattern(String pattern, String str) {
//       
//        String[] strArray = str.split(" ");
//        if (strArray.length!=pattern.length())
//        	return false;
//        int len = strArray.length;
//        HashMap<Character, String> map = new HashMap<Character, String>();
//        
//        for(int i=0;i<len;i++)
//        {
//        	if(!map.containsKey(pattern.charAt(i)))
//        	{
//        		if(map.containsValue(strArray[i])) return false;
//        		map.put(pattern.charAt(i), strArray[i]);
//        	}
//        	else {
//				if(!map.get(pattern.charAt(i)).equals(strArray[i]))
//					return false;
//			}
//        }
//        
//        return true;
//    }
//}
