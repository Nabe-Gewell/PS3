package base;

public class Test {

	public static void main(String[] args) throws InsufficientFundsException {
		Account acct0 = new Account(1122, 20000);
		acct0.setAnnualInterestRate(4.5);
		acct0.withdraw(2500);
		acct0.deposit(3000);

		System.out.println("Balance: " + String.format("%.2f", acct0.getBalance()));
		System.out.println("Monthly interest rate: " + acct0.getMonthlyInterestRate()+ "%");
		System.out.println("Date of account creation: " + acct0.getDateCreated());
		
	}

}