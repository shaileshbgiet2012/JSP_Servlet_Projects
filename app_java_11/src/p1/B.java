package p1;

public class B { //NullPointer Exception
	static B b1;
	int x=10;
	public static void main(String[] args) {
		try {
			System.out.println(b1.x);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		System.out.println(1000);
	}

}
