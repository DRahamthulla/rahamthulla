package OOPS;

class StudentForClassAndObject{  
    int id;  
    String name;  
    int age;
   
public StudentForClassAndObject(int id,String name,int age) {
	this.id=id;
	this.name=name;
	this.age=age;
}
 public int getId(){
	   return id;
   }
 public String getname(){
	   return name;
 }
 public int getAge() {
	   return age;
 }
 public String classRoom() {
	 return("hi my name is " + this.name+" my id is " + this.id+" my age is "+ this.age);
 }
	 
 
    public static void main(String args[]){  
     StudentForClassAndObject s1=new StudentForClassAndObject(292, "raham", 22);  
     s1.classRoom();
     System.out.println(s1.classRoom());
    }
}