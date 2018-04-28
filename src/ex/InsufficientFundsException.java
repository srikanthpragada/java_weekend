package ex;

public class InsufficientFundsException extends Exception {
  public InsufficientFundsException() {
	  super("Insufficient Funds!");
  }
  
  public InsufficientFundsException(String msg) {
	  super(msg);
  }
}


