package app_java_9;

public class B {
	public static void main(String[] args) {
		A a1=new A();
		a1.setId(100);
		
		int x=a1.getId();
		a1.setName("mike");
		String name= a1.getName();
		System.out.println(x);
		System.out.println(name);
		
	}

}
