//Megan McNulty 20th April 2020
//Software Developement 1 - Project
//Exercise 2

import java.util.Scanner;

public class exercise2{
  public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int num1 = 0;
	int num2 = 0;

	System.out.print("Enter first number: ");
	num1 = input.nextInt();
	System.out.print("Enter second number: ");
	num2 = input.nextInt();

	System.out.println(num1+ " + " +num2+ " = "+(num1+num2));
	System.out.println(num1+ " - " +num2+ " = "+(num1-num2));
	System.out.println(num1+ " * " +num2+ " = "+(num1*num2));
}
}
