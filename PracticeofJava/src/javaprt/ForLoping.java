package javaprt;

public class ForLoping {

	public static void main(String[] args) {
		
	
		for (int i=1; 4>=i; i++)
		{
			for (int j=1; j<=i; j++)
			{
			System.out.print(" ");
		
			}
			for(int k=4; k>=i; k--)
			{
				System.out.print("*");
			}
			
			
			System.out.println();
		}
		
	}

}
/*	for (int i=0; 10>=i; i++)
{
	System.out.println(i);
}
int i=0;
while(10>=i)
{
	System.out.println(i);
	i++;
}
int i=0;
do
{
	System.out.println(i);
	i++;
}
while(10>=i);*/