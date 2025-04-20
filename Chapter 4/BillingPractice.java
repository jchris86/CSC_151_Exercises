import java.util.*;

public class BillingPractice
{

  public static void main(String[] args)
  {
	Scanner input = new Scanner(System.in);

	System.out.println("Enter photobook price: ");
	double price = input.nextDouble();
	System.out.println("Total price with tax is: " + computeBill(price));

	System.out.println("Enter the quantity you want to order:");
	int quant = input.nextInt();
	System.out.println("Total price is: " + computeBill(price, quant));

	System.out.println("Enter the coupon value:");
	double coupon = input.nextDouble();
	System.out.println("The total price is: " + computeBill(price, quant, coupon));
		
   }

   public static double computeBill(double price)
   {
	double totalp = (price * .08) + price;
	return totalp; 
   }
   public static double computeBill(double price, int quant)
   {
	double totalqp = (price * quant) + ((price * quant) * .08);
	return totalqp; 
   }
   public static double computeBill(double price, int quant, double coupon)
   {
	double totalc = (((price * quant) - (price * quant * coupon)) + (price * quant * coupon * .08));
	return totalc;
   }

}