//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenCounterRunner
{
   public static void main(String args[])
   {
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Please enter a set of numbers, separating each number with a space:");
	   OddEvenCounter set = new OddEvenCounter(scan.nextLine());
	   System.out.println(set.toString());
	}
}