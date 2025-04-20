//CSC 151-James Christenbury-Chap9 Ex1(StringSort)
//Date: 3-29-2929
/*This program uses string sorting packages to arrange string values into alphabetical order.
  The string values are inputed and displayed by use of for-loops to run through each value
  to be sorted and then sorts the values and outputs them in alphabetical order by way of
  another for-loop.*/


import java.util.*;

public class StringSort
{
	public static void main(String[] args)
	{
		String name[] = new String[5];
		int i;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 string values:");
		System.out.println("");
	        
		for(i = 0; i < 5; i++)
		{
			
			
			name[i] = input.next();
			
			
		}
		
		System.out.println("");
		System.out.println("List before sorting:");
		System.out.println("");

		for(i = 0; i < 5; i++)
		{
			System.out.println(name[i]);
		}

			Arrays.sort(name);
			System.out.println("");
			System.out.println("List after being sorted in alphabetical order:");
			System.out.println("");

		for(i = 0; i < 5; i++)
		{
			System.out.println(name[i]);
		}
	}
}

	