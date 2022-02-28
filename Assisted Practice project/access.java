package access;
 
class  Animal {
	protected void display(){
		System.out.println("I am in procted class");
	}
    public void dispaly1() {
    	System.out.println("I am in public class");
    }
    private void dispaly2() {
    	System.out.println("I am in private class");
    }
    public static void main (String[] args) {	
    	Animal obj=new Animal();
        obj.dispaly2(); 
	}
}
class Dog extends Animal{
	public static void main(String[] args) {
	Dog obj=new Dog();
	obj.display();
	obj.dispaly1();
	}
}