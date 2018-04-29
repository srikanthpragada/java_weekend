package io;

import java.io.BufferedReader;
import java.io.FileReader;

public class PrintLargeNames {

	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("e:\\classroom\\jwk\\names.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
		   String line = br.readLine();
		   if ( line == null)
			   break;
		   if ( line.length() > 10)
			   System.out.println(line);
		}
		
		br.close();
		fr.close();
		

	}

}
