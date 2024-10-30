package Inheritance;

public class Developer extends Employee{
	
	String empDomain="Java Dev";
	
	public void dev() {
		// TODO Auto-generated method stub
		System.out.println("Employee is a " +empDomain);

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer obj = new Developer();
		obj.display();
		obj.dev();
	
		

	}

}
