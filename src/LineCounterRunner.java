//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException; 

public class LineCounterRunner
{
   public static void main( String args[] ) throws FileNotFoundException
   {	
	   Scanner scan = new Scanner(new File("LineCounter.txt"));
	   for(;scan.hasNext();)
	   {
		   String line = scan.nextLine();
		   LineCounter lc = new LineCounter(line);
		   System.out.println(lc.toString());
	   }
	}
}