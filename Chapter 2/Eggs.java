// James Christenbury
// 02/03/2020
/* This program uses the Scanner class to compute the price
   of the number of eggs inputed by the user */

import java.util.Scanner;

public class Eggs
	{
	  public static void main (String [] args)
	{
	  int numEggs, dozen, singles;
	  double total;
	  Scanner input = new Scanner(System.in);
	  System.out.println("How many eggs do you want to order?");
	  numEggs = input.nextInt();

	  if(numEggs < 0)
	{
	  System.out.println("Input not valid");
	}
	
	else

	{
	   if(numEggs >= 12)
		{
	   		dozen = numEggs/12;
	   		singles = numEggs%12;
		}
	
	else
	
		{ 
	  		dozen = 0;
	  		singles = numEggs;
		}

	  		total = dozen * 3.25 + (singles * 45)/100;
	  		System.out.println("Total order is " + numEggs + " eggs.\n");
	  		System.out.print("That comes to " + dozen + " dozen at $3.25 per dozen with "
		           		 + singles + " spare eggs at 45 cents each for a total of $" + total);
			}
		}
	}
	                   
