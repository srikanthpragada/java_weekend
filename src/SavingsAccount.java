
public class SavingsAccount {
	// Instance variables
	private int acno;
	private String customer;
	private double balance;
	// Class variable 
	private static int minBalance = 10000;

	public SavingsAccount(int acno, String customer) {
		super();
		this.acno = acno;
		this.customer = customer;
	}

	public SavingsAccount(int acno, String customer, double balance) {
		this(acno, customer); // Call constructor
		this.balance = balance;
	}

	// Methods
	public void print() {

		System.out.println(this.acno);
		System.out.println(this.customer);
		System.out.println(this.balance);
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		if (this.balance - minBalance >= amount)
			this.balance -= amount;
	}

	public double getBalance() {
		return this.balance;
	}

	public static int getMinBalance() {
  		return  SavingsAccount.minBalance;
	}

}
