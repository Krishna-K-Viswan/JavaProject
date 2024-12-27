package inheritance;

class Members{
	
	String name;
	int age;
	int phoneNumber;
	String address;
	int salary;
	public void printDetails() {
	    System.out.println("Name= "+name);
		System.out.println("Age= "+age);
		System.out.println("PhoneNumber= "+phoneNumber);
		System.out.println("Address= "+address);
		System.out.println("Salary= "+salary);
	}
}

class Employee extends Members{
	int dataMembers;
	String specialization;
	String department;
}

class Manager extends Members{
	int dataMembers;
	String specialization;
	String department;
}

public class MemberInheritance {

	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.name="Anju";
		e.age=20;
		e.phoneNumber=876543215;
		e.address="Trivandrum";
		e.salary=25000;
		System.out.println(e.dataMembers=10);
		System.out.println(e.specialization="QA");
		System.out.println(e.department="Testing");
		e.printDetails();
		Manager m=new Manager();
		m.name="Anju";
		m.age=20;
		m.phoneNumber=876543215;
		m.address="Trivandrum";
		m.salary=25000;
		System.out.println(m.dataMembers=10);
		System.out.println(m.specialization="QA");
		System.out.println(m.department="Testing");
		m.printDetails();
		
	}
}


