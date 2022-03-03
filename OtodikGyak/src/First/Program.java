package First;

public class Program {

	public static void main(String[] args) {
		Employee[] emps = { new Employee("Levente Fazekas", 100), new Employee("Baksa Erika Varga", 150),
                new Employee("Charles Heavy", 450), new Employee("Balage Bolyki", 10),
                new Employee("Laszlo Smid", 120) };

        printEmps(emps);
        System.out.println("Largest salary: "+highestSalary(emps));
        System.out.println("Salaries between 100 and 200: "+cntEmpsSalaryInterval(emps, 100, 200));

	}
	public static void printEmps(Employee[] emps)
	{
		for(Employee empis:emps) {
			System.out.println(empis);
		}
		
	}
	public static int cntEmpsSalaryInterval(Employee[] emps, int min, int max) {
	        int cnt = 0;
	        for (Employee emp : emps) {
	            if (emp.isSalaryInRange(min, max)) {
	                cnt++;
	            }
	        }
	        return cnt;
	}
	
	public static int sumTax(Employee[] emps)
	{
		int tax = 0;
		for(Employee emp: emps)
		{
			tax += emp.tax();
		}
		return tax;
	}
	
	public static Employee highestSalary(Employee[] emps)
	{
		Employee max = emps[0];
		for(int i = 1; i < emps.length; i++)
		{
			if(emps[i].isSalaryGreater(max)) {
				max = emps[i];
			}
		}
		return max;
	}

	
}
