package calculator;

class calculator{
	int a=10; int b=20;
	double result;
	 void addition(){
	   this.result= this.a+this.b;
	   System.out.println("your addtion is:"+this.result);
	}
	  private  void sub(){
	  this.result= this.a-this.b;
       System.out.println("your subtraction is:"+this.result);
	}
	   protected void muitiplication(double d,double e){
		 this.result=(int)d*(int)e;//explicit Casting
	   System.out.println("your muitiplication is:"+this.result);
	   }
	  public  void division(){
		int h=20;
		int k=25;
		double s;
		double j=h;//implicit Casting
		double l=k;
	    s= j/l;
	 System.out.println("your division is:" +s);
	}
	 public static void main(String[] args){
	 
	calculator c=new calculator();//object creation
	c.addition();
	c.sub();
	c.muitiplication(10,30);
	c.division();
	
}
}
