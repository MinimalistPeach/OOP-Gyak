package mypeople;

public class Person {

	private String name;
	private int age;
	
	
	public Person(String name, int age)
	{
		super();
		this.name = name;
		this.age = age;
	}
	
	public Person()
	{
		super();
		this.name = " ";
		this.age = 0;
	}
	
	public String Data()
	{
		return "Name: "+this.name+"Age: "+this.age;
	}
	
	public boolean isYounger(int age)
	{
		if(age < this.age)
		{
			return true;
		}
		else {return false;}
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
}
