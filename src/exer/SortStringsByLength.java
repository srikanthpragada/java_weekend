package exer;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringsByLength {
	static class LengthCompare implements Comparator<String> {
		@Override
		public int compare(String s1, String s2) {
//			System.out.println(s1);
//			System.out.println(s2);
			return  s1.length() - s2.length();
		}
	}
	
	public static void main(String[] args) {
      String langs[] = {"JavaScript", "Java","Cobol","C#","Python"};
      
      //Arrays.sort(langs, new LengthCompare());
      Arrays.sort(langs);
      
      for(String s : langs)
    	  System.out.println(s);

	}

}
