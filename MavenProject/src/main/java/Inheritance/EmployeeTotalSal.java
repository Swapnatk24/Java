package Inheritance;

public class EmployeeTotalSal extends Hra_Pf{

	float sal;
	public void totalsal()
	{
		 sal = pay+hra-pf-deduction+bonus;  //sal=pay+hra+bonus-pf-deduct
		 System.out.println("Total salary is : " + sal);
	}
	
	
	public static void main(String[] args) {
		
		EmployeeTotalSal obj = new EmployeeTotalSal();
		obj.basic();
		obj.calculate();
		obj.totalsal();

	}

}

