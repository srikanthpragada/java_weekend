import java.util.Scanner;

public class LearYear {

	public static void main(String[] args) {
		 
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a year : ");
		int year = s.nextInt();
		
		if ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			System.out.println("Leap Year");
		else
			System.out.println("Not a Leap Year");
		
	}

}
