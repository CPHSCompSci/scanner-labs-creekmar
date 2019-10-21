//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

import java.io.File;
import java.io.FileNotFoundException;

public class OddEvenCounterRunner
{
   public static void main(String args[]) throws FileNotFoundException
   {
	   Scanner scan = new Scanner(new File("OELine.txt"));
	   for(;scan.hasNext();)
	   {
		   String line = scan.nextLine();
		   LineCounter oc = new LineCounter(line);
		   System.out.println(oc.toString());
	   }
	
	}
}