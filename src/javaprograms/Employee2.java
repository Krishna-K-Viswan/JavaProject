package javaprograms;

public class Employee2 {
	int empId;
	String empName;
	String empDesg;
	int empAge;
	public Employee2(int i, String s, String s2, int j) {
		empId=i;
		empName=s;
		empDesg=s2;
		empAge=j;
	}
	public static void main(String[] args) {
		Employee2 e2=new Employee2(101,"arya","st",23);
		System.out.println(e2.empId);
		System.out.println(e2.empName);
		System.out.println(e2.empDesg);
		
	}

}
