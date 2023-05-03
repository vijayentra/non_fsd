package bank_app;

import java.util.Scanner;

public class Acc_details {
	private String accno;
	private String name;
	private long balance;
	
	Scanner sc = new Scanner(System.in);
	
	public void openAccount()
	{
		System.out.println("Account No. : ");
		accno = sc.next();
		System.out.println("Name: ");
		name = sc.next();
		System.out.println("Balance: ");
		balance = sc.nextLong();
	}
	
	public void showAcc()
	{
		System.out.println("NAME: "+name);
		System.out.println("ACCOUNT NO. :"+accno);
		System.out.println("BALANCE: "+balance);
	}
	public void deposit()
	{
		long amount;
		System.out.println("Enter amount to deposit: ");
		amount = sc.nextLong();
		balance += amount;
	}
	public void withdraw()
	{
		long amount;
		System.out.println("Enter amount to withdraw: ");
		amount = sc.nextLong();
		if(balance >= amount)
		{
			balance -= amount;
			System.out.println("Withdrawal of Rs. "+amount+" done succesfully");
			System.out.println("Your Balance : Rs."+balance);
		}
		else
		{
			System.out.println("Transaction failed");
			System.out.println("Your Balance below entered amount");
		}
		if(balance<=2000)
		{
			System.out.println("Your balance is below limit");
		}
	}
	 public boolean search(String ac_no) {  
	        if (accno.equals(ac_no)) {  
	            showAcc();  
	            return (true);  
	        }  
	        return (false);  
	    }
	
}
