package harmadik;

import java.util.Scanner;

public class main {

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		int matrix[][] = { {1,2,3}, {4,5,6}, {69,70,71} };
		
		printMatrix(matrix);
		System.out.println("Is your num in the matrix? "+find(matrix, read(0,100)));
		
		

	}
	
	public static void printMatrix(int[][] matrix)
	{
		for(int row = 0; row < matrix.length; row++)
		{
			System.out.print("[ ");
			for(int col = 0; col < matrix[row].length; col++)
			{
				System.out.print(matrix[row][col] + " ");

			}
			System.out.println("]");
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
	
	public static boolean find(int[][] matrix, int n)
	{
		for(int row = 0; row < matrix.length; row++)
		{
			for(int col = 0; col < matrix[row].length; col++)
			{
				if(matrix[row][col] == n)
				{
					return true;
				}
			}
		}
		return false;
	}

}
