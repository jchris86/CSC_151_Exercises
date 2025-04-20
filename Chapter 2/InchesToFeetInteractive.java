//James Christenbury
// 02/03/2020
// Program: Inches to Feet Interactive
/* This program uses the Scanner tool and variable declaration
   to convert inches to feet*/

import java.util.Scanner;

public class InchesToFeetInteractive 
	{
	  public static void main(String[] args)
	{ 
		int inch;
		int ft;
		int ft2;
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value of inch:");
		inch = input.nextInt();
		ft = inch/12;
		ft2 = inch%12;
		System.out.println(inch + " " + "inches" + " " + "is" + " " + ft + " " + "ft" + " " + "and" + " " + ft2 + " " + "inches");
	}
}

 
