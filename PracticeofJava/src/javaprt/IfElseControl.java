package javaprt;

public class IfElseControl {
	int a=10;
	int b=10;
	int c=10;
	public static void main(String[] args) {
		
		
		IfElseControl s=new IfElseControl();
               s.ifE();
	}
	int e=10;
	public void ifE()
	{
		
		if (a==20)
		{
		
		if(a==20)
			{
				System.out.println(true);
			}
			else
			{
				if(a==c)
				{
					System.out.println("true from else of second if");
				}
			}
		}
		else if(e==10)
		{
			System.out.println("else if");
		}
	}

}
