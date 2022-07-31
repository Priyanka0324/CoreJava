package oops;

public class Employee {
	
	public String Name;
	public int EmpId;
	public String Dept;
	
	public Employee() { // Default constructor
		System.out.println("Default constructor");
	}
	
	public Employee(String P1,int P2,String P3) { //Parameterized constructor
		Name =P1;
		EmpId = P2;
		Dept = P3;
	}
	
	public void Display () {
		
		System.out.println(Name);
		System.out.println(EmpId);
		System.out.println(Dept);
	}

}
