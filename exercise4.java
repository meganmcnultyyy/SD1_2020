//Megan McNulty 20th April 2020
//Software Developement 1 - Project
//Exercise 4

import java.util.Scanner;

public class exercise4{
  public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int i = 0;
	int counter = 1;

	System.out.print("Enter a number from 1 to 10: ");
	i = input.nextInt();

	while (i < 1 && i > 10) {
		System.out.println("Invalid number entered. Please try again. ");
		System.out.print("Enter a number from 1 to 10: ");
		i = input.nextInt();
	}

	while (i >= 1 && i <= 10 && i >= counter) {
		System.out.println(counter+". Megan");
		counter++;
	}

	}
}
