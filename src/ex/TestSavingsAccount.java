package ex;

public class TestSavingsAccount {

	public static void main(String[] args) {
		SavingsAccount sa1 = new SavingsAccount(101, "Mr. Steven");
		SavingsAccount sa2 = new SavingsAccount(102, "Mr. Steven");

		try {
			sa1.deposit(5000);
			sa1.withdraw(10000);
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}

	}

}
