//Megan McNulty 20th April 2020
//Software Developement 1 - Project
//Exercise 8

import java.util.Scanner;

public class index{
  public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int num = 0;

	//ex1
	String name = "Mary";
	int age = 20;
	double weight = 65.48;
	String colour = "red";

	//ex2
	int num1 = 0;
	int num2 = 0;

	//ex3
	int age1 = 21;
	int age2 = 0;

	//ex4
	int ii = 0;
	int counter = 1;

	System.out.println("Select which exercise you would like to run: (0 to exit)");
	System.out.println("1. Exercise 1");
	System.out.println("2. Exercise 2");
	System.out.println("3. Exercise 3");
	System.out.println("4. Exercise 4");
	System.out.println("5. Exercise 5");
	num = input.nextInt();

	while(num != 0){
	switch (num){
		case 1:
			System.out.println(name+ " is " +age+ " years old.");
			System.out.println("She weighs " +weight+ " kilograms.");
			System.out.println("Her favourite colour is "+colour);
		break;

		case 2:
			System.out.print("Enter first number: ");
			num1 = input.nextInt();
			System.out.print("Enter second number: ");
			num2 = input.nextInt();

			System.out.println(num1+ " + " +num2+ " = "+(num1+num2));
			System.out.println(num1+ " - " +num2+ " = "+(num1-num2));
			System.out.println(num1+ " * " +num2+ " = "+(num1*num2));
		break;

		case 3:
			System.out.print("Enter your age: ");
			age2 = input.nextInt();

			if(age1 > age2){
			System.out.println("Your age ("+age2+") is less than my age("+age1+").");
			}else if (age1 < age2){
			System.out.println("Your age ("+age2+") is greater than my age("+age1+").");
			}else if(age1 == age2){
			System.out.println("We are the same age");
			}
		break;

		case 4:
			System.out.print("Enter a number from 1 to 10: ");
			ii = input.nextInt();

			while (ii < 1 && ii > 10) {
				System.out.println("Invalid number entered. Please try again. ");
				System.out.print("Enter a number from 1 to 10: ");
				ii = input.nextInt();
				}

			while (ii >= 1 && ii <= 10 && ii >= counter) {
				System.out.println(counter+". Megan");
				counter++;
				}
		break;

		case 5:
			int [] x = {20, 30, 40, 50};
			System.out.println("Sum Total: "+(x[0]+x[1]+x[2]+x[3]));
			System.out.println("Sum Product: "+(x[0]*x[1]*x[2]*x[3]));
	    	System.out.println("Sum Average: "+((x[0]+x[1]+x[2]+x[3])/4));
		break;


		default:
			System.out.println("Invalid Option. Please pick an exercise or 0 to exit.");

	}
	}

	}
}
