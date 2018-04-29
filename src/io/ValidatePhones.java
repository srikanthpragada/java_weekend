package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Pattern;

public class ValidatePhones {

	public static void main(String[] args) throws Exception {
        File file = new File("e:\\classroom\\jwk\\phones.txt");
        if (!file.exists())
        {
        	System.out.println("File doesnot exist");
        	return;	
        }
		
		// ARM 
		try(FileWriter fw = new FileWriter("e:\\classroom\\jwk\\validphones.txt");
			FileReader fr = new FileReader("e:\\classroom\\jwk\\phones.txt");
			BufferedReader br = new BufferedReader(fr))
		{
			while (true) {
				String line = br.readLine();
				if (line == null)
					break;

				String parts[] = line.split(",");
				if (parts.length < 2)
					continue;

				// validate name
				if (parts[0].trim().length() == 0)
					continue;

				// Validate phone
				if (!validPhone(parts[1]))
					continue;

				fw.write(parts[0].trim() + " - " + parts[1].trim() + "\n");
			}
		} catch (Exception ex) {

		}
	}

	public static boolean validPhone(String phone) {
		return Pattern.matches("\\d{10}", phone);

		// phone = phone.trim();
		// if ( phone.length() != 10)
		// return false;
		//
		// // check all are digits
		// for(int i=0; i < 10; i ++)
		// if (!Character.isDigit(phone.charAt(i)))
		// return false;
		//
		// return true;

	}

}
