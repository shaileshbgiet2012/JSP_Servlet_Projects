package jdbc_demo;

public class E {//Finally
	public static void main(String[] args) {
		try {
			int x=10/0;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println(100);
		}
	}

}
