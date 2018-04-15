
public class Employee {
	protected String name, desg;

	public Employee(String name, String desg) {
		super();
		this.name = name;
		this.desg = desg;
	}

	public void print() {
		System.out.println(name);
		System.out.println(desg);
	}

	public String getName() {
		return name;
	}

	public String getDesg() {
		return desg;
	}
	
	public int getSalary() {
		return 0;
	}

}
