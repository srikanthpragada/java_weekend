
public class SalariedEmployee extends Employee {
    protected int salary;
	public SalariedEmployee(String name, String desg,int salary) {
		 super(name, desg);
		 this.salary = salary;
	}
	
	@Override 
	public void print() {
		super.print();
		System.out.println(this.salary);
	}
	
	@Override
	public int getSalary() {
		return this.salary;
	}

}
