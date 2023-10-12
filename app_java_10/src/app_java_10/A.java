package app_java_10;

public class A {//Exception Handling
	public static void main(String[] args) {
		
//		int x=10;
//		int y=0;
//		int z=x/y;
//		System.out.println(z);
//		System.out.println("welcome");
	try {
		int x=10;
		int y=0;
        int z=x/y;
	} catch (Exception e) {
		System.out.println(e);
	}
	System.out.println("welcome");
	
	}

}
