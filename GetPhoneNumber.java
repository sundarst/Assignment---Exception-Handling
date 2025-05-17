import java.util.InputMismatchException;
import java.util.Scanner;
public class GetPhoneNumber
{
public static void main(String args [])
{
Scanner scan = new Scanner(System.in);
System.out.println("Enter the Phone Number");

try
{
	String phoneNumber=scan.nextLine();	
	
	if(phoneNumber.length()!=10)
	{
		throw new InputMismatchException("Invalid Number");
	}
	if(!phoneNumber.matches("\\d+"))
	{
		throw new InputMismatchException("Enter Number only");
	}
	System.out.println("Number: "+phoneNumber);
}
catch(InputMismatchException e)
{
	System.out.println("Error :"+e.getMessage());
}

}

}