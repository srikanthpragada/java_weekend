package exer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) throws Exception {
		 
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter filename :");
		String filename = s.nextLine();
		File  sourceFile = new File(filename);
		
		String target = "tempfile";
		File  targetFile = new File(target);
		
		FileInputStream fis = new FileInputStream(sourceFile);
		FileOutputStream fos = new FileOutputStream(targetFile);
		
		while(true) {
			int ch = fis.read();
			if (ch == -1)
				break;
			fos.write(ch + 1);
		}
		
		fis.close();
		fos.close();
		
		sourceFile.delete();
		targetFile.renameTo(sourceFile);
		
		
	}

}
