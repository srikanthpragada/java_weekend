package col;

import java.util.TreeSet;

public class SortNames {

	public static void main(String[] args) {
	    TreeSet<String>  names = new TreeSet<>();
	    TreeSet<Integer>  marks = new TreeSet<>();
		
	    marks.add(10);
	    marks.add(20);
	    
		names.add("Bill");
		names.add("Mike");
		names.add("Scott");
		names.add("Malcome");
		names.add("Larry");
		names.add("Bill");
		
		for (String s : names)
			System.out.println(s.toUpperCase());
	}

}
