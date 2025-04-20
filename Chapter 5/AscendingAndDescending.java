//CSC-151-James Christenbury-Chap5 Ex2(AscendingAndDescending)
//Date: 3-9-20
/* This program uses the if statement, for loop, OR operator, and NOT operator
   to display integers inputed by the user in ascending 
   and descending order */

import java.util.*;

public class AscendingAndDescending
   {
	public static void main(String[] args)
	{
	   int num1;
	   int num2;
	   int num3;
	   int i;
	   int count=0;

	   Scanner input = new Scanner(System.in);
	   System.out.println("Please enter three random integers:");

	    num1 = input.nextInt();
	    num2 = input.nextInt();
	    num3 = input.nextInt();

	    System.out.println("The ascending order is:");

	    for(i=0;count!=3;i++)
	    {
		if(i==num1||i==num2||i==num3)
	         {
	             System.out.println(+i);
	             count++;
	          }
	         
	    }
	      System.out.println("The descending order is:");

	    for(i=0;count!=0;i--)
	    {
	        if(i==num1||i==num2||i==num3)
	         {
	             System.out.println(+i);
	             count--;
		 }
	    }
	    
	}

	
}
	
	

	

	   


