package Excepation;

public class MainExceptionHalding {
	public static void main(String agrs[]) {
		try {
		int a[]=new int[3];
		System.out.println("Acess element is :"+a[3]);
	}catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Exception throw:" +e);
	}
		System.out.println("Out of the Block");
	}

}
