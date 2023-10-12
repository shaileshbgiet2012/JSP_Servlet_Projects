package app_java_6;

public class B extends A {//overriding
	public void test() {
		System.out.println(500);
	}
	
	public static void main(String[] args) {
		B b1= new B();
		b1.test();
	}

}
