package OOPS;

public class Encapsulate {
    private String Name;
    private int Roll;
    private int Age;
    
    public int getAge()
    {
    	return Age;
    }
    public int getRoll()
    {
    	return Roll;
    }
    public String getName()
    {
    	return Name;
    }
    public void setName(String newName)
    {
    	 Name=newName;
    }
    public void setRoll(int newRoll)
    {
    	 Roll=newRoll;
    }
    public void setAge(int newAge)
    {
    	 Age=newAge;
    }

  public class TestEnscapsulation{
    
    public static void main(String[] args) {
	 Encapsulate obj=new Encapsulate();
	 obj.setName("Raham");
	 obj.setAge(22);
	 obj.setRoll(225);
	 System.out.println("MY name is "+obj.getName() +" Roll Number is "+obj.getRoll()+" Age is "+obj.getAge());
	}
}}
