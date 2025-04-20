// CSC 151-James Christenbury-Ch4 Ex 1(FormLetterWriter)
// Date: 02-22-2020
/* This program demonstrates the use of overloaded methods with
   string parameters to display a salutation */

import java.util.Scanner;

public class FormLetterWriter
{
    public static void main(String[] args)
     {
	Scanner input = new Scanner(System.in);
	String firname; 
	String lasname; 

	System.out.println("What is the last name?");
	System.out.println();
	lasname = input.next();
	System.out.println();
	displaySalutation(lasname);
	System.out.println();

	System.out.println("What is the first name and last name?");
	System.out.println();
	firname = input.next();
	lasname = input.next();
	System.out.println();
	displaySalutation(firname, lasname);
     }
	
     
	public static void displaySalutation(String lasname)
     
      	{
	  System.out.println("Dear Mr. or Mrs. " + lasname);
	  System.out.println("Thank you for your recent order");
	  System.out.println();
	}
 
        public static void displaySalutation(String firname, String lasname)
       {
	 System.out.println("Dear " + firname + " " + lasname); 
	 System.out.println("Thank you for your recent order");
      }
}