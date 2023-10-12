package p1;

public class I {//Sorting Array
	public static void main(String[] args) {
		int[]x= {28,23,21,14,7,30};
		
		for(int j=0; j<5; j++)
		for (int i = 0; i < x.length-1; i++) {
			if(x[i]>x[i+1]) {
				int temp;
				temp=x[i];
				x[i]=x[i+1];
				x[i+1]=temp;	
			}	
		    }for(int m:x) {
			System.out.println(m);
		}
	}

}
