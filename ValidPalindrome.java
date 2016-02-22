//package String;
//
//public class ValidPalindrome {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String s = "1r2";
//		System.out.println(isPalindrome(s));
//	}
//	
//	public static boolean isPalindrome(String s) {
//        int front = 0;
//        int end = s.length()-1;
//        
//        while(front < end)
//        {
//        	if(s.charAt(front)>'z' || s.charAt(front) < '0' ||(s.charAt(front)>'Z' && s.charAt(front) < 'a')||(s.charAt(front)>'9' && s.charAt(front) < 'A'))
//        	{
//        		front++;
//        		continue;
//        	}
//        	if(s.charAt(end)>'z' || s.charAt(end) < '0' ||(s.charAt(end)>'Z' && s.charAt(end) < 'a')||(s.charAt(end)>'9' && s.charAt(end) < 'A'))
//        	{
//        		end--;
//        		continue;
//        	}
//        	if(s.charAt(front) == s.charAt(end) || Math.abs(s.charAt(front) - s.charAt(end))==32)
//        	{
//        		front++;
//        		end--;
//        	}
//        	else {
//				return false;
//			}
//        }
//        
//        return true;
//    }
//
//}
