package Inheritance; //multilevel inheritance

public class Puppy extends Dog {

	
	String color="Brown";
     public void display()
     {
    	 System.out.println("Color of the puppy is :" + color);
     }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Puppy obj = new Puppy();
		obj.breedmethod();
		obj.show();
		obj.display();
		System.out.println(obj.breed);
	}

}
