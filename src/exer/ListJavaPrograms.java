package exer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;

public class ListJavaPrograms {

	public static void main(String[] args) {
		String dir = "e:\\classroom\\jwk\\demo\\src";

		File folder = new File(dir);

		for (File f : folder.listFiles()) {
			if (f.getName().endsWith(".java")) {
				int lines = countLinesWithJava8(f);
				System.out.printf("%-25s   %3d\n", f.getName(), lines);
			}
		}
	}

	public static int countLines(File f) {
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			int count = 0;
			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				count++;
			}
			fr.close();
			return count;
		} catch (Exception ex) {
			return 0;
		}

	}
	
	public static int countLinesWithJava8(File f) {
		try {
		    return (int) Files.lines(f.toPath()).count();
		} catch (Exception ex) {
			return 0;
		}

	}

}
