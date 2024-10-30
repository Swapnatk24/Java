package Inheritance; //simple inheritance

public class Car extends Vehicle{

	String model= "Duster";
	int price = 1000000;
	
	public void carmethod()
	{
		System.out.println("Model and price of  the car  is: " + model);
		System.out.println(" Price of  the car  is: "  +price);
	}	
	
	public static void main(String[] args) {
		
		
		Car obj=new Car();
		obj.carmethod();
		obj.vehicle();
		System.out.println(obj.name);
	}

}
