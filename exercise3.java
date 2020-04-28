//Megan McNulty 20th April 2020
//Software Developement 1 - Project
//Exercise 3

import java.util.Scanner;

public class exercise3{
  public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int age1 = 21;
	int age2 = 0;

	System.out.print("Enter your age: ");
	age2 = input.nextInt();

	if(age1 > age2){
		System.out.println("Your age ("+age2+") is less than my age("+age1+").");
	}else if (age1 < age2){
		System.out.println("Your age ("+age2+") is greater than my age("+age1+").");
	}else if(age1 == age2){
		System.out.println("We are the same age");
	}

}
}
