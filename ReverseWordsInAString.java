//package String;
//
//import java.util.ArrayList;
//
//public class ReverseWordsInAString {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String s = " The";
//		String result = reverseWords(s);
//		System.out.println(result);
//	}
//	
//	public static String reverseWords(String s) {
//        
//		String trimS = s.trim();
//        String[] strArray = trimS.split(" ");
//        ArrayList<String> strList = new ArrayList<String>();
//        
//        
//        String result = "";
//        
//        for(int i=strArray.length-1;i>=0;i--)
//        {
//        	if(strArray[i].equals("")||strArray[i].equals(" "))
//        		continue;
//        	strList.add(strArray[i]);
//        }
//        
//        for(int i=0;i<strList.size();i++)
//        {
//        	result+=strList.get(i);
//        	if(i<strList.size()-1)
//        		result+=" ";
//        }
//        return result;
//    }
//
//}
