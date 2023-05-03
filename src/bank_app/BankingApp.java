package bank_app;

import java.util.Scanner;

public class BankingApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("No. of Account holders : ");
		int acc = sc.nextInt();
		Acc_details A[] = new Acc_details[acc];
		
		for(int i=0; i<A.length;i++)
		{
			A[i] = new Acc_details();
			A[i].openAccount();
		}
		int options;
		do
		{
			System.out.println("Banking");
			System.out.println("1. Display all account details \n "
					+ "2. Search by Account number\n "
					+ "3. Deposit the amount \n "
					+ "4. Withdraw the amount \n "
					+ "5.Exit ");
			System.out.println("Choose your service");
			options = sc.nextInt();
			switch (options) {
			case 1: 
				for(int i=0;i<A.length;i++)
				{
					A[i].showAcc();
				}break;
			case 2:
				System.out.println("Account Number :");
				String acc_no = sc.next();
				boolean present = false;
				for(int i = 0;i<A.length;i++)
				{
					present = A[i].search(acc_no);
					if(present)
						break;
				}
				if(!present)
					System.out.println("Account does not exist");
				break;
			case 3:
				System.out.println("Enter Account Number");
				acc_no = sc.next();
				present = false;
				for(int i = 0;i< A.length;i++)
				{
					present = A[i].search(acc_no);
					if(present)
					{	
						A[i].deposit();
						break;
					}
				}
				if(!present)
					System.out.println("Account does not exist");
				break;
			case 4:
				System.out.println("Enter Account Number");
				acc_no = sc.next();
				present = false;
				for(int i = 0;i< A.length;i++)
				{
					present = A[i].search(acc_no);
					if(present)
					{	
						A[i].withdraw();
						break;
					}
				}	
					if(!present)
						System.out.println("Account does not exist");
					break;
			case 5:
				System.out.println("Thank you for using our service");
			}
					
	}while(options !=5);
}
}
