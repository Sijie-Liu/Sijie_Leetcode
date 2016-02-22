//package String;
//
//import java.util.ArrayList;
//import java.util.Stack;
//
//public class ValidParentheses {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println(isValid("()"));
//	}
//	
//	public static boolean isValid(String s) {
//		int len = s.length();
//		Stack<Character> stack = new Stack<Character>();
//		
//		for(int i=0;i<len;i++)
//		{
//			
//			if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{')
//				stack.push(s.charAt(i));
//			if((s.charAt(i)==')'||s.charAt(i)==']'||s.charAt(i)=='}'))
//			{
//				if(stack.isEmpty())
//					return false;
//				char c = stack.pop();
//				switch (s.charAt(i)) {
//				case ')':
//					if(c!='(') return false;
//					break;
//				case ']':
//					if(c!='[') return false;
//					break;
//				case '}':
//					if(c!='{') return false;
//					break;
//				default:
//					break;
//				}
//			}
//		}
//		
//		if(stack.isEmpty())
//			return true;
//		return false;
//    }
//
//}
