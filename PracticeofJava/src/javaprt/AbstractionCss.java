package javaprt;

class AbstractionCss extends Ab {

	/* public static void add()
	 {
		 System.out.println("I am Static");
	 }*/
	@Override
	public void sub() {
		System.out.println("I am abstract");
		
	}

	public void div()
	{System.out.println("I am non static");
		
	}
	
	public static void main(String[] args) {
		AbstractionCss.add();
		AbstractionCss cs=new AbstractionCss();
		cs.div();	
		cs.sub();	}
	

}
 abstract class Ab
 {
	 public static void add()
	 {
		 System.out.println("static");
	 }
		
		public abstract void sub();
		
		public void div()
		{
			
		}
 }