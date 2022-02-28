package assigment2;
//default Constructor
public class ConstructorsTypes {
 void bike1(){
		System.out.println("i am in default constructor");	

	}

	public static void main(String[] args) {
		ConstructorsTypes b=new ConstructorsTypes();
		b.bike1();

	}

}
//Parameterized Constructpr
 class ConstructorsStudents{
	int id;
	String name;
	ConstructorsStudents(int i,String name) {
		this.id=i;
	    this.name=name;		
	}
	void dispaly() {
		System.out.println(id+""+name);
	}

	public static void main(String[] args) {
			ConstructorsStudents obj=new ConstructorsStudents(234, "raham");
			ConstructorsStudents obj1=new ConstructorsStudents(222, "deepu");
			 obj.dispaly();
			obj1.dispaly();
			
		}
	
 }


