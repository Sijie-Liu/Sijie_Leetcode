package String;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestSubstringWithAtMost2DistinctChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int lengthOfLongestSubstringTwoDistinct(String s) {

		int result = 0;
		int len = s.length();
		
		int point1 = 0;
		int point2 = 0;
		
		int tmp1 = 0;
		int tmp2 = 0;
		
		while(point2<len)
		{
			if(s.charAt(point2)==s.charAt(point1))
			{
				tmp1++;
			}
			else {
				
			}
		}
        
        return result;
    }
}
