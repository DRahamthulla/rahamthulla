package OOPS;

public class VehicleInheritance {
	  protected String brand = "Ford";       
	  public void honk() {                   
	    System.out.println("vehical is running");
	  }
	}

	class Car extends VehicleInheritance {
	  private String modelName = "Mustang";   
	  public static void main(String[] args) {

	    Car myCar = new Car();
	    myCar.honk();
	    System.out.println(myCar.brand + " " + myCar.modelName);
	  }
	}