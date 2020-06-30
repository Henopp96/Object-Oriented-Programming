import java.util.Scanner;
/*
 * Cody Henopp
 * 
 * 06/23/2020
 * 
 * This program asks you for an id and then gives you options to choose from on an ATM.
 */

public class Exercise10_7 {
	public static void main(String[] args) {
		boolean run = true;
		Account[] accountArray = new Account[10];
		for 
		(int i = 0; i<accountArray.length; i++) {
			accountArray[i] = new Account(100, i);
		}
		while (run) {
			Scanner input = new Scanner(System.in);




			System.out.println("Enter an id (1-9): ");
			int id = input.nextInt();



			while (run) {
				if(id <= 9) {
					System.out.println("Main Menu");
					System.out.println("1: Check Balance");
					System.out.println("2: Withdraw");
					System.out.println("3: Deposit");
					System.out.println("4: Exit");
				}
				else {
					System.out.println("Enter valid id (1-9): ");
					id = input.nextInt();
					System.out.println("Main Menu");
					System.out.println("1: Check Balance");
					System.out.println("2: Withdraw");
					System.out.println("3: Deposit");
					System.out.println("4: Exit");

				}
				int option = input.nextInt();
				if (option == 1) {
					System.out.println("Your balance is $" + accountArray[id].getBalance());
				}
				if (option == 2) {
					System.out.println("Enter an amount to withdraw: ");
					accountArray[id].getwithdraw(input.nextDouble());
					System.out.println("After withdrawal new balance is $" + accountArray[id].getBalance());
				}
				if (option == 3) {
					System.out.println("Enter an amount to deposit: ");
					accountArray[id].getdeposit(input.nextDouble());
					System.out.println("After deposit new balance is $" + accountArray[id].getBalance());
				}
				if (option == 4) {
					break;
				}

			}
		}	}
}

class Account{
	int id = 0;
	double balance = 0;
	Account () {

	}
	Account(double newBalance, int newId){
		balance = newBalance;
		id = newId;

	}
	int getId() {
		return id;
	}
	void setId(int newId) {
		id = newId;
	}
	double getBalance() {
		return balance;
	}
	void setBalance(double newBalance) {
		balance = newBalance;
	}
	double getwithdraw(double amount) {
		balance = balance - amount;
		return balance;
	}
	double getdeposit(double amount) {
		balance = balance + amount;
		return balance;
	}

}
