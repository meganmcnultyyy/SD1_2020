//Megan McNulty 20th April 2020
//Software Developement 1 - Project
//Exercise 7

import java.util.Random object;

public class exercise7{
  public int[] reorganize(int [] numbers){
	  Random rnd = new Random();
	  for (int i = numbers.length - 1; i >= 0; i--){
		  int index = rnd.nextInt(i + 1);
		  int a = numbers[index];
		  numbers[index] = numbers[i];
		  numbers[i] = a;
	  }
	  return numbers;


	}
}