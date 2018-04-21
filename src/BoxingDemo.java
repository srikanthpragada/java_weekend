import java.time.LocalDateTime;

public class BoxingDemo {

	public static void main(String[] args) {
		
		fun("Abc");
		fun(LocalDateTime.now());
		fun(10); 
		
		Integer iobj = 10;  // Autoboxing
		int v = iobj;       // Autounboxing 
		
	}
	
	static void fun(Object obj) {
		System.out.println(obj.getClass());
	}

}
