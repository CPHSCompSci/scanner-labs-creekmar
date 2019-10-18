//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;  

public class LineCounterRunner
{
   public static void main( String args[] )
   {	
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Input a set of numbers, separating each number with a space:");
	   LineCounter num = new LineCounter(scan.nextLine());
	   System.out.println(num.toString());
	}
}