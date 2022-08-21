package javaprt;

public class PolidromeString {

	public static void main(String[] args) {
		
		String str="madam";
		String rev="";
		for (int i=str.length()-1; i>=0; i--)

		{
			rev=rev+str.charAt(i);
		}
		if (str.endsWith(rev))
		{
			System.out.println("polidome String");
		}
		else
		{
			System.out.println("not polidrome");
		}
	}

}
