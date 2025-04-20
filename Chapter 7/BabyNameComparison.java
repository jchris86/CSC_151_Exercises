//CSC-151-James Christenbury-Chap7 Ex2(Baby Name Comparison)
//Date: 3-23-2020
/*This program utilizes the String class to create a program that asks for 
  three first names from the user and then concatenates them into all possible two
  name combinations.*/


import java.util.*;
public class BabyNameComparison
{
	public static void main(String[] args)
	{
		String name1;
		String name2;
		String name3;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter three first names:");
		System.out.println(" ");
		name1 = input.nextLine();
		name2 = input.nextLine();
		name3 = input.nextLine();

		System.out.println(" ");
		System.out.println("The first name combinations are:");
		System.out.println(" ");
		System.out.println(name1 + " " + name2);
		System.out.println(name1 + " " + name3);
		System.out.println(name2 + " " + name1);
		System.out.println(name2 + " " + name3);
		System.out.println(name3 + " " + name1);
		System.out.println(name3 + " " + name2);
	}
}
		