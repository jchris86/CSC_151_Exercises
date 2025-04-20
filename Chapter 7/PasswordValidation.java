import java.util.*;

public class PasswordValidation
{
	public static void main(String[] args)
	{
		String password;
		Scanner input = new Scanner(System.in);


		while(true)
		{
			System.out.println("Enter password");
			System.out.println("");
			password = input.nextLine();

			if(upCase(password) < 2)
			{
				System.out.println("Invalid password: Need to have at least 2 upper case letters.");
				password = input.nextLine();
			}
		
			if(lowCase(password) < 3)
			{
				System.out.println("Invalid password: Need to have at least 3 lower case letters.");
				password = input.nextLine();
			}

			if(digitCount(password) < 1)
			{
				System.out.println("Invalid password: Need to have at least 1 digit.");
				password = input.nextLine();
			}
				break;

		}

			System.out.println("The password is correct. Password is:" + password);
	}


	public static int upCase(String password)
	{
		int count = 0;

		for(int x = 0; x < password.length(); ++x) 
		{
			if(Character.isUpperCase(password.charAt(x)))
			{
			count++;
			}
		}
			return count;
	}

	public static int lowCase(String password)
	{
		int count = 0;

		for(int x = 0; x < password.length(); ++x)
		{
			if(Character.isLowerCase(password.charAt(x)))
			{
				count++;
			}
		}
			return count;
	}

	public static int digitCount(String password)
	{
		int count = 0;

		for(int x = 0; x < password.length(); ++x)
		{
			if(Character.isDigit(password.charAt(x)))
			{
				count++;
			}
		}
			return count;
	}

}



