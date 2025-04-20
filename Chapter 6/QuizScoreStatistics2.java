//CSC 151-James Christenbury-Chap6 Ex8(QuizScoreStatistics)
//Date: 3-15-2020


import java.util.*;

public class QuizScoreStatistics2
{
   public static void main(String[] args)
    {
	int score;
	int count = 0;
	double sum = 0;
	int highest;
	int lowest;

	Scanner input = new Scanner(System.in);
	System.out.println("Please enter a value from 0 to 10 or 99 to end program:");
	System.out.println(" ");
	score = input.nextInt();

	highest = score;
	lowest = score;

	while(score != 99)
	{
	    if(lowest > score && score !=99)

	      	  {
	 		lowest = score;
	          }

	   	else if(highest < score && score != 99)

	          {
			highest = score;
	          }

	   if(score < 0 || score > 10)
	    {
	      System.out.println("This is not an appropriate score. Please enter a valid score or 99 to end program:");
	      System.out.println(" ");
	      score = input.nextInt();
	      System.out.println(" ");
	    }

	   else 
	    {
	      sum += score;
	      count++;
	      System.out.println("Enter another value from 0 to 10 or 99 to end program :");
	      System.out.println(" ");
	      score = input.nextInt();
	      System.out.println(" "); 

	      
	    }
	   	


	    }
	       

	  	System.out.println("The total number of quiz scores: " + count);
	  	System.out.println("The highest quiz score is: " + highest);
	  	System.out.println("The lowest quiz score is: " + lowest);
	  	System.out.println("The average score is: " + (sum/count));
     }
}