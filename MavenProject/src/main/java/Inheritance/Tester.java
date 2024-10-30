package Inheritance;

public class Tester extends Employee{

	int empSalary=25000;
	
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Tester has a salary of " + empSalary );

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tester obj =new Tester();
		obj.display();
		obj.test();
		Developer objdev= new Developer(); //to get both
		objdev.dev();

	}

}
