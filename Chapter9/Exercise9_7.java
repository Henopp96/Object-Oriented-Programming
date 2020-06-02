import java.util.Date;

/*
 * Cody Henopp
 * 
 * 06/01/2020
 * 
 * This program creates an account and shows all needed information.
 */

public class Exercise9_7 {
	public static void main(String[] args) {
		Account account1 = new Account(20000 , 4.5 , 1122);
		System.out.println("The balance for id " + account1.getId() + " is $" + 
				account1.getBalance() + " and the Annual Interest Rate is " + 
				account1.getAnnualInterestRate() + "%. Which comes out to $" + (account1.getBalance() * (account1.getAnnualInterestRate() / 100)));
		
		Account account2 = new Account(20000, 4.5 , 1122);
		System.out.println("The original balance is $" + account2.getBalance() + 
				" and the monthly interest on that would be $" + account2.getMonthlyInterest()
				+ " and the date the account was created was " + account2.getDateCreated());
			
		
		System.out.println("The balance after withdrawal of $2,500 is $" + 
					account2.getwithdraw(2500) + " and after a deposit of $3,000 the new "
					+ "total is $" + account2.getdeposit(3000));
			
			
		
	}
}
	class Account{
		int id = 0;
		double balance = 0;
		double annualInterestRate = 0;
		Date dateCreated = new Date();
		
		Account() {
			
		}
		Account(double newBalance, double newAnnualInterestRate, int newId){
			balance = newBalance;
			annualInterestRate = newAnnualInterestRate;
			id = newId;
		}
		int getId() {
			return id;
		}
		void setId(int newId) {
			id = newId;
		}
		double getBalance () {
			return balance;
		}
		void setBalance(double newBalance) {
			balance = newBalance;
		}
		double getAnnualInterestRate() {
			return annualInterestRate;
		}
		void setAnnualInterestRate(double newAnnualInterestRate) {
			annualInterestRate = newAnnualInterestRate;
		}
		Date getDateCreated() {
			return dateCreated;
		}
		void setDateCreated(Date newDateCreated) {
			dateCreated = newDateCreated;
		}
		double getMonthlyInterestRate() {
			return ((annualInterestRate / 100) / 12);
		}
		double getMonthlyInterest() {
			return ((balance) * ((annualInterestRate / 100) / 12));
		}
		double getwithdraw(double amount) {
			balance = balance - amount;
			return balance;
		}
		double getdeposit(double amount) {
			return balance + amount;
		}
		
	}
