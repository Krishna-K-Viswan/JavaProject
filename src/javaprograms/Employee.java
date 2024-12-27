package javaprograms;

public class Employee {
	
	int empId;
	String empName;
	String empDesg;
	int empAge;
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.empId=101;
		e1.empName="Anie";
		e1.empDesg="ST";
		e1.empAge=25;
		System.out.println(e1.empId);
		System.out.println(e1.empName);
		System.out.println(e1.empDesg);
		
		}

}
