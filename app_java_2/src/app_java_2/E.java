package app_java_2;

public class E { 
	
//	E(){ //Constructor chaining
//		System.out.println(1);
//	}
//	E(int x){
//		this();
//	}
//	E(int x, int y){
//		this(100);
//	}
//	public static void main(String[] args) {
//		E e1=new E(10,20);
//	}
//-----------------------------------------------
	
	void E() { //Default Constructor
		System.out.println(10);
	}
	public static void main(String[] args) {
		E e1=new E();
		e1.E();
	}
}
