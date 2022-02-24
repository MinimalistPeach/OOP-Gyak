package harmadikgyak3;

import java.util.Scanner;

public class main {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int a = 0, b = 0;
		char op = '-';
		boolean ok;
		do {
		 System.out.print("Ur calculation: ");
		 String inString = input.nextLine();
		 String[] strArray = inString.split(" ");
		 ok = true;
		 try {
		 a = Integer.parseInt(strArray[0]);
		 op = strArray[1].charAt(0);
		 b = Integer.parseInt(strArray[2]);
		 }
		 catch (Exception e) {
		ok = false;
		 }
		} while (!ok || op == '/' && b == 0);	
		
		calc(a,b,op);
		

	}
	
	public static void calc(int a, int b, char op)
	{
		switch(op)
		{
			case '+':
			System.out.println(" "+a+" +"+ " "+b+" = "+(a+b));
			break;
			case '-':
			System.out.println(" "+a+" -"+ " "+b+" = "+(a-b));
			break;
			case '*':
			System.out.println(" "+a+" *"+ " "+b+" = "+(a*b));
			break;
			case '/':
			System.out.println(" "+a+" :"+ " "+b+" = "+(a/b));
			break;
		}
		//System.out.println("Do you wish to continue? yessir/nopls");
	}

}
