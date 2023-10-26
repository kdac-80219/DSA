import java.util.Scanner;

public class TestEmployeeSearch {

	public static int LinearEmployeeSearchbyId(Employee[] arr, int size, int id)
	{
		for(int i=0;i<size;i++)
		{
			if(arr[i].getEmpId() == id)
			{
				System.out.println("Employee Found!!!");
				System.out.println("Employee ID "+arr[i].getEmpId());
				System.out.println("Employee Name = "+arr[i].getName());
				System.out.println("Employee Salary = "+arr[i].getSalary());
				return i;
			}
		}
		return -1;
	}

	public static int LinearEmployeeSearchbyName(Employee[] arr, int size, String name)
	{
		for(int i = 0;i<size;i++)
		{
			if(arr[i].getName().equals(name))
			{
				System.out.println("Employee Found!!!");
				System.out.println("Employee ID "+arr[i].getEmpId());
				System.out.println("Employee Name = "+arr[i].getName());
				System.out.println("Employee Salary = "+arr[i].getSalary());
				return i;
			}
		}
		return -1;
	}

	public static int LinearEmployeeSearchbySalary(Employee[] arr, int size, double salary)
	{
		for(int i = 0;i<size;i++)
		{
			if(arr[i].getSalary() == salary)
			{
				System.out.println("Employee Found!!!");
				System.out.println("Employee ID "+arr[i].getEmpId());
				System.out.println("Employee Name = "+arr[i].getName());
				System.out.println("Employee Salary = "+arr[i].getSalary());
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee[]arr = new Employee[5];
		
		arr[0] = new Employee(19,"Vinayak",95000);
		arr[1] = new Employee(6 , "Shiva" ,78500);
		arr[2] = new Employee(2 ,  "Abhi"   ,88500);
		arr[3] = new Employee(16,"Vaibhav",66000);
		arr[4] = new Employee(23,"Akash",100000);

		
		System.out.println("Enter ID = ");
		int KeyId = sc.nextInt();
		int empIdFountAtIndex = LinearEmployeeSearchbyId(arr,arr.length,KeyId);
		if(empIdFountAtIndex == -1)
		{
			System.out.println("Element not found!!!!");
		}
		System.out.println("--------------------------------------------------------");
		
		
		System.out.println("Enter Name = ");
		String KeyName = sc.next();
		int empNameFountAtIndex = LinearEmployeeSearchbyName(arr,arr.length,KeyName);
		if(empNameFountAtIndex == -1)
		{
			System.out.println("Element not found!!!!");
		}
		System.out.println("--------------------------------------------------------");

		
		System.out.println("Enter Salary = ");
		double KeySalary = sc.nextDouble();
		int empSalaryFountAtIndex = LinearEmployeeSearchbySalary(arr,arr.length,KeySalary);
		if(empSalaryFountAtIndex == -1)
		{
			System.out.println("Employee not found!!!!");
		}
		System.out.println("--------------------------------------------------------");


	}

}
