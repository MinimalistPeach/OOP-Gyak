package harmadikgyak1;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		int[] array = new int[10];
		fillArray(array, 0, 50);
		printArray(array);
		System.out.println("Greatest even num: "+greatestEven(array));
		System.out.println("Squares in array: "+cntSqrs(array));
		System.out.println("Gemotrical avarage: "+geoAvg(array));
		
		System.out.println(Arrays.toString(array));
		Arrays.parallelSort(array);
		System.out.println(Arrays.toString(array));
		int index = Arrays.binarySearch(array,  10);
		System.out.println("Index of 10 in array: "+index);
		if(index >= 0)
		{
			System.out.println("10 is in the array!");
		}
		else 
		{
			System.out.println("10 is not in the array!");
		}
		
		int[] rarray = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Array == rarray = "+Arrays.equals(array,  rarray));
		System.out.println("Array == array?  "+Arrays.equals(array,  array));
	}
	
	public static void fillArray(int[] array, int min, int max)
	{
		for(int i = 0; i < array.length; i++)
		{
			array[i] = (int)(Math.random() * (max-min+1) +min);
		}
	}
	
	public static void printArray(int[] array)
	{
		for(int elem: array)
		{
			System.out.print(elem + " ");
		}
		System.out.println();
	}
	
	public static int greatestEven(int[] array)
	{
		int max = Integer.MIN_VALUE;
		for(int elem : array)
		{
			if(elem % 2 == 0 && elem > max)
			{
				max = elem;
			}
		}
		return max;
	}
	
	public static int cntSqrs(int[] array)
	{
		int cnt = 0;
		
		for(int elem:array)
		{
			double sq = Math.sqrt(elem);
			if(sq == (int)sq)
			{
				cnt++;
				System.out.println(sq+" ");
			}
		}
		
		return cnt;
	}
	
	public static double geoAvg(int[] array)
	{
		double avg = 1;
		for(int elem: array)
		{
			avg *= elem;
		}
		
		return Math.pow(avg, 1.0 / (double) array.length);
	}

}
