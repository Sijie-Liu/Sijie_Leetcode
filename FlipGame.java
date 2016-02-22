package String;

import java.util.ArrayList;
import java.util.List;

public class FlipGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<String> generatePossibleNextMoves(String s) {
		int index1 = 0;
		int index2 = 0;
		List<String> result = new ArrayList<String>();
		int len = s.length();
		char[] c = s.toCharArray();
		
		
		for(int i =0;i<len-1;i++)
		{
			if(c[i] == '+' && c[i+1] == '+')
			{
				c[i] ='-';
				c[i+1] = '-';
				String tmp = new String(c);
				result.add(tmp);
				c[i] ='+';
				c[i+1] = '+';
			}
		}
		
		return result;
	}
}
