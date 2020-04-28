//Megan McNulty 20th April 2020
//Software Developement 1 - Project
//Exercise 6

import java.util.Scanner;

public class exercise6{
  public static void main(String[] args){
	Scanner input = new Scanner(System.in);
		char symbol='a';
		int rows = 0;
		int columns = 0;

		System.out.print("Enter a symbol: ");
		char symbol=input.next().charAt(0);
		System.out.print("Enter number of rows: ");
		rows = input.nextInt();
		System.out.print("Enter number of columns: ");
		columns = input.nextInt();

		while(rows == rows){
			while(columns == columns)
				System.out.print(symbol);
			}

	}
}
