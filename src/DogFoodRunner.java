//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class DogFoodRunner
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the weight of the dog each week, separating each number with a space: ");
		DogFood doggy = new DogFood(scan.nextLine());
		
	}
}