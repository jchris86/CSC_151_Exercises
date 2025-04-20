//CSC 151-James Christenbury-Chap6 Ex2(EvenEntryLoop)
//Date: 3-13-2020
/*This program utilizes the while loop combined with an if else statement to ask 
  the user to input an even number, an odd number, or 999 to stop the program as 
  a way to demonstrate loop functions*/




import java.util.Scanner;

public class EvenEntryLoop
{
   public static void main(String[] args)
    {
	int x;
	Scanner input = new Scanner(System.in);
	System.out.println("Please input an even number or 999 to stop:");
	System.out.println(" ");
	x = input.nextInt();

	while(x != 999)
	 {

	   if(x %2 == 0)
	     System.out.println("Good job!");
	   else
	     System.out.println("Error");

	   System.out.println("Please enter another number or 999 to stop:");
	   x = input.nextInt();

	 }
	
     }
}
