// CSC-151-James Christenbury-Ch3 Ex 4b(NumbersDemo2)
// 02-16-2020
/* This application uses a main method that holds two variables, accepts values inputed by a user,
   and calls three methods within the main method to perform actions
   in accordance to each method name */

import java.util.Scanner;
public class NumbersDemo2
{
	public static void main(String[] args)
	{
	   int x;
	   int y;

	   Scanner input = new Scanner(System.in);
	   System.out.println("Input a value for x, hit ENTER, then input a value for y");
	   
	    x = input.nextInt();
	    y = input.nextInt();

	   displayTwiceTheNumber(x);
	   displayTwiceTheNumber(y);
	   displayTheNumberPlusFive(x);
	   displayTheNumberPlusFive(y);
	   displayTheNumberSquared(x);
	   displayTheNumberSquared(y);
	}
	public static void displayTwiceTheNumber(int x)
	
	{ 
	   System.out.println(x*2);
	}
	public static void displayTheNumberPlusFive(int x)
	{
	  
	   System.out.println(x+5);
	}
	public static void displayTheNumberSquared(int x)
	{
	   System.out.println(x*x);
	}
}


   