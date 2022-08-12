package javaprt;

public class contructorchaining {
	
	
	contructorchaining(){
		this(2);
		System.out.println("1");
		
	}
	
contructorchaining(int a){
		this("cons");
		System.out.println("2 :"+a);
	}

contructorchaining(String a){
	
	System.out.println("3"+a);
}
	

	public static void main(String[] args) {
		
		contructorchaining s=new contructorchaining();
	}

}
