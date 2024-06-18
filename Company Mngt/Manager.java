package company.com;

public class Manager extends Employee {
	
	private String department;
	public Manager(String name, int id, double salary) {
		super(name, id, salary);	
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Manager [department=" + department + "]";
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Department : " + department);
	}
	
	

	
}
