//CSC 151-James Christenbury-Chap6 Ex8(QuizScoreStatistics)
//Date: 3-15-2020
/*This program utilizes the do-while loop and if..else statements to calculate quiz scores.
  This code generates the total number of quizzes entered by the user, the highest and lowest
  score, and the arithmetic average of all quiz scores entered.*/

import java.util.*;

public class QuizScoreStatistics
{
   public static void main(String[] args)
    {
	int score;
	int count = 0;
	double sum = 0;
	int lowest = Integer.MAX_VALUE;
	int highest = Integer.MIN_VALUE;

	Scanner input = new Scanner(System.in);
	System.out.println("Please enter a value from 0 to 10 or 99 to end program:");
	System.out.println("");
	
	do     //The do-while loop will execute the body as least one iteration before checking the conditions.
	{
	   score = input.nextInt(); 
           System.out.println(" ");

	   if(score < 0 || score > 10) 
	    {
	      
	      System.out.println("This score is invalid. Please enter a valid score:");
	      System.out.println("");
	         
	    }

	   else  //If value entered is between 0 and 10 or equal to them, then the loop executes.
	      {
		if(score > highest)                   //This statement will compare value entered in current iteration to
                     {                               //to the maximum value that was stored in the variable in previous
			highest = score;	     //iterations in the variable highest. If score is greater and within
		     }				     //the boundaries of the if statement, score will become highest. If not
						     //then higest remains the maximum value from previous iterations. Same 
		if(score < lowest)		     //rule applies to variable lowest.
		     {
			lowest = score;
		     }

			sum += score;
	      	        count++;
	      	        System.out.println("Please enter another score: ");
		        System.out.println(" ");
	
	       }
               
	  } 
	
	  while(score != 99);           //The condition is checked at the end of the body, and if the condition is met, the loop executes another iteration until condition is violated.
	
	  	System.out.println("The total number of quiz scores: " + count);
	  	System.out.println("The highest quiz score is: " + highest);
	  	System.out.println("The lowest quiz score is: " + lowest);
	  	System.out.println("The average score is: " + (sum/count));
	
     }
}