package col;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.StringJoiner;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class ListPhones2 {

	public static void main(String[] args) throws Exception {
		Path first = Paths.get("e:\\classroom\\jwk\\phones.txt");

		List<String> lines = Files.readAllLines(first);
		TreeMap<String, LinkedHashSet<String>> dir = new TreeMap<>();

		for (String line : lines) {
			String parts[] = line.split("[,;:-]");

			if (parts.length < 2)
				continue;
			
			if (!Pattern.matches("^\\d{10}$", parts[1])) // valid mobile number
				continue;

			String name = parts[0];
			String phone = parts[1];

			if (dir.containsKey(name)) // does name exist
			{
				dir.get(name).add(phone); // add phone to existing list
			} 
			else // new name
			{
				LinkedHashSet<String> phones = new LinkedHashSet<>();
				phones.add(phone);
				dir.put(name, phones);
			}

		}

		for (String name : dir.keySet()) {
			System.out.printf("%-20s  %s\n", name, String.join(",", dir.get(name)));
		}

	}

}
