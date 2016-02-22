package String;

import java.util.Stack;

public class SimplifyPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "/a/./b/../../c/";
		System.out.println(simplifyPath(s));
	}

	public static String simplifyPath(String path) {
		
		if(path == null || path.length() == 0)
			return "";
		String[] data = path.split("/");
		Stack<String> stack = new Stack<String>();
		String result = "";
		
		for (String s : data) {
			if (!s.equals("")) {
				switch (s) {
				case ".":
					break;
				case "..": {
				    if(!stack.isEmpty())
					    stack.pop();
					break;
				}
				default: {
					stack.push(s);
					break;
				}
				}

			}
		}
		
		if(stack.isEmpty())
			return "/";
			
		while(!stack.isEmpty())
		{
			result = "/" + stack.pop() + result;
		}
		
		return result;
	}

}
