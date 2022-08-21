package javaprt;

public class whiteSpacescount {

	public static void main(String[] args) {
		
		String str="adc assd asd a d a  d";
		int count=0;
		
		for (int i=0; str.length()-1>=i; i++)
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
