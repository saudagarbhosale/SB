package javaprt;

public class WhiteSpaceInString {

	public static void main(String[] args) {
		
		String str="ab ac ad av af";
		int count=0;
	
		for (int i=0; str.length()-1>=i; i++ )
		{
			char c = str.charAt(i);
			if (c==' ')
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
