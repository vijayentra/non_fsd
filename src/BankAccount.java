public class BankAccount {
	
	static String bankName = "IOB";
	String accountHolderName;
	String accountNumber;
	float Balance;
    
	public static void main(String[] args) {
		double loanInterestRate = 7.0; //local variable
		System.out.println(loanInterestRate);
		System.out.println(BankAccount.bankName);
		BankAccount account1 = new BankAccount();
		account1.accountHolderName = "vijay";
		account1.accountNumber = "123";
		account1.Balance=1000f;
		
		System.out.println(account1.Balance);
    
	}
	
}   