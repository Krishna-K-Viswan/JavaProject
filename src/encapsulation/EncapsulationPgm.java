package encapsulation;

class Employee{
	private int empId;
	private String empName;
	private String empDesignation;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	
}

public class EncapsulationPgm {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEmpId(111);
		e.setEmpName("Aqua");
		e.setEmpDesignation("Tester");
		System.out.println(e.getEmpId());
		System.out.println(e.getEmpName());
		System.out.println(e.getEmpDesignation());
		

	}

}
