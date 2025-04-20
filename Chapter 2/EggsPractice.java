import java.util.*;

public class EggsPractice
{

public static void main (String args[])
	{
	int x;
	int dozen = 12;
	double drate = 3.25;
	double srate = 0.45;
	Scanner input = new Scanner(System.in);
	System.out.println("How many eggs would you like to order?");
	 x = input.nextInt();

	System.out.println("You ordered " + x + " eggs. That is " + (x/dozen) + " dozen eggs with " + (x%dozen) + " loose eggs. Your total cost will be $" + (x/dozen * drate + x%dozen * srate));
                            
	}

}

