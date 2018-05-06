package col;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashSet;
import java.util.List;

public class Intersect {

	public static void main(String[] args) throws Exception {

		Path first = Paths.get("e:\\classroom\\jwk\\names.txt");
		Path second = Paths.get("e:\\classroom\\jwk\\names2.txt");

		List<String> names = Files.readAllLines(first);
		LinkedHashSet<String> commnames = new LinkedHashSet<>();

		for (String name : Files.readAllLines(second)) {
			if (names.contains(name))
				commnames.add(name);
		}

		for (String name : commnames)
			System.out.println(name);

	}

}
