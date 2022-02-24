package harmadikgyak2;

import java.util.Scanner;

public class main {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		double a=0;
		double b=0;
		double c=0;
		boolean ok;
		do {
		 System.out.print("Equation constans, divided by comma: ");
		 String inString = input.nextLine();
		 String[] strArray = inString.split(",");
		 ok = true;
		 try {
		a = Double.parseDouble(strArray[0]);
		b = Double.parseDouble(strArray[1]);
		c = Double.parseDouble(strArray[2]);
		 }
		 catch (Exception e) {
		ok = false;
		 }
		} while (!ok);
		
		System.out.println("a: "+a+" b: "+b+" c: "+c);
		
		double d = calcD(a,b,c);
		
		System.out.println("Discriminant: "+d);
		
		if(d < 0)
		{
			System.out.println("No real result!");
		}
		else if (d ==0)
		{
			double result = (-1.0*b) / (2.0*a);
			System.out.println("One result: "+result);
		}
		else
		{
			double result1 = (-1.0*b) - Math.sqrt(d);
			result1 /= 2.0 * a;
			
			double result2= (-1.0*b) - Math.sqrt(d);
			result2 /= 2.0 * a;
			
			System.out.println("Result 1: "+result1+" Result2: "+result2);
		}

	}
	
	public static double calcD(double a, double b, double c)
	{
		return(Math.pow(b, 2) - (4.0*a*c));
	}

}
