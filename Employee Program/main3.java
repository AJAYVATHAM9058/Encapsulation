/* Write a Java program to create a class called Employee
 * with private instance variables employee_id, employee_name, 
 * and employee_salary. Provide public getter and setter methods to access 
 * and modify the id and name variables, but provide a getter method for the salary variable that returns a formatted string. */
public class main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		emp1.setEmployeeId(125);
		emp1.setEmployeeName("Anil Kapoor");
		emp1.setSalary(45000.00);
		
		emp2.setEmployeeId(124);
		emp2.setEmployeeName("Ajay Vittal");
		emp2.setSalary(39800.00);

	
		System.out.println("Employee Details \n");
		System.out.println("Name "+emp1.getEmployeeName());
		System.out.println("ID "+emp1.getEmployeeId());
		System.out.println("Salary "+emp1.getFormattedSalary());
		
		System.out.println("\nName  "+emp2.getEmployeeName());
		System.out.println("ID  "+emp2.getEmployeeId());
		System.out.println("Salary  "+emp2.getFormattedSalary());
	
	}

}
