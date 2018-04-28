class PrimeThread extends Thread {
	long num;
	public PrimeThread(long num) {
		this.num = num;
	}
	
	@Override 
	public void run() {
		 for(long i = 2; i <= num/2; i ++)
		 {
			 if ( num % i == 0)
			 {
				 System.out.printf("\n%d is not prime!", num);
				 return;
			 }
		 }
		 System.out.printf("\n%d is prime!", num);
	}
}

public class TestMT {
	public static void main(String[] args) {
		long nums[] = {19191991,232323211,223283233,238283721,997};
				
		 for(long n : nums) {
		      PrimeThread t = new PrimeThread(n);
		      t.start();
		 }
	}

}
