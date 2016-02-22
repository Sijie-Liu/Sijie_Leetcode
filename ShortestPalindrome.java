package String;

public class ShortestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(shortestPalindrome("aaa"));
	}

	public static String shortestPalindrome(String s) {
		
		if(s.length() < 2)
			return s;
		
		if(s.length() == 2)
		{
			if(s.charAt(0) == s.charAt(1))
				return s;
			else {
				return s.substring(1, 2)+s;
			}
		}
        int len = s.length();
        int start = len/2;
        int left = 0;
        int right = 0;
        String result = "";
        
        for(int i=start;i>0;i--)
        {
        	if(s.charAt(i) == s.charAt(i-1))
        	{
        		left = i-1;
        		right = i;
        	}
        	else {
				left = i;
				right = i;
				
			}
        	
        	while(left>=0 && right < len)
        	{
        		if(s.charAt(left) == s.charAt(right))
        		{
        			left--;
        			right++;
        		}
        		else {
					break;
				}
        	}
        	
        	if(left <0)
        	{
        		StringBuilder tmp = new StringBuilder(s.substring(right, len));
        		String head = tmp.reverse().toString();
        		if(head.equals(tmp))
        		{
        			result = s;
        		}
        		result = head+s;
        		break;
        	}
        	
        }
        
        if(result.equals(""))
        {
        	StringBuilder tmp = new StringBuilder(s.substring(1, len));
    		String head = tmp.reverse().toString();
    		result = head+s;
        }
        
        return result;
    }
}
