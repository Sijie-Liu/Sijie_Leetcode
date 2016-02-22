package String;

import javax.naming.spi.DirStateFactory.Result;

public class MultiplyStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(multiply("140", "721"));
		
	}
	
	public static String multiply(String num1, String num2) {
		if(num1.equals("0")||num2.equals("0"))
			return "0";
        String result ="0";
        String str1 = num1;
        String str2 = num2;
        String str3;
        
        for(int i=str2.length()-1;i>=0;i--)
        {
        	str3 = unitMultiply(str1, str2.charAt(i));
        	result = sum2Strings(str3, result);
        	str1+="0";		
        }
        
        return result;
    }
	
	public static String unitMultiply(String str, char num)
	{
		
		String result="";
		int extra=0;
		int newNum=0;
		char[] cArr = str.toCharArray();
		
		for(int i =str.length()-1;i>=0;i--)
		{
			int sum = (cArr[i]-48)*(num-48)+extra;
			newNum = sum%10;
			extra = sum/10;
			cArr[i]	= (char)(newNum+48);
		}
		
		if(extra!=0)
		{
			result = String.valueOf(extra);
			result+=String.valueOf(cArr);
		}
		else {
			result = String.valueOf(cArr);
		}
		
		return result;
	}
	
	public static String sum2Strings(String str1, String str2)
	{
		String result="";
		char[] c1, c2;
		if(str1.length()>str2.length())
		{
			c1 = str1.toCharArray();
			c2 = str2.toCharArray();
		}
		else {
			c1 = str2.toCharArray();
			c2 = str1.toCharArray();
			
		}
		int sum=0, extra=0,newNum=0;
		for(int i=c1.length-1, j=c2.length-1;j>=0;j--,i--)
		{
			sum = (c1[i]-48)+(c2[j]-48)+extra;
			newNum = sum%10;
			extra = sum/10;
			c1[i] = (char)(newNum+48);
			
		}
		if(extra!=0)
		{
			if(c1.length>c2.length)
			{
				c1[c1.length-c2.length-1] = (char)(c1[c1.length-c2.length-1]+1);
				if(c1[0]==':')
				{
					c1[0]='0';
					result = String.valueOf(1);
					result+=String.valueOf(c1);
				}
				else
					result = String.valueOf(c1);
			}
			else {
				result = String.valueOf(extra);
				result+=String.valueOf(c1);
			}
		}
		else
		{
			result = String.valueOf(c1);
		}
		return result;
	}

}
