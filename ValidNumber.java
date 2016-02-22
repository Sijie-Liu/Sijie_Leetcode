package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.naming.spi.DirStateFactory.Result;

public class ValidNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isNumber("12 "));
	}

	public static boolean isNumber(String s) {

		// Pattern p1 = Pattern.compile("[0-9]+\\.[0-9]+");
		// Matcher m1 = p1.matcher(s);
		//
		// Pattern p2 = Pattern.compile("[0-9]+");
		// Matcher m2 = p2.matcher(s);
		//
		// return m1.matches() || m2.matches();
		String str = s.trim();
		if (str.length() <= 0)
			return false;
		boolean result = true;
		int point = 0;
		int indexP = -1;
		int indexE = -1;
		int e = 0;
		int len = str.length();

		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) < '0' || str.charAt(i) > '9')
					&& str.charAt(i) != '.' && str.charAt(i) != 'e') {
				result = false;
				return result;
			}
			if (str.charAt(i) == '.') {
				point++;
				indexP = i;
				if (point > 1)
					return false;
				if (str.length() == 1)
					return false;
			}
			if (str.charAt(i) == 'e') {
				e++;
				indexE = i;
				if (e > 1)
					return false;
				if (i==len-1 || i==0)
					return false;
			}

		}

		if(indexP-indexE>=-1)
			return false;
		return true;
	}

}
