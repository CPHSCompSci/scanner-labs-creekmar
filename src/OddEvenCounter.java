//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenCounter
{
	private String line;
	Scanner scan = new Scanner(System.in);

   public OddEvenCounter()
   {
	   this.line = "";
   }

   public OddEvenCounter(String s)
   {
	   this.line = s;
   }

	public void setLine(String s)
	{
		this.line = s;
	}

	public int getEvenCount()
	{
		int count = 0;
		String[] set = this.line.split(" ");
		for (int i = 0; i<set.length; i++)
			if (set[i].indexOf(" ") != -1)
			{
				if (Integer.parseInt(set[i].substring(0, set[i].indexOf(" ")))%2 == 0)
					count++;
			}
			else
				if(Integer.parseInt(set[i])%2 == 0)
					count++;
			
		return count;
	}

	public int getOddCount()
	{
		int count = 0;
		String[] set = this.line.split(" ");
		for (int i = 0; i<set.length; i++)
			if (set[i].indexOf(" ") != -1)
			{
				if (Integer.parseInt(set[i].substring(0, set[i].indexOf(" ")))%2 == 1)
					count++;
			}
			else
				if(Integer.parseInt(set[i])%2 == 1)
					count++;
			
		return count;
	}

	public String toString( )
	{
		return this.line + "\nEven numbers: " + getEvenCount() + "\nOdd numbers: " + getOddCount();
	}
}