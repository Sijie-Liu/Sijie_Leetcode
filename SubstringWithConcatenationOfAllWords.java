package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubstringWithConcatenationOfAllWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "barfoothefoobarman";
		String[] words = {"foo", "bar"};
		List<Integer> result = findSubstring(s, words);
		for(int i:result)
		{
			System.out.println(i);
		}
	}
	
	public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<Integer>();
        int unitLen = words[0].length();
        int totleLen = unitLen*words.length;
        HashMap<String,Integer> map = new HashMap<String,Integer>(); 
        for(String word: words)
        {
        	map.put(word, 1);
        }
        boolean flag = true;
        for(int i=0;i<=s.length()-totleLen;i++)
        {
        	flag = true;
        	String tmp = s.substring(i, i+totleLen);
        	for(int j=0;j<=tmp.length()-unitLen;j+=unitLen)
        	{
        		String key = tmp.substring(j, j+unitLen);
        		if(!map.containsKey(key))
        		{
        			flag = false;
        			break;
        			
        		}
        		else if(map.get(key)==0){
        			flag = false;
					break;
				}
        		else {
					map.put(key, 0);
				}
        	}
        	if(flag)
        	{
        		result.add(i);
        	}
        	
        	for(String word: words)
            {
            	map.put(word, 1);
            }
        }
        
        return result;
        
    }

}
