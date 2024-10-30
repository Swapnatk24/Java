package Inheritance;

public class Son extends Father{
	
String sonName="Ajo";
	
	public void sonMeth() {
		// TODO Auto-generated method stub
		System.out.println("Name of son is :" + sonName );

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Son obj =new Son();
		obj.grandpa();
		obj.fatherMeth();
		obj.sonMeth();
		
		Daughter obj2 = new Daughter();
		obj2.daughtMeth();
		
	}

}
