
public class Employee {

	private int employee_id;
	private String employee_name;
	private double salary;
	
	public int getEmployeeId() {
		return employee_id;
	}
	public void setEmployeeId(int employee_id) {
		this.employee_id = employee_id;
	}
	
	public String getEmployeeName() {
		return employee_name;
	}
	public void setEmployeeName(String employee_name) {
		this.employee_name = employee_name;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getFormattedSalary() {
		return String.format("$%.2f", salary);
	}
	
	
	
}
