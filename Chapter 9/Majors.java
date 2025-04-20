//CSC 151-James Christenbury-Chap9 Ex9(Majors)
//Date: 4-4-2020
/*This program utilizes enumeration to display course majors coupled with a
  switch statement to display the division the major is in. The user types
  a string value which is compared to the enum and if the value of the input
  mathces the major, then the department division will be displayed.*/ 
  




import java.util.*;


enum Major
	{

	ACC, CHEM, CIS, ENG, HIS, PHYS;

	}

public class Majors
{
	

	public static void main(String[] args)
	{

		Major a = Major.ACC;
		System.out.println(a);

		Major b = Major.CIS;
		System.out.println(b);

		Major c = Major.CHEM;
		System.out.println(c);

		Major d = Major.PHYS;
		System.out.println(d);

		Major e = Major.HIS;
		System.out.println(e);

		Major f = Major.ENG;
		System.out.println(f);
		System.out.println("");
		
		Major g;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please choose a major:");
		System.out.println("");
		String name = input.next();
		g = Major.valueOf(name);

		switch(g)
		{
		case ACC:
		case CIS:
                System.out.println("This major is in the Business Division");
                break;
           	case CHEM:
           	case PHYS:
                System.out.println("This major is in the Science Division");
                break;
           	case ENG:
           	case HIS:
                System.out.println("This major is in the Humanities Division");
                break;
           	default:
                System.out.println("Not a valid major");
       	        }

		
		
	}


}
		