import java.lang.Exception;
class InvalidAgeException extends Exception
{
	public InvalidAgeException(String m)
	{
		super(m);
	}
	
}
public class  CustomException
{
	public static void main(String args [])
	{
		int age =16;
		try
		{
			if(age<18)
			{
				throw new InvalidAgeException("Age must be 18 above");
			}
			System.out.println("Age is egligible: "+ age);
		}
		catch(InvalidAgeException e)
		{
			System.out.println("Catch Exception: "+e.getMessage());
		}
		finally
		{
			System.out.println("Program End");
		}
		
	}

}