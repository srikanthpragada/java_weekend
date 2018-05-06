package col;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class LineFreq {

	public static void main(String[] args) throws Exception {
		Path first = Paths.get("e:\\classroom\\jwk\\languages.txt");

		List<String> lines = Files.readAllLines(first);
		TreeMap<String, Integer> langs = new TreeMap<>();

		for (String name : lines) {
			if (langs.containsKey(name)) {
				int count = langs.get(name);  // unboxing 
				count++;
				langs.put(name, count);
			} else
				langs.put(name, 1);
		}

		for (String name :langs.keySet()) {
			System.out.printf("%-20s  %d\n", name, langs.get(name));
		}

	}

}
