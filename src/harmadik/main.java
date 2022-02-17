package harmadik;

public class main {

	public static void main(String[] args) {
		int matrix[][] = { {1,2,3}, {4,5,6}, {69,70,71} };
		
		printMatrix(matrix);

	}
	
	public static void printMatrix(int[][] matrix)
	{
		for(int row = 0; row < matrix.length; row++)
		{
			System.out.print("[");
			for(int col = 0; col < matrix[row].length; col++)
			{
				System.out.println(matrix[row][col] + " ");

			}
			System.out.println("]");
		}
	}

}
