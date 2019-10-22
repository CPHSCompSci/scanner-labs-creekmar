//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.Math;

public class DogFoodRunner
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner scan = new Scanner(new File("DogFood.txt"));
		   for(;scan.hasNext();)
		   {
			   String line = scan.nextLine();
			   DogFood lc = new DogFood(line);
			   System.out.println(lc.toString());
		   }
	}
}