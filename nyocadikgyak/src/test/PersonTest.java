package test;

import java.util.Scanner;

import mypeople.Adult;
import mypeople.Person;
import mypeople.Kid;
import mypeople.Employee;

public class PersonTest extends Person {

	public static void main(String[] args) {
		readPerson();
	}
	
	public static Person readPerson()
	{
		Scanner input = new Scanner(System.in);
		Person p = new Person();
		boolean ok;
		
		do {
			ok = true;
			System.out.println("Give me the person's details (Format: Name, age): ");
			try
			{
				String row = input.nextLine();
				String[] item = row.split(",");
				p.setName(item[0]);
				p.setAge(Integer.parseInt(item[1]));
			}
			catch(Exception e)
			{
				ok=false;
				System.out.println("Format: Name, age!!!");
			}
		}while(!ok);
		
		if(!p.isYounger(18))
		{
			Kid kid = new Kid(p.getName(), p.getAge(), "asd");
		}
		else
		{
			Adult aperson = new Adult(p.getName(), p.getAge(), Employee.getWorkPlace());
			if(Employee.getWorkPlace().isEmpty())
			{
				return aperson;
			}
			else {
				Employee emp = new Employee(aperson.getName(), aperson.getAge(), Employee.getWorkPlace(), Employee.getSalary());
				return emp;
			}
		}
		return p;
		
	}
	
	
	
	

}
