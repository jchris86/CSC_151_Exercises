import java.util.*;

public class NumbersDemoPractice2
{
public static void main(String args[])
{
	
	int x = 25;
	int y = 36;
	
	displayTwiceTheNumber(x);
	displayTwiceTheNumber(y);
	System.out.println("");
	displayNumberPlusFive(x);
	displayNumberPlusFive(y);
	System.out.println("");
	displayNumberSquared(x);
	displayNumberSquared(y);
}

public static void displayTwiceTheNumber(int x)
{
	System.out.println("Twice the number is " + (x*2));
	
}

public static void displayNumberPlusFive(int x)
{
	System.out.println("The number plus 5 is " + (x + 5));
	
}
public static void displayNumberSquared(int x)
{
	System.out.println("The number squared is " + (x*x));
	
}


}
	