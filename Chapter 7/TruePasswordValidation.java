import java.util.*;
public class TruePasswordValidation
{
	public static void main(String[] args)
	{
		String password;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter password:");
		System.out.println(" ");

		while(true){
			password = input.nextLine();
			if(UpCase(password) >= 3)
			{
				
			}
			else{
				System.out.print("Password needs 3 upper case letters. Try again: ");
				continue;	
			    }
			if(LoCase(password) >= 3)
			{
				
			}
			else{
				System.out.print("Password needs 3 lower case letters. Try again: ");
				continue;
			    }
			if(Digit(password) >= 5)
			{
				
			}
			else{
				System.out.print("Password needs 5 digits. Try again: ");
				continue;	
			    }
			if(Special(password) >= 4)
			{
				
			}
			else{
				System.out.print("Password needs 4 special characters. Try again: ");
				continue;
			    }	
				break;					
			}
				System.out.println("The password is correct");		
	}

	public static int UpCase(String password)
	{
		int count = 0;
		for(int i = 0; i < password.length(); i++)
		{
			if(Character.isUpperCase(password.charAt(i)))
			{
				count++;
			}
		}
			return count;
	}
	public static int LoCase(String password)
	{
		int count = 0;
		for(int i = 0; i < password.length(); i++)
		{
			if(Character.isLowerCase(password.charAt(i)))
			{
				count++;
			}
		}
			return count;
	}
	public static int Digit(String password)
	{
		int count = 0;
		for(int i = 0; i < password.length(); i++)
		{
			if(Character.isDigit(password.charAt(i)))
			{
				count++;
			}
		}
			return count;
	}
	public static int Special(String password)
	{
		int count = 0;
		for(int i = 0; i < password.length(); i++)
		{
			if(!Character.isLetterOrDigit(password.charAt(i)))
			{
				count++;
			}
		}
			return count;
	}
		
}			