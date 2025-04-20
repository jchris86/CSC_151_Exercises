// CSC 151-James Christenbury-Ch4 Ex2 (Billing)
// Date: 02-22-2020
/* This programn utilizes three overloaded methods of various parameters
   to calculate the billing order for a photo book store */

import java.util.Scanner;

public class Billing
{
	public static void main(String[] args)
	{
	  Scanner input = new Scanner(System.in);
	  double price;
	  int quant;
	// The double coupon is pecent off and should be inputed as a decimal to get correct answer. 
	// For example, 50% would be inputed as .5.
	  double coupon;
	  
          System.out.println("What is the price in $:");

	  price = input.nextDouble();
	  computeBill(price);
	  
	  System.out.println("What is the quantity:");
	  quant = input.nextInt();
	  computeBill(price, quant);
	  
	  System.out.println("What is the value of the coupon");
	  coupon = input.nextDouble();
	  computeBill(price, quant, coupon);

	  
	}
	public static void computeBill(double price)
	{
	  System.out.println("The total price is $" + (price + (price * 0.08)));
	  System.out.println();
	}
	public static void computeBill(double price, int quant)
	{
	  System.out.println("The total cost is $" + ((price * quant) + (price * quant) * 0.08));
	  System.out.println();
	}
	public static void computeBill(double price, int quant, double coupon)
	{
	  System.out.println("The total cost after coupon savings is $" + (((price * quant) + - + (price * quant * coupon)) + ((((price * quant) + - + (price * quant * coupon))) * 0.08)));
	  System.out.println();
	}
}

	
	