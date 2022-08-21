package javaprt;

import java.util.HashMap;
import java.util.Set;

public class FindrepeatSringInParagraph {

	public static void main(String[] args) {
		
	String str="abc abcd abc abc xyz abcd dgs xyz";
	
	String ar[]=str.split(" ");
	
	HashMap<String, Integer> map=new HashMap<String, Integer>();
	
	for (int i=0; ar.length-1>=i; i++)
	{
		String s1=ar[i];
		if (map.containsKey(s1))
		{
			map.put(s1, map.get(s1)+1);
		}
		else
		{
			map.put(s1, 1);
		}
	}
	System.out.println(map);
	  
	   Set<String> str2 = map.keySet();
	   for(String s:str2)
	   {
		   System.out.println(s);
	   }

	}

	private static Object s2(Set<String> str2) {
		// TODO Auto-generated method stub
		return null;
	}

}
