//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class DogFood
{
   private double amount;
   private double cups;
   private String line;

   public DogFood()
   {		
	   this.line = "";
		cups = 0;
		amount = 0;
   }

   public DogFood(String line)
   {
		this.line = line;
		cups = 0;
		amount = 0;

		//calc code goes here

   }

   public double getAmount()
   {
   	return amount;
   }

	public String toString()
	{
		return this.amount + " of the 10 pound bags are needed.";
	}
}