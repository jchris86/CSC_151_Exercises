//CSC 151-James Christenbury-Chap8 Ex2(DistanceFromAverage)
//Date:3-29-20
/*This program utilizes a do-while loop and nested if...else statements to
  prompt the user to enter any number of double values, all the way up to 15 numbers.
  The program calculates the average of the present iteration and measures the
  distance of the current value entered to the current average, which is displayed
  after each value is inputed.*/


import java.util.*;
public class DistanceFromAverage2
{

	public static void main(String[] args)
	{
		
		double x = 0;
		double average = 0;
		int count = 0;
		double sum = 0;
		double dis = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number of double values up to 15 or 99999 to exit program:");
		System.out.println("");
		
		do
		{
			

			x = input.nextDouble();
			System.out.println("");
			
		if(count == 0 && x == 99999)
			{
				System.out.println("Error: No numbers entered.");
				break;
			}

		if(x == 99999)
			{
				break;
			}
		else
			{

			sum += x;
			count++;
			average = (sum/count);
			dis = (average - x);
			System.out.println("The average is " + average);
			System.out.println("");
			}
		
		if(average > x)
			{

			System.out.println("The distance of " + x + " from average is " + (average - x));
			System.out.println("");

			}
		else
			{

			System.out.println("The distance of " + x + " from average is " + (x - average));
			System.out.println("");

			}

		if(count == 15 && average > x)

			{
			
				break;
			}

		else if(count == 15 && x < average)
			{
				
				break;
			}

		

		}while(count < 15);
			
	}
}