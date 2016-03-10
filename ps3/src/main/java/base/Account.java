package base;
import java.util.Date;

	public class Account {

		private int id = 0;
		private double balance = 0;
		private double annualInterestRate = 0;
		private Date dateCreated = new Date();
		
		/*
		 * Accounts all have the same interest rate
		 */
		public static double generalAnnualInterestRate = 0;
		
		public Account() {
		}
		public Account(int specific_id, double ini_balance) {
			this.setId(specific_id);
			this.setBalance(ini_balance);
			this.annualInterestRate = generalAnnualInterestRate;
			this.dateCreated = new Date();
		}
		
		/*
		 * Getters & Setters
		 */
		public int getId() {
			return this.id;
		}
		
		public double getBalance() {
			return this.balance;
		}
		
		public double getAnnualInterestRate() {
			return this.annualInterestRate;
		}
		
		public Date getDateCreated() {
			return this.dateCreated;
		}
		
		public void setId(int set) {
			this.id = set;
		}
		
		public void setBalance(double set) {
			this.balance = set;
		}
		
		public void setAnnualInterestRate(double set) {
			generalAnnualInterestRate = set;
			this.annualInterestRate = set;
		}
		/*
		 * Monthly Interest rate
		 */
		public double getMonthlyInterestRate() {
			return (this.annualInterestRate / 12);
		}
		/*
		 * Withdrawing from account
		 */
		public void withdraw(double amount)
		throws InsufficientFundsException {
			if (amount > this.balance)
				throw new InsufficientFundsException(amount-balance);
			else
				this.balance -= amount;
		}
		/*
		 * Depositing to account
		 */
		public void deposit(double amount) {
			balance += amount;
		}
}