package javaprt;

public class Inheritances extends Methods {
	
	public void sts1()
	{
		int a=120;
		System.out.println("This is Static 1");
		System.out.println(a);
		System.out.println(super.a);
		
		
		
		
	}

	public static void main(String[] args) {
		
		Inheritances s=new Inheritances();
		Inheritances.sts();
		Inheritances.sts(30);

	}
	
	
}

class Methods
{
	 int a=10; int b=20;
	
	
	public static void sts()
	{
		System.out.println("This is Static Method");
	}
	public static void sts(int a)
	{
		
		 System.out.println("Static Method :"+a);
	}
	
	
}