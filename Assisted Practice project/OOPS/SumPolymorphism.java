package OOPS;

public class SumPolymorphism {
	public int  sum(int x, int y) {
		return (x+y);		
	}
	public int  sum(int x, int y,int z) {
		return (x+y+z);		
	}
	public double  sum(double x,double y) {
		return (x+y);		
	}
  public static void main(String agrs[]) {
	  SumPolymorphism s=new SumPolymorphism();
	  System.out.println(s.sum(5, 7));
	  System.out.println(s.sum(5, 7,9));
	  System.out.println(s.sum(5.8, 5.6));


  }
}

