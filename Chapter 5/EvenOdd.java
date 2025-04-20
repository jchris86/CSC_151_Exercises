//CSC-151-James Christenbury-Ch5-Ex1(EvenOdd)
//Date: 3-9-20
/* This program uses the if and and else statements
   to determine if a number inputed is even or odd */

import java.util.Scanner;

public class EvenOdd
{
   public static void main(String[] args)
   {
	int num;
	Scanner input = new Scanner(System.in);
	System.out.println("Please input an integer:");
	System.out.println(" ");
	num = input.nextInt();
	
	if(num % 2 == 0)
	{
	   System.out.println("The integer inputed is even");
	}
	
	else
	{
	   System.out.println("The integer inputed is odd");
	}
   }
}