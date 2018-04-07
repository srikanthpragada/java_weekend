import java.util.Scanner;

public class FindDiscount {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Enter a code : ");
		int code = s.nextInt();
		int dis;

		switch (code) {
		case 1:
		case 2:
			dis = 15;
			break;
		case 3:
			dis = 20;
			break;
		case 4:
			dis = 12;
			break;
		default:
			dis = 25;
		} // switch

		System.out.println(dis);

	}

}
