import java.util.Scanner;

public class TestEmpByBinarySearch {

	public static int BinaryEmployeeSearchbyId(Employee[] arr, int size, int id)
	{
		int left=0,right=size-1,mid;
		while(left<=right)
		{
			mid = (right+left)/2;
			
			if(id == arr[mid].getEmpId()) 
			{
				System.out.println("Employee Found at index = "+mid);
				System.out.println("Employee ID "+arr[mid].getEmpId());
				System.out.println("Employee Name = "+arr[mid].getName());
				System.out.println("Employee Salary = "+arr[mid].getSalary());	
				return mid;
			}
			else if(id < arr[mid].getEmpId())
			{
				right = mid-1;
			}
			else
			{
				left = mid+1;
			}
		}
		return -1;
	}

	public static int BinaryEmployeeSearchbyName(Employee[] arr, int size, String name)
	{

		int left=0,right=size-1,mid;
		while(left<=right)
		{
			mid = (right+left)/2;
			
			if(arr[mid].getName().equals(name)) 
			{
				System.out.println("Employee Found at index = "+mid);
				System.out.println("Employee ID "+arr[mid].getEmpId());
				System.out.println("Employee Name = "+arr[mid].getName());
				System.out.println("Employee Salary = "+arr[mid].getSalary());	
				return mid;
			}
			else if((name.compareTo(arr[mid].getName())==-1))
			{
				right = mid-1;
			}
			else
			{
				left = mid+1;
			}
		}
		return -1;
		
	}

	public static int BinaryEmployeeSearchbySalary(Employee[] arr, int size, double salary)
	{
		int left=0,right=size-1,mid;
		while(left<=right)
		{
			mid = (right+left)/2;
			
			if(salary == arr[mid].getSalary()) 
			{
				System.out.println("Employee Found at index = "+mid);
				System.out.println("Employee ID "+arr[mid].getEmpId());
				System.out.println("Employee Name = "+arr[mid].getName());
				System.out.println("Employee Salary = "+arr[mid].getSalary());	
				return mid;
			}
			else if(salary<arr[mid].getSalary())
			{
				right = mid-1;
			}
			else
			{
				left = mid+1;
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee[]arr = new Employee[5];
		
		arr[0] = new Employee(1 , "Abhi",65000);
		arr[1] = new Employee(6 ,"Akash",78500);
		arr[2] = new Employee(8 ,"Shiva",88500);
		arr[3] = new Employee(15,"Vaibhav",96000);
		arr[4] = new Employee(23,"Vinayak",100000);

		
		System.out.println("Enter ID = ");
		int KeyId = sc.nextInt();
		int empIdFountAtIndex = BinaryEmployeeSearchbyId(arr,arr.length,KeyId);
		if(empIdFountAtIndex == -1)
		{
			System.out.println("Element not found!!!!");
		}
		System.out.println("--------------------------------------------------------");
		
		
		System.out.println("Enter Name = ");
		String KeyName = sc.next();
		int empNameFountAtIndex = BinaryEmployeeSearchbyName(arr,arr.length,KeyName);
		if(empNameFountAtIndex == -1)
		{
			System.out.println("Element not found!!!!");
		}
		System.out.println("--------------------------------------------------------");

		
		System.out.println("Enter Salary = ");
		double KeySalary = sc.nextDouble();
		int empSalaryFountAtIndex = BinaryEmployeeSearchbySalary(arr,arr.length,KeySalary);
		if(empSalaryFountAtIndex == -1)
		{
			System.out.println("Employee not found!!!!");
		}
		System.out.println("--------------------------------------------------------");


	}
}
