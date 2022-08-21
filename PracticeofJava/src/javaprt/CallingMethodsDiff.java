package javaprt;

public class CallingMethodsDiff {
public static void main(String[] args) {
		
	
	      CallingMethodsDiffa s=new CallingMethodsDiffa();
	      s.sub();
	      CallingMethodsDiffa. add();
	      
		}
}



 class CallingMethodsDiffa
{
	
	int a =30;
	int b;

	
	
	public static void add()
	{
		
		int a=10;
		int b=20;
		a=a+b; //30
		b=a-b; //10
		a=a-b;
		System.out.println("a :"+a+"  b :"+b);
	}

	public void sub()
	{
		
		int a;
		a=40;
		b=30;
		System.out.println(a);
	    System.out.println(this.a);
	}
	
}
