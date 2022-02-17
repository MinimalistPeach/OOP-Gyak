package negyedik;

import java.util.Scanner;

public class main {
	
	static Scanner in = new Scanner(System.in);

	

	public static void main(String[] args) {
		int pCnt = read(1,10);
		String[] names = new String[pCnt];
		String[][] emails = new String[pCnt][];
		readEmails(emails, names);
		printEmails(names, emails);
	}
	
	public static void readEmails(String[][] emails, String[] names)
	{
		for(int i = 0; i < names.length; i++)
		{
			System.out.println("Name #"+(i+1) + ":");
			names[i] = in.nextLine();
			System.out.println("How many emails does "+ names[i]+ " have?");
			int emailcnt = read(0,3);
			emails[i] = new String[emailcnt];
			for(int j = 0; j < emails[i].length; j++)
			{
				System.out.println("Email #"+(j+1)+ ":");
				emails[i][j] = in.nextLine();
			}
		}
	}
	
	public static void printEmails(String[] names, String[][] emails)
	{
		for(int i = 0; i < names.length; i++)
		{
			System.out.println(names[i]);
			for(String email : emails[i])
			{
				System.out.println("\t"+email);
			}
		}
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

}
