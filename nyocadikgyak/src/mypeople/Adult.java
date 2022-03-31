package mypeople;

public class Adult extends Person {
	
	public String data = this.Data();
	private static String WorkPlace;
	
	public Adult(String name, int age, String workplace) {
		super(name, age);

		this.WorkPlace = workplace;
	}



	public static String getWorkPlace() {
		return WorkPlace;
	}
	
	@Override
	public String Data()
	{
		return "Name: "+this.getName()+" Age: "+this.getAge()+" Workplace: "+getWorkPlace();
	}

	
}
