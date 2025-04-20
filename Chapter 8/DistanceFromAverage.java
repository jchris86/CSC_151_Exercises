//CSC 151-James Christenbury-Chap8 Ex2(DistanceFromAverage)
//Date:3-29-20
/*This program utilizes a do-while loop and for loop with nested if...else statements to
  prompt the user to enter any number of double values, all the way up to 15 numbers.
  The program calculates the average of the present iteration and measures the
  distance of the current value entered to the current average, then displays all values
  and their distance from the average after all values are inputed.*/


import java.util.*;
public class DistanceFromAverage
{
	public static void main(String[] args)
	{		
		double[] numArray = new double[15];
		double nums = 0;
		int count = 0;
		double sum = 0;
		double average = 0;
		int i = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number of double values up to 15 or enter 99999 to exit program:");
		System.out.println("");
		
		do
		{
			nums = input.nextDouble();

		if(count == 0 && nums == 99999)
		  	{
				System.out.print("Error: No values entered.");
		   		break;
		  	}

	       if(nums == 99999)
			{
				break;
			}
		else
			{
				numArray[count] = nums;
				sum += numArray[count];
				count++;
				average = (sum/count);
			}

		  }while(count < 15 && nums != 99999);

			System.out.println("");
			System.out.println("The average of all values entered is " + average);
			System.out.println("");
			System.out.println("The values and their distance from the average are:");
			System.out.println("");

		for(i = 0; i < count; i++)
		  {			
		        if(average > numArray[i])
			{
				System.out.println(numArray[i] + "       Distance of " + (average - numArray[i]) + " units from the average.");
				System.out.println("");		
			}
			else if(average < numArray[i])
			{
				System.out.println(numArray[i] + "       Distance of " + (numArray[i] - average) + " units from the average.");
				System.out.println("");	
			}
			else if(average == numArray[i])
			{
				System.out.println(numArray[i] + "       Distance of 0 units from the average.");
				System.out.println("");
			}   
                  }						
	}
}