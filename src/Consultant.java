
public class Consultant extends Employee {
	protected int hours, rate;

	public Consultant(String name, String desg, int hours, int rate) {
		super(name, desg);
		this.hours = hours;
		this.rate = rate;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(hours);
		System.out.println(rate);
	}
	
	@Override 
	public int getSalary() {
		return hours * rate; 
	}

}
