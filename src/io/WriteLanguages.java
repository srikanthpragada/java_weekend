package io;

import java.io.FileWriter;
import java.util.Scanner;

public class WriteLanguages {

	public static void main(String[] args) throws Exception {
		
		Scanner s = new Scanner(System.in);
		FileWriter fw = new FileWriter("e:\\classroom\\jwk\\langs.txt");
		
		while(true) {
			System.out.print("Enter Language [end to stop]:");
			String lang = s.nextLine();
			if (lang.equals("end"))
				break;
            fw.write(lang + "\n");
		}
	
		fw.close();

	}

}
