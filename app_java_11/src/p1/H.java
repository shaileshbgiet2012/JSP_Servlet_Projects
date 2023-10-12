package p1;

public class H {
	public static void main(String[] args) {
		int[]x= {1,1,2,3,4,4,5};
		int []temp=new int [x.length];
		int j=0;
		
		for (int i = 0;  i< x.length-1; i++) {
			if(x[i]!=x[i+1]) {
				temp[j]=x[i];
				j++;
			}temp[j]=x[x.length-1];
			for (int arr : temp) {
				System.out.println(arr);
			}
		}
		}

}
