//CSC 151-James Christenbury-Chap7 Ex4(ValidatePassword)
//3-28-2020
/*This program utilizes a while loop and nested if statements to measure character arrangement in a string.
  Separate methods for finding upper case letters, lower case letters, and numbers are used to find their
  respective and count the amount of their respected characters.*/

import java.util.*;
public class ValidatePassword
{

	public static void main(String[] args)
	{
		
		String pass;
		Scanner input = new Scanner(System.in);
			
	    while(true)
		{
			System.out.println("Please enter password:");
	        	System.out.println(" ");
			pass = input.nextLine();

		        if(upCaseCount(pass) < 2)
			  	{
					System.out.println("Invalid password: There has to be at least 2 upper case letters.");
					continue;
			  	}

			if(lowCaseCount(pass) < 3)
				{
					System.out.println("Invalid password: There has to be at least 3 lower case letters.");
					continue;
				}
			if(digitCount(pass) < 1)
				{
					System.out.println("Invalid password: There has to be at least 1 digit.");
					continue;
				}

				break;
		}
			System.out.println("Password is valid. Password entered is " + pass);
	} 
		
	public static int upCaseCount(String pass)
		{
			int count = 0;

		for(int i = 0; i < pass.length(); ++i)
		   {
			
			if(Character.isUpperCase(pass.charAt(i)))
			  {	
				count++;		
			  }

		   }
			return count;
		}
	public static int lowCaseCount(String pass)
		{	
			int count = 0;

		for(int i = 0; i < pass.length(); ++i)
		   {	
		        if(Character.isLowerCase(pass.charAt(i)))
			  {
					
				count++;
			  }
		    }
			return count;
		}
	public static int digitCount(String pass)
		{	
			int count = 0;

		for(int i = 0; i < pass.length(); ++i)
		   {					
			 if(Character.isDigit(pass.charAt(i)))

			  {	
				count++;	
			  }
		   }
			return count;

		}		  
			   
}





	
				