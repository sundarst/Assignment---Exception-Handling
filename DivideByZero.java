import java.util.*;
public class  DivideByZero 
{
public static void main(String args[])
{

try
{
	
	int d=10;
	int div=0;
	System.out.println(d/div);
}
catch(ArithmeticException  e)
{
	System.out.println("Exception catch: "+e);
}
finally
{
	System.out.println("Program End");
}


}

}