package col;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class ListPhones {

	public static void main(String[] args) throws Exception {
		Path first = Paths.get("e:\\classroom\\jwk\\phones.txt");

		List<String> lines = Files.readAllLines(first);
		TreeMap<String, String> dir = new TreeMap<>();

		for (String line : lines) {
			String parts[] = line.split(",");
			if (parts.length >= 2) {
				if (Pattern.matches("^\\d{10}$", parts[1]))  // valid mobile number
					dir.put(parts[0], parts[1]);
			}

		}

		for (String name : dir.keySet()) {
			System.out.printf("%-20s  %-10s\n", name, dir.get(name));
		}

	}

}
