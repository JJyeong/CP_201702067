package helloworld;

public class BankAccount {
	public String accountNumber;
	public String owner;
	public int balance;
	
	void deposit(int amount) {
		balance += amount;
	}
	
	void withdraw(int amount) {
		balance -= amount;
	}
	
	public String toString() {
		return Integer.toString(balance);
	}
	
	public int sendAccount(int amount, BankAccount otherAccount) {
		if (balance < amount)
			System.out.println("�ܱ��� �����մϴ�.");
		else {
			withdraw(amount);
			otherAccount.deposit(amount);
		}
		return otherAccount.balance;
	}
}
