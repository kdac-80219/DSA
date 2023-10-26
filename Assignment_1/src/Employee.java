import java.util.*;
public class Employee {
	private int empId;
	private String name;
	private double salary;
	public Employee() {
		super();
	}
	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee ID = ");
		this.empId  = sc.nextInt();
		System.out.println("Enter Employee Name = ");
		this.name = sc.nextLine();
		System.out.println("Enter Employee Salary = ");
		this.salary = sc.nextDouble();
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
