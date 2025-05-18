import java.lang.Exception;
import java.util.Scanner;
import java.lang.Math;
class InsufficientBalanceException extends Exception
{ 
	public InsufficientBalanceException(String m)
	{
		super(m);
	
	}

}
class Bank
{
	String name;
	int depositAmount;
	int withdrawAmount;
	
	Bank(String name,int depositAmount,int withdrawAmount)
	{
		this.name=name;
		this.depositAmount=depositAmount;
		this.withdrawAmount=withdrawAmount;
	}
	
}

class Sbi extends Bank
{
	Sbi(String name,int depositAmount,int withdrawAmount)
	{
		super(name,depositAmount,withdrawAmount);
	}
		
	public  void sbiWithdraw() throws InsufficientBalanceException
	{    
		if(depositAmount<withdrawAmount)
		{
			throw new InsufficientBalanceException("Insufficient Balance");
		}
		else
		{
			int balance=depositAmount-withdrawAmount;
			
			System.out.println("Balace Amount: "+balance );
		}
	}

}

public class BankException
{

public static void main(String [] args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter name");
	String name = scan.nextLine();
	System.out.println("Enter deposit Amount");
	int depsit = scan.nextInt();
	System.out.println("Enter withdrawAmount");
	int withdraw= scan.nextInt();
	try
	{
	 Sbi sbi=  new Sbi(name,depsit,withdraw);
	 sbi.sbiWithdraw();
	 
	}
	catch(InsufficientBalanceException e)
	{
		System.out.println("Exception handling: "+e.getMessage());
	}
	
	
	
}
	
}




/*




*/
