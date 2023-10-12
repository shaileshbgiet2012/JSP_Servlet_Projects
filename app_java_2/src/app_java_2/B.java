package app_java_2;

public class B { //Constructor Overloading
	
	B(){//no of args=0
	System.out.println(1);	
	}
	B(int x){// no of args=1
	System.out.println(x);	
	}
	B(int x, int y){// no of args=2
    System.out.println(x);
    System.out.println(y);
	}
	public static void main(String[] args) {
		B b1=new B();
		B b2=new B(2);
		B b3=new B(3);
	}
}

