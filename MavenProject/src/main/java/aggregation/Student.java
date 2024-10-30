package aggregation;

public class Student {

	String studName;
	int studAge;
	int marks;
	 
	Address adr; //ref var
	 
	public Student(String studName,int studAge,int marks,Address adr) //constructor
	{
		this.studName=studName; //obj initialization through constructor
		this.studAge=studAge;
		this.marks=marks;
		this.adr=adr;
		
	}
	public void display()
	{
		
		System.out.println("Student name:" +studName);
		System.out.println("Student age:" +studAge);
		System.out.println("Student marks:" +marks);
		System.out.println("House name:" +adr.houseName);
		System.out.println("House No:" +adr.houseNo);
		System.out.println("place:" +adr.place);
		System.out.println("pin:" +adr.pin);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address objadr = new Address("ABC",124,"TVM",691554);
		Student objstud =new Student("Ann",20,50,objadr);
		
		objstud.display();

	}

}
