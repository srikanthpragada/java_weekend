import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		int num, cube;
		float a;
		
		
		a =  (float) 10.50;

		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		num = s.nextInt(); // read int from keyboard

		cube = num * num * num;
		System.out.printf("Cube of %d is %d\n", num, cube);

	}

}
