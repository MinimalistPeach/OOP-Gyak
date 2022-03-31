package mypeople;

public class Kid extends Person {
	
	private static String School;
	
	
	public Kid(String name, int age, String skule) {
		super(name, age);

		this.School = skule;
	}



	public static String getSchool() {
		return School;
	}
	
	@Override
	public String Data()
	{
		return "Name: "+this.getName()+" Age: "+this.getAge()+" School: "+getSchool();
	}

	
}
