package app_java_1;

public class D {//void
	public static void main(String[] args) {
		
//		D d1=new D();
//		int x = d1.test();
//		System.out.println(x);
//	}
//	public int test() {// void can not return any value
//		return 100;
		
//		D d1=new D();
//		int test = d1.test();
//}
//	public int test() {
//		return 100;//Error
		
//		D d1= new D();
//		String x = d1.test();
//		System.out.println(x);
//		
//	}
//	public String test() {
//		return "mike";

	
//		D d1= new D();
//		double x = d1.test();
//		System.out.println(x);
//		}
//	public double test() {
//		return 10.3;
		
		
//		D d1= new D();
//		d1.test();
//	}
//	public void test() {
//		System.out.println(100);
//		return;
//		System.out.println(500);// Unreachable code error because after return keyword, any value can not run.

//	int x= D.test();
//	System.out.println(x);
//	}
//	public static int test() {
//		return 10000;
		
		
//		D d1=new D();
//		d1.test(10,10.3,"mike",'a',true);
//	}
//	public void test(int i, double d, String s, char c, boolean b) {
//		System.out.println(i);
//		System.out.println(d);
//		System.out.println(s);
//		System.out.println(c);
//		System.out.println(b);
		
		
		D d1=new D();
		d1.test(10,20,30,40,50);
	}
	public void test(int...x) {
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
		System.out.println(x[4]);
	}

}
