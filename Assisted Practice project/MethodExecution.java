package assigment2;

public class MethodExecution {

public int multipynumbers(int a,int b) {
	int z=a*b;
	return z;
}

public static void main(String[] args) {

	MethodExecution b=new MethodExecution();
	int ans= b.multipynumbers(10,3);
	System.out.println("Multipilcation is :"+ans);
	}
}
//MethodExecution by value
class operation{
	int data=50;
int change (int data) {
	 data=data+100;
	 return(data);
}
public static void main(String[] args) {
	operation op =new operation();
	System.out.println("before change"+op.data);
	op.change(60);
	System.out.println("after change"+op.data);	
}

}
//method Overloading
class Adder{
	int add(int a,int b) {
		int c=a+b;
		return c;
		}
	int add(int a,int b,int c) {
		int d=a+b;
		return d;
		}	
class TestOverloading{
	public static void main(String[]args) {
	 Adder a=new Adder();
	System.out.println("for 1st method"+a.add(20, 50));	
	System.out.println("for 2nd method" +a.add(20, 20, 40));	
	}
	
}
}










