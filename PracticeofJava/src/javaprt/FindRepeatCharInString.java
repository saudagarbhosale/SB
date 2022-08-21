package javaprt;

import java.util.HashMap;
import java.util.Set;

public class FindRepeatCharInString {

	public static void main(String[] args) {
		
		String str="agscccbdbsdbhnddssafa";
		
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		
		for(int i=0; str.length()-1>=i; i++)
		{
			char ch = str.charAt(i);
			
			if (map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
     System.out.println(map);
     
     Set<Character> key = map.keySet();
     for(Character k:key)
     {
    	 System.out.println(k+":"+map.get(k));
     }
	}

}
