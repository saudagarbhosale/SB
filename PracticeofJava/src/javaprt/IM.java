package javaprt;

public class IM implements I1,I2 {

	public static void main(String[] args) {
		IM i=new IM();
		i.add();
		i.sub();
		
		
		
	}

	@Override
	public void add() {
		
		System.out.println("abstract");
	}

	@Override
	public void sub() {
		System.out.println("no static");
		
	}

}
