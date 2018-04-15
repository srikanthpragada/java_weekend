
public class TestEmployee {

	public static void main(String[] args) {
		Employee e = new SalariedEmployee("Abc","Programmer",150000);
		// e = new Consultant("Abc", "Programmer", 10, 1000);
		System.out.println( e.getSalary());
	
	}

}
