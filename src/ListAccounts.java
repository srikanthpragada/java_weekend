import java.util.Arrays;

public class ListAccounts {
	
	public static void  fun(Comparable c) {
		
	}

	public static void main(String[] args) {
		 SavingsAccount [] accounts = 
			 { 
					 new SavingsAccount(101,"Abcd"),
					 new SavingsAccount(3,"Xyz"),
					 new SavingsAccount(20,"De")
			 };
		 
		 fun(accounts[0]);
		 
		 Arrays.sort(accounts);
		 
		 for(SavingsAccount a : accounts)
			 System.out.println(a);
		 
		 

	}

}
