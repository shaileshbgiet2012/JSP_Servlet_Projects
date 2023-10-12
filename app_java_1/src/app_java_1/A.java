
package app_java_1;

public class A {
	int x=10;              //Non static
	static int y=100;     //static
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.x);
	    System.out.println(A.y);

	}

}
