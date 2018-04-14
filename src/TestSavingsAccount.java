
public class TestSavingsAccount {

	public static void main(String[] args) {
		 SavingsAccount sa;  // object reference
		 
		 sa = new SavingsAccount(101,"Mr. Steven");  // object
//		 sa.deposit(10000);
//		 sa.deposit(5000);
//		 System.out.println( sa.getBalance());
	 
		 
		 SavingsAccount sa2 = new SavingsAccount(101,"Mr. Steven");
		 sa2.print();
		 
		 System.out.println( sa );
		 
		 sa = sa2;
		 
		 sa.print();
		 sa2.print();
		 
		 
		 SavingsAccount list[] = new SavingsAccount[5];
		 list[0] = new SavingsAccount(1,"Abc");
		 list[0].print(); 
		 
		 
		 
		 
		 
		 
	}

}
