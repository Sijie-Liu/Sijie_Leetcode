package String;

import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = generateParenthesis(3);
		for(String s:list)
		{
			System.out.println(s);
		}
	}
	
	public static List<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<String>();
        int n1 = 0;
        int n2 = 0;
		String s = "";
		rec(result, n, n1, n2, s);
		
		return result;
    }
	
	public static void rec(ArrayList<String> list, int n, int n1, int n2, String s)
	{
		if(n1 == n && n2 == n)
		{
			list.add(s);
			return;
		}
		
		if(n1 < n2)
		{
			return;
		}
		
		if(n1 == n)
		{
			rec(list, n, n1, n2+1, s+")");
			return;
		}
		
		rec(list, n, n1+1, n2, s+"(");
		rec(list, n, n1, n2+1, s+")");
	}

}
