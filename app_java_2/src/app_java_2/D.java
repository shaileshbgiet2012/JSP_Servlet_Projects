package app_java_2;

public class D { //this keyword
	
//	public static void main(String[] args) {
//		D d1=new D();
//		System.out.println(d1);
//		d1.test();
//	}
//	public void test() {
//		System.out.println(this);
//	}
//------------------------------------------------
	
//	int x=100;
//	public static void main(String[] args) {
//		D d1=new D();
//		System.out.println(d1.x);
//		d1.test();
//	}
//	public void test() {
//		System.out.println(this.x);
//	}
//-------------------------------------------------
	
	public static void main(String[] args) {
		D d1=new D();
		d1.test();
		D d2=new D();
		d2.test();
		d1.test(); 
	}
	public void test() {
		System.out.println(this);
	}
}
