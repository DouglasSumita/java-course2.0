package entities;

public class BankAccount {
    
	public static final double TAX = 5.00; 
	private int id;
	private String holder;
	private double balance;
	
	public BankAccount() {
	}

	public BankAccount(int id, String holder, double initialDeposit) {
		this.id = id;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public BankAccount(int id, String holder) {
		this.id = id;
		this.holder = holder;
	}

	public int getId() {
		return id;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + TAX;
	}
	
	public String toString() {
		return "Account " + getId()
		       + ", Holder: " + getHolder()
		       + ", Balance: $ " + String.format("%.2f", getBalance());
	}   
}