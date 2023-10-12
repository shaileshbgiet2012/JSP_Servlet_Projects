package p3;

public class B {
	public static void main(String[] args) {
//		A a1=()->{
//			System.out.println(100);
//			System.out.println(200);
//		};
//		a1.test1();
 
	A a1=(int x)->
		System.out.println(x);
	a1.test2(100);
	}

}
