import java.util.*;
public class ValidDemo
{
  public static void main(String[] args)
  {
	Scanner input = new Scanner(System.in);
	String password;
	System.out.println("Enter password:");
	password = input.nextLine();

	while(true){
	System.out.println("Enter password:");
	password = input.nextLine();
	if(highCase(password) < 3){
		System.out.println("Need at least 3 upper case letters");
		continue;
			}
	if(lowCase(password) < 3){
		System.out.println("Need at least 3 lower case letters");
		continue;
		       }
	if(caseDigit(password) < 5){
		System.out.println("Need at least 5 digits");
		continue;
		       }
		break;
	}
		System.out.println("Password is valid");
	
  }

  public static int highCase(String password){
  int counter = 0;
  for(int i=0; i < password.length(); ++i)
  {
	if(Character.isUpperCase(password.charAt(i)))
        {
		counter++;
	}
		
  }
	return counter;
  }

  public static int lowCase(String password){
  int counter = 0;
  for(int i=0; i < password.length(); ++i)
  {
	if(Character.isLowerCase(password.charAt(i)))
        {
		counter++;
	}
		
  }
		return counter;
  }

  public static int caseDigit(String password){
  int counter = 0;
  for(int i=0; i < password.length(); ++i)
  {
	if(Character.isDigit(password.charAt(i)))
        {
		counter++;
	}

  }
		return counter;
  }

}
	