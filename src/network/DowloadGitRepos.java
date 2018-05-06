package network;

import java.io.FileWriter;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class DowloadGitRepos {

	public static void main(String[] args) throws Exception {

		URL url = new URL("https://api.github.com/users/srikanthpragada/repos");
		InputStream input = url.openStream();
		Scanner s = new Scanner(input);
		String data = s.nextLine();

		FileWriter fw = new FileWriter("e:\\classroom\\jwk\\gitrepos.json");
		fw.write(data);
		fw.close();
		System.out.println("Downloaded Git Repos!");
	}
}
