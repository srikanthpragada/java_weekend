package exer;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;

public class SortDates {

	public static void main(String[] args) {

     LocalDate dates[] = {
    		  LocalDate.of(2018, 1, 1),
    		  LocalDate.of(2011, 1, 11),
    		  LocalDate.of(2015, 11, 30),
    		  LocalDate.of(2017, 7, 30),
    		  LocalDate.of(2011, 2, 11)
     };
     
     Arrays.sort(dates ,
    		 // Anonymous inner class 
    		 new Comparator<LocalDate> () {
		        @Override
		        public int compare(LocalDate d1, LocalDate d2) {
                   return d2.compareTo(d1);
		        }
             }
     );
     
     // Lambda Expression 
     Arrays.sort(dates, (d1,d2) ->  d2.compareTo(d1));
     
     
     for(int i = 0; i < dates.length; i++ )
     {
    	 System.out.println( dates[i].format( DateTimeFormatter.ofPattern("yyyy-MM-dd")));
     }

	}

}
