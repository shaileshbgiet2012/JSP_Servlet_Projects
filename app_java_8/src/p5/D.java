package p5;

// Java 8 main method are allowed in an interface

public interface D {
	public static void main(String[] args) {
		D.test();
	}
	public static void test() {
		System.out.println(100);
	}

}
