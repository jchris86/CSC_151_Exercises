//CSC 151-James Christenbury-Chap8 Ex1(NineInts)
//Date: 3-28-2020
/*This program utilizes an integer array that sorts nine integers inputed by the user
  and is then sorted by array sort method to arrange the integers in the array in both
  ascending and descending order.*/




import java.util.*;
public class NineInts
{
	public static void main(String[] args)
	{
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter nine integers: ");
		 System.out.println(" ");
		 int a = input.nextInt();
		 int b = input.nextInt();
		 int c = input.nextInt();
		 int d = input.nextInt();
		 int e = input.nextInt();
		 int f = input.nextInt();
		 int g = input.nextInt();
		 int h = input.nextInt();
		 int i = input.nextInt();
		 int array[] = {a,b,c,d,e,f,g,h,i}; 
		 Arrays.sort(array);

		System.out.println(" ");
		System.out.println("Ascending order is:");
		System.out.println(" ");

	for(int x = 0; x <= array.length-1; x++)
		{

		System.out.println(array[x]);

		}

		System.out.println(" ");
		System.out.println("Descending order is ");
		System.out.println(" ");

	for(int x = array.length-1; x >= 0; x--)
		{

		System.out.println(array[x]);

		}
	}
}

	
		