package mypeople;

public class Employee extends Adult {
	
	private static int salary;
	private static int retirement = 65;
	
	public Employee(String name, int age, String wp, int salary)
	{
		super(name, age, wp);
		this.setSalary(salary);
		
	}

	public static int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String Data()
	{
		return "Name: "+this.getName()+" Age: "+this.getAge()+" Workplace: "+this.getWorkPlace()+" Salary: "+getSalary();
	}

}
