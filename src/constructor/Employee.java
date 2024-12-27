package constructor;

public class Employee {
	int empId;
	String empName;
	
	public Employee(int empId,String empName) //constructor
	{
		this.empId=empId;
		this.empName=empName;
	}

	public static void main(String[] args) {
		Employee e=new Employee(101, "Heeya");
		//System.out.println(e.empId);
		//System.out.println(e.empName);
		e.display();

	}
	
	public void display() //method
	{
		System.out.println(empId);
		System.out.println(empName);
	}
	
	
	

}
