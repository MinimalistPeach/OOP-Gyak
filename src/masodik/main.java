package masodik;

import java.util.Scanner;

public class main {

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		int arrsize= read(1,15);
		String[] names = new String[arrsize];

	}
	
	public static int read(int min, int max)
	{
		int num = 0;
		
		do {
			System.out.println("Give me a number between "+min+ " and "+max+ " !");
			while(!in.hasNextInt()){
				System.out.println("BAD!");
				in.next();
			}
			num = in.nextInt();
			in.nextLine();
		}while(num < min || num > max);
		
		return num;
	}
	
	public static void readNames(String[] names)
	{
		for(int i = 0; i < names.length; i++)
		{
			System.out.println("Name #" + (i+1) + ";");
			names[i] = in.nextLine();
		}
	}

}
