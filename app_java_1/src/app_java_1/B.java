package app_java_1;

public class B {
	int x=10;
	 public static void main(String[] args) {
		B b1=new B();
		System.out.println(b1.x);
		b1.x=100;
		System.out.println(b1.x);
		
		B b2= new B();
		System.out.println(b2.x);
	}

}
