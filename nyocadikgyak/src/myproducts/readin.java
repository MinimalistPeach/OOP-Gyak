package myproducts;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class readin {
	static Scanner input= new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("How many product would you like to create?");
		int N=readInt();
		Product array[]= new Product[N];
		fill(array);
		
		
		
		Arrays.sort(array, new Comparator<Product>() {

            public int compare(Product o1, Product o2) {
                return o1.getGrossPrice() - o2.getGrossPrice();
            }

        });
		
		System.out.println("\n The array after sorting:");
		for(int i=0; i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		publisherWithMoreExpensiveBooks(array);
		

		
	}

	
	public static int readInt() {
		int beker=-1;
		do {
			while(!input.hasNextInt()) {
				System.out.println("Wrong input!");
				input.next();
				}
			beker=input.nextInt();
		}while(beker<0);
		
		input.nextLine();
		return beker;
	}
	
	public static int readIntVat() {
		int beker=-1;
		do {
			while(!input.hasNextInt()) {
				System.out.println("Wrong input!");
				input.next();
				}
			beker=input.nextInt();
		}while(beker<0 || beker > 27);
		
		input.nextLine();
		return beker;
	}
	
	public static String readString() {
		String beker=input.nextLine();
		return beker;
	}
	
	public static double readDouble() {
		double beker=-1;
		do {
			while(!input.hasNextDouble()) {
				System.out.println("Wrong input!");
				input.next();
				}
			beker=input.nextDouble();
		}while(beker<0);
		
		input.nextLine();
		return beker;
	}
	
	
	
	public static void fill(Product array[]){
		for(int i=0; i<array.length;i++) {
			System.out.println("Please give me the "+(i+1)+". product's type!(1 if book 2 if bread)");
			int eldont=readInt();
			if( eldont == 1) {
				System.out.println("Please give the "+(i+1)+". book's author!");
				String author=readString();
				System.out.println("Please give the "+(i+1)+". book's title!");
				String title=readString();
				System.out.println("Please give the "+(i+1)+". book's price!");
				int price=readInt();
				System.out.println("Please give the "+(i+1)+". book's pages!");
				int pages=readInt();
				System.out.println("Please give the "+(i+1)+". book's style!");
				String style= readString();
				array[i]= new Book(author, title, price, pages,style);
			}
			else {
				System.out.println("Please give the "+(i+1)+". bread's price!");
				int price=readInt();
				System.out.println("Please give the "+(i+1)+". bread's vat!");
				int vat=readIntVat();
				System.out.println("Please give the "+(i+1)+". bread's unit!");
				double unit=readDouble();
				System.out.println("Please give the "+(i+1)+". bread's name!");
				String name=readString();
				array[i]=new Bread(name,price,vat,unit);
			}
			
		}
	}
	
	
	public static void publisherWithMoreExpensiveBooks(Product array[]) {
		
		Book[] books = new Book[array.length];
		int index=0;
		for(int i=0; i<array.length;i++) {
			if(array[i] instanceof Book) {
				books[index]= (Book)array[i];
				index++;
				
			}
		}
		
		System.out.println("Authors with greater than 20huf/page unit price:");
		
		String[] authors = new String[books.length];
		
		int wealthyAuthor=0;
		
		for(int i=0; i<books.length;i++) {
			if(books[i] != null)
			{
				boolean contain= containe(books[i],authors);
				if(!contain && books[i].getUnitPrice()>20) {
					System.out.println(books[i].getAuthor());
					authors[wealthyAuthor]=books[i].getAuthor();
					wealthyAuthor++;
				}
				if(wealthyAuthor == 0)
				{
					System.out.println("Nobody has a single book that's unit price is 20huf/price or higher.");
				}
			}
			else {break;}
		}
		
}
	
	
	public static boolean containe(Book book, String[] books) {
		boolean contain=false;
		for(int i=0;i<books.length;i++) {
			if(books[i]!=null && books[i].equalsIgnoreCase(book.getAuthor())) {
				contain=true;
			}
		}
		return contain;
	}
	
}
