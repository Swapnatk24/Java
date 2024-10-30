package superkeyword;

public class Child extends Parent{

  String name="EFG";
	
	public void display()
	{
		
		System.out.println("Child class method" );
		System.out.println(name);
		super.display(); //method can be called in cons also
		System.out.println(super.name); 
		
	}
	public Child(String name)
	{ 
		super("SDF"); 
		System.out.println("Child class cons");
		//super.display();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj= new Child("Ann");
		obj.display();
		
	}

}
