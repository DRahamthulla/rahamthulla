package Excepation;

public class DemoForTryAndCatch {
	public static void main(String agrs[]) {
			 int a=10;
			 int b=0;
			 try {
				 System.out.println(a/b);
		
		} catch (ArithmeticException e) {
			System.out.println("plz do give b value as zero");
		}
		
		
	}

}
