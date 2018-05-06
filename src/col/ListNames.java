package col;

import java.util.ArrayList;

public class ListNames {

	public static void main(String[] args) {
	    ArrayList<String>  names = new ArrayList<>();
	    
		names.add("Bill");
		names.add("Mike");
		names.add("Scott");
		names.add(0,"Malcome");
		names.add("Larry");
		names.add("Bill");
		names.remove(1);
		
		for (String s : names)
			System.out.println(s.toUpperCase());
		
		System.out.println( names.indexOf("Scott"));
		
		ArrayList  all = new ArrayList();
		all.add("Abc");
		all.add(10);
		
		String s = (String) all.get(0);
		
		
	}

}
