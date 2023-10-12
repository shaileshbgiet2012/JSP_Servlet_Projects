package p1;

public class C { //Number Format Exception
	public static void main(String[] args) {
		//String-->Integer
//		String x="100";
//		
//		int val1 = Integer.parseInt(x);
//		System.out.println(val1);
//		
//		//String-->Float
//		
//		String y="10.3";
//		float val2 = Float.parseFloat(y);
//		System.out.println(val2);
//		
//		//String-->Boolean
//	    String z="true";
//	    boolean val3 = Boolean.parseBoolean(z);
//	    System.out.println(val3);
//----------------------------------------------------
		
		//String-->Integer
		try {
			String x="mike";
			int val1 = Integer.parseInt(x);
			System.out.println(val1);
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}System.out.println(100);
	}

}
