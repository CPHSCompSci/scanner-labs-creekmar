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
	   double tcups = numcups()*7;
	   amount = tcups/60;
   	return amount;
   }
   
   public double numcups()
   {
	   double cups = 0;
	   String[] pounds = line.split(" ");
	   for(int i = 0; i<pounds.length; i++)
	   {
		   int weight = Integer.parseInt(pounds[i]);
		   if(weight>=2 && weight<=4)
			   cups+=0.5;
		   else
			   if(weight>=5 && weight<=7)
				   cups+=1;
			   else
				   if(weight>=8 && weight<=9)
					   cups+=1.5;
				   else
					   if(weight>=10 && weight<=19)
						   cups+=2;
					   else
						   if(weight>=20 && weight<=39)
							   cups+=3.5;
						   else
							   if(weight>=40 && weight<=59)
								   cups+=4.5;
							   else
								   if(weight>=60 && weight<=79)
									   cups+=6;
								   else
									   if(weight>=80)
										   cups+=7.5;
	   }
	   return (cups);
   }

	public String toString()
	{
		return Math.ceil(getAmount()) + " of the 10 pound bags are needed.";
	}
}