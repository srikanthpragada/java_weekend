package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CountAlpha {

	public static void main(String[] args) throws Exception {
		 
//		Scanner s = new Scanner(System.in);
//		System.out.print("Enter filename :");
//		String filename = s.nextLine();
		
		FileReader fr = new FileReader("e:\\classroom\\jwk\\names.txt");
		int ch, count = 0;
		
		while(true) {
			ch = fr.read();
			if (ch == -1)
				break;
			System.out.print((char)ch);
			if ( Character.isAlphabetic(ch))
				count++;
		}
		
		System.out.println("\nNo. of alphabets : " + count);
		fr.close();

	}

}
