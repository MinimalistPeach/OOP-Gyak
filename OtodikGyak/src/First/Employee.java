package First;

public class Employee {

	private String name;
	private int salary;
	
	public int getSalary() {
		return salary;
	}
	
	public void increaseSalary(int ammount)
	{
		salary += ammount;
	}
	
    public boolean isSalaryGreater(Employee employee) {
        return salary > employee.getSalary(); }
	
	public Employee(String name, int salary) {
        super();
        this.name = name;
        this.salary = salary;
    }

	public int tax()
	{
		return (int) (0.16*salary);
	}
	
	 public boolean isSalaryInRange(int min, int max) {
	        return salary >= min && salary <= max;
	    }
	
	@Override
	public String toString()
	{
		return "Employee [name=" + name +", salary="+ salary + ", tax() =" + "]";
	}
	


	String getName() {
	return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	

	public static void main(String[] args) {


	}



}
