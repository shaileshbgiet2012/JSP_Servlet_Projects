package app_java_2;

public class C {
	C(char x ){// No of args =1 type=char
		System.out.println(x);
	}
	C(int x){ //No of args =1 type=char
		System.out.println(x);
	}
	C(String x){////No of args =1 type=String
		System.out.println(x);
	}
	public static void main(String[] args) {
		C c1=new C('a');
		C c2=new C(100);
		C c3=new C("mike");
	}
}
