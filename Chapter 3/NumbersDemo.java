// CSC-151-James Christenbury-Ch3 Ex 4a(NumbersDemo)
// 02-12-2020
/* This application uses a main method that holds two variables, assigns values
   to those variables, and calls three methods within the main method to perform actions
   in accordance to each method name */

public class NumbersDemo
{
	public static void main(String[] args)
	{
	   int x = 6;
	   int y = 14;

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


   