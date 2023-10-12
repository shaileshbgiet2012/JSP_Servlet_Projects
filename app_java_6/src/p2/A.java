package p2;

public class A {//OverLoading
	public void test() {//args=0
		System.out.println(1);
	}
	public void test(int x) {//args=1
		System.out.println(x);
	}
	public static void main(String[] args) {
		A a1=new A();
		a1.test();
		a1.test(100);
	}

}
