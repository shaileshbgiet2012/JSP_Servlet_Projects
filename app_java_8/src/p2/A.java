package p2;
@FunctionalInterface
public interface A {//Default Keywords
	
//	default public void test1() {
//		System.out.println(100);
//	}
	
	
	public void test1();
	default public void test2() {
		System.out.println(2);
	}
	default public void test3() {
		System.out.println(3);
	}
}
