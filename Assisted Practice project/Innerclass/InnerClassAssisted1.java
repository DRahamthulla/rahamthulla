package Innerclass;

public class InnerClassAssisted1 {
	private String msg="Welcome to java";
	 
	class inner{
		 public void hello(){
			System.out.println(msg+" i am in inner class");
		
			
		}
	}

	public static void main(String[] args) {
	 InnerClassAssisted1 obj =new InnerClassAssisted1();
	 InnerClassAssisted1.inner in=obj.new inner();
	 in.hello();
	 

	}

}
