
public class ThisDemo {

	public static void main(String[] args) {
		 
		SavingsAccount s1 = new SavingsAccount(1,"Abc");
		SavingsAccount s2 = new SavingsAccount(2,"Xyz");
		
		System.out.println( s1.getBalance());
		System.out.println( SavingsAccount.getMinBalance());
		
	}

}
