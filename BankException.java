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
	int balanceAmount;
	int withdrawAmount;
	
	Bank(String name,int balanceAmount,int withdrawAmount)
	{
		this.name=name;
		this.balanceAmount=balanceAmount;
		this.withdrawAmount=withdrawAmount;
	}
	
}

class Sbi extends Bank
{
	Sbi(String name,int balanceAmount,int withdrawAmount)
	{
		super(name,balanceAmount,withdrawAmount);
	}
		
	public  void sbiWithdraw() throws InsufficientBalanceException
	{    
		if(balanceAmount<withdrawAmount)
		{
			throw new InsufficientBalanceException("Insufficient Balance");
		}
		else
		{
			int balance= balanceAmount-withdrawAmount;
			
			System.out.println("Balace Amount: "+balance );
		}
	}

}

public class BankException
{

public static void main(String [] args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter withdrawAmount");
	int withdraw= scan.nextInt();
	try
	{
	 Sbi sbi=  new Sbi("sundar",1000,withdraw);
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