package p1;

public class D {//ArrayIndexOutOfBoundsException leetcode.com
	public static void main(String[] args) {
		int []  x= new int[4];
		System.out.println(x);
		x[0]=10;
		x[1]=20;
		x[2]=30;
		x[3]=40;
		
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
		System.out.println(x[4]);
	}

}
