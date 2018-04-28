package ex;

import java.util.Scanner;

public class AverageOfNumbers {

	public static void main(String[] args) throws InterruptedException {
		int sum = 0,count=0;
		Scanner s = new Scanner(System.in);

		for (int i = 1; i <= 5; i++ ) {
			String line = s.nextLine();
			try {
				int num = Integer.parseInt(line);
				sum += num;
				count++;
			} catch (NumberFormatException ex) {
                System.out.println("Invalid number!");
			}
		}

		System.out.println(sum / count);
		
		Thread.sleep(10000);
		

	}

}
