
public class Employee {
	String ID;
	String FirstName;
	String LastName;
	String DepartmentName;
	String DepartmentID;
	double Salary;
	
	
	public String getID() {
		return ID;
	}	
	public String GetFirstName() {
		return FirstName;
	}	
	public String getLastName() {
		return LastName;
	}	
	public String getDepartmentName() {
		return DepartmentName;
	}		
	public String setDepartmentID() {
		return DepartmentID;
	}	
	public double setSalary() {
		return Salary;
	}	
	public void setSalary(double Salary) {
		this.Salary = Salary;
	}	
	public double getAnnualSalary() {
		return Salary * 12;
	}
	public double raiseSalary(double Percent) {
		Salary += (Salary * Percent);
		return Salary;
	}
	
	public static void main(String[] args) {
		Employee Employee1 = new Employee();
		Employee Employee2 = new Employee();
		
		Employee1.ID = "2021-105341";
		Employee2.FirstName = "Stephen";
		Employee2.LastName = "Sevilla";
		Employee1.DepartmentID = "2";
		Employee1.DepartmentName = "HRM department";
		Employee1.setSalary(25000.00);
		Employee2.setSalary(30000.00);
		
		
		System.out.println("Employee ID: " + Employee1.ID);
		System.out.println("Employee Name: " + Employee2.FirstName + "" + Employee2.LastName);
		System.out.println("Department ID : " + Employee1.DepartmentID);
		System.out.println("Department Name : " + Employee1.DepartmentName);
		System.out.println("Salary: " + Employee1.Salary);
		System.out.println("Salary: " + Employee1.Salary);
		
		
		Employee1.raiseSalary(0.25);
		Employee2.raiseSalary(0.30);
		
		
		System.out.println("Annual Salary: " + Employee1.getAnnualSalary());
		System.out.println("Annual Salary: " + Employee2.getAnnualSalary());
}
}