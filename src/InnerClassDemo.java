
public class InnerClassDemo {
	private int v = 10;
	
	class AnotherClass {
		public void print() {
			System.out.println("Value of v = "  + v);
		}
	}
	
	public void m1() {
		AnotherClass o = new AnotherClass();
		o.print(); 
	}


	public static void main(String[] args) {
	   InnerClassDemo obj = new InnerClassDemo();
	   obj.m1();
	   
	}

}
