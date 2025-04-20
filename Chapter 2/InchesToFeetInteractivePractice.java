
import java.util.*;

public class InchesToFeetInteractivePractice
{

public static void main(String args[])
	{
	Scanner input = new Scanner(System.in);

	int inches;
	int feet;

	System.out.println("Enter a value in inches:");
	inches = input.nextInt();
	feet = inches/12;

	System.out.println("The value in feet is " + feet + " feet and " + inches%feet + " inches.");
	}

}